package part15;

import java.io.UnsupportedEncodingException;

public class StringSample {
	public static void main(String[] args) {
		StringSample sample = new StringSample();
		sample.convertUTF16();
	}
	
	/* String -> Byte[]
	 * Byte -> String */
	public void convertUTF16() {
		try {
			String str = "자바의 신 최고!!";
			
			byte[] array = str.getBytes("UTF-16");
			printByteArray(array);
			
			String str2 = new String(array, "UTF-16");
			System.out.println(str2);
			
		} catch (UnsupportedEncodingException e) { 
			//인코딩, 디코딩 시에 존재하지 않는 캐릭터셋의 이름을 지정하면 위 예외 발생
			e.printStackTrace();
			
		} catch (NullPointerException e) { //null 체크
			e.printStackTrace();
		}
	}
	
	//for-loop 돌며 해당 글자 바이트를 출력
	public void printByteArray(byte[] array) {
		for(byte data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
