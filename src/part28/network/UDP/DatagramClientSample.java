package part28.network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramClientSample {
	public static void main(String[] args) {
		DatagramClientSample sample = new DatagramClientSample();
		sample.sendDatagramSample();
	}

	public void sendDatagramSample() {
		for (int i = 0; i < 3; i++) {
			sendDatagramData("I liked UDP " + new Date());
		}
		sendDatagramData("EXIT");
	}

	public void sendDatagramData(String data) {
		try {
			// 데이터그램 소켓 객체를 생성 (기본 생성자 사용)
			DatagramSocket client = new DatagramSocket();
			// 데이터 받을 서버의 IP를 주소로 받음
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			byte[] buffer = data.getBytes();
			DatagramPacket packet =
					// 순서대로 보낼 데이터, 시작 위치, 데이터의 길이, 보낼 주소, 포트 번호를 생성자에 넣어 데이터를 전송하기 위한 객체 생성
					new DatagramPacket(buffer, 0, buffer.length, addr, 9999);
			client.send(packet); // 데이터 전송
			System.out.println("Client: Send data");
			client.close(); // 소켓 연결 종료를 위해 닫음
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
