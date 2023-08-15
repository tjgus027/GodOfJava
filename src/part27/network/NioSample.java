package part27.network;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
	public static void main(String[] args) {
		NioSample sample = new NioSample();
		sample.basicWriteAndRead();
	}

	public void basicWriteAndRead() {
		String fileName = "/Users/mac/opt/nio.txt";
		try {
			writeFile(fileName, "My first NIO sample.");
			readFile(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeFile(String fileName, String data) throws Exception {
		// 파일을 쓰기 위한 객체를 만들때 FileOutputStream 클래스에 선언된 getChannel 메소드 호출
		FileChannel channel = new FileOutputStream(fileName).getChannel();
		byte[] byteData = data.getBytes();
		// static으로 선언된 wrap 메소드를 호출하여 buffer 객체가 생성, 매개 변수는 바이트 배열
		ByteBuffer buffer = ByteBuffer.wrap(byteData);
		channel.write(buffer); // 버퍼 객체를 넘겨주면 write 메소드가 파일에 씀
		channel.close();
	}

	public void readFile(String fileName) throws Exception {
		// 파일을 읽기 위한 객체를 만들때 FileInputStream 클래스에 선언된 getChannel 메소드 호출
		FileChannel channel = new FileInputStream(fileName).getChannel();
		// allocate 메소드를 통해 버퍼 생성, 매개변수는 데이터가 기본적으로 저장되는 크기
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		channel.read(buffer); // read 메소드를 통해 데이터를 버퍼에 담음
		buffer.flip(); // 버퍼에 담긴 데이터의 가장 앞으로 이동
		while (buffer.hasRemaining()) { // 데이터가 남아있는지 확인하는 while문 실행
			System.out.print((char) buffer.get()); // 버퍼의 데이터를 get해서 출력
		}

		channel.close();
	}
}
