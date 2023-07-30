package part15;

public class StringCompare {
	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		sample.checkMatch();
	}
	
	public void checkCompare() {
		String text = "Check value";
		String text2 = "Check value";
		
		if(text == text2) {
			//true문이 실행됨 -> 이유는?
			//자바의 String 경우 동일한 값을 갖는 객체가 있으면 이미 만든 객체를 사용하는 Constant Pool이 있기 때문
			System.out.println("text == text2 result is same.");
		} else {
			System.out.println("text == text2 result is different.");
		}
		
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
	}
	
	public void checkCompare2() {
		String text = "Check value";
		//String text2 = "Check value";
		//== 비교에서 생각하던 대로 나오려면 아래처럼 객체 생성해야 함
		String text2 = new String("Check value");
		
		if(text == text2) {
			System.out.println("text == text2 result is same.");
		} else {
			System.out.println("text == text2 result is different.");
		}
		
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
		
		//대소문자 무시하고 비교
		String text3 = "check value";
		if(text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same.");
		}
	}
	
	public void checkCompareTo() {
		String text = "a";
		String text2 = "b";
		String text3 = "c";
		
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}
	
	public void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1)); //매개 변수가 4개인 메소드
		System.out.println(text.regionMatches(5, compare1, 0, 2)); //매개 변수가 4개인 메소드
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4)); //매개 변수가 5개인 메소드
	}
}
