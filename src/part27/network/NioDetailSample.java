package part27.network;

import java.nio.IntBuffer;

public class NioDetailSample {
	public static void main(String[] args) {
		NioDetailSample sample = new NioDetailSample();
		sample.checkBuffer();
	}
	
	public void checkBuffer() {
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			for(int i = 0; i < 100; i++) {
				buffer.put(i);
			}
			System.out.println("Buffer Capacity = " + buffer.capacity());
			System.out.println("Buffer Limit = " + buffer.limit()); //position을 지정하지 않아 기본으로 넘긴 1024
			System.out.println("Buffer Position = " + buffer.position()); // 데이터를 추가하고 난 후 위치는 100
			buffer.flip(); //첫 위치로 이동
			System.out.println("Buffer Flipped!!"); 
			System.out.println("Buffer Limit = " + buffer.limit()); // filp 메소드가 현재 positoin값을 limit로 지정
			System.out.println("Buffer Position = " + buffer.position()); //맨 앞으로 이동해서 첫 위치는 0
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
