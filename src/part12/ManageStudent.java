package part12;

public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent ms = new ManageStudent();
		ms.checkEquals();
	}
	
	public void checkEquals() {
		Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		if(a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
