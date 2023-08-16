package part28.network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerSample {
	public static void main(String[] args) {
		DatagramServerSample sample = new DatagramServerSample();
		sample.startServer();
	}

	public void startServer() {
		DatagramSocket server = null;
		try {
			// 9999 포트 번호로 객체 생성
			server = new DatagramSocket(9999);
			int bufferLength = 256;
			byte[] buffer = new byte[bufferLength];
			DatagramPacket packet =
					// 데이터를 받기 위한 객체를 바이트 배열과 정해둔 크기로 생성
					new DatagramPacket(buffer, bufferLength);
			while (true) {
				System.out.println("Server: Waiting for request");
				// 데이터를 받기 위해 대기 중, 데이터가 넘어오면 패켓 객체에 데이터 담음
				server.receive(packet);
				// 전송받은 데이터의 크기를 확인
				int dataLength = packet.getLength();
				System.out.println("Server: received. Data length = " + dataLength);
				// String 클래스의 생성자를 사용하여 바이트 배열 데이터를 String 문자열로 변경하여 출력
				String data = new String(packet.getData(), 0, dataLength);
				System.out.println("Received data: " + data);
				if (data.equals("EXIT")) {
					System.out.println("Stop DatagramServer");
					break;
				}
				System.out.println("---------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close(); // 모든 처리가 끝나면 소켓을 종료하기 위해 닫음
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
