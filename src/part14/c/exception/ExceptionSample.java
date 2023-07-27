package part14.c.exception;

public class ExceptionSample {
	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
		sample.arrayOutOfBounds();
	}
	
	public void arrayOutOfBounds() {
		int[] intArray = null;
		try {
			intArray = new int[5]; //여기까지는 실행됨
			System.out.println(intArray[5]); //여기서 에러가 발생해 catch문으로 넘어감
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
	}
}
