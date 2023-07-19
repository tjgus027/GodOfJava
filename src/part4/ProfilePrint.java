package part4;

public class ProfilePrint {
	//1-2. 인스턴스 변수 선언
	byte age;
	String name;
	boolean isMarried;
	
	//3. 나이 지정 메소드
	public void setAge(byte age){
		this.age = age;
	}
	
	//4. 나이를 리턴하는 메소드
	public byte getAge() {
		return age;
	}
	
	//5. 이름을 지정하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//6. 이름을 리턴하는 메소드
	public String getName(){
		return name;
	}
	
	//7. 결혼 여부를 지정하는 메소드
	public void setMarried(boolean flag) {
		this.isMarried = flag;
	}
	
	//8. 결혼 여부를 리턴s
	public boolean isMarried() {
		return isMarried;
	}
	
	//9. 클래스 실행할 수 있는 메인 메소드 생성
	public static void main(String[] args) {
		ProfilePrint pf = new ProfilePrint();
		pf.setAge((byte)20);
		pf.setName("정서현");
		pf.setMarried(false);
		
		System.out.println("나이는: " + pf.getAge());
		System.out.println("이름은: " + pf.getName());
		System.out.println("결혼 여부는: " + pf.isMarried());
	}
	
	
}
