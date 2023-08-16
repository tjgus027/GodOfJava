package part28.network.TCP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
	public static void main(String[] args) {
		SocketClientSample sample = new SocketClientSample();
		sample.sendSocketSample();
	}

	public void sendSocketSample() {
		for (int i = 0; i < 3; i++) {
			sendSocketData("I liked java at " + new Date());
		}
		sendSocketData("EXIT");
	}

	public void sendSocketData(String data) {
		Socket socket = null;
		try {
			System.out.println("Client: Connecting");
			// 매개변수의 전자는 IP, 후자는 포토 번호 / 포트 번호는 서버쪽에 지정한 포트번호와 동일해야 연결이 가능
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client: Connect status = " + socket.isConnected());
			Thread.sleep(1000);
			OutputStream stream = socket.getOutputStream(); // 데이터를 서버에 전달하는 용도
			BufferedOutputStream out = new BufferedOutputStream(stream);
			byte[] bytes = data.getBytes();
			out.write(bytes);
			System.out.println("Client: Sent data");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close(); // 데이터를 전부 전달하고 소켓을 종료하기 위해 닫음
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
