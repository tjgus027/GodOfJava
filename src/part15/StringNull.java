package part15;

public class StringNull {
	public static void main(String[] args) {
		StringNull sample = new StringNull();
		sample.nullCheck2(null);
	}
	
	/* NullPointerException 발생 O 
	 * null인 객체가 메소드에 접근해서 예외 발생 O */
	public boolean nullCheck(String text) {
		int textLen = text.length();
		System.out.println(textLen);
		
		if(text == null) return true;
		else return false;
	}
	
	/* NullPointerException 발생 X 
	 * null인 객체가 메소드에 접근하기 전에 체크해서 리턴했기 때문에 예외 발생 X */
	public boolean nullCheck2(String text){
		if(text == null) return true;
		else {
			int textLen = text.length();
			System.out.println(textLen);
			return false;
		}
	}
}
