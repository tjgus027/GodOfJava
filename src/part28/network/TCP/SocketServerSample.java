package part28.network.TCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
	public static void main(String[] args) {
		SocketServerSample sample = new SocketServerSample();
		sample.startServer();
	}

	public void startServer() {
		ServerSocket server = null;
		Socket client = null;
		try {
			// 포트 9999를 이용하여 서버 소켓 객체 생성 (다른 프로그램에서 서버로 접근하려면 9999포트 사용)
			server = new ServerSocket(9999);
			while (true) {
				System.out.println("Server: Waiting for request.");
				// 다른 원격 호출을 대기하는 상태에서 호출하여 연결 완료되면 리턴된 소켓 객체가 클라이언트가 됨
				client = server.accept();
				System.out.println("Server: Accepted.");
				// 클라이언트에서 input스트림 객체를 받아서 생성 (상대방에게 데이터 전송시 OutputStream 객체를 생성해 데이터 전달)
				InputStream stream = client.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));
				String data = null;
				StringBuilder receivedData = new StringBuilder();
				while ((data = in.readLine()) != null) {
					receivedData.append(data);
				}
				System.out.println("Received Data: " + receivedData);
				in.close();
				stream.close();
				client.close(); // 모든 데이터 처리가 끝난 후 소켓 사용을 종료하려 close 메소드 호출
				if (receivedData != null && "EXIT".equals(receivedData.toString())) {
					System.out.println("Stop SocketServer");
					break;
				}
				System.out.println("--------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close(); // 더 이상 소켓 수신할 필요가 없을때 서버소켓의 종료를 의미하는 close 메소드 호출
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
