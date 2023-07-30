package part15;

public class UseStringMethods {
	public static void main(String[] args) {
		UseStringMethods sample = new UseStringMethods();
		String str = "The String class represents character strings.";
		sample.printWords(str);
		sample.findString(str, "string");
		sample.findAnyCaseString(str, "string");
		sample.countChar(str, 's');
		sample.printContainWords(str, "ss");
	}
	
	public void printWords(String str) {
		if(str == null) return;
		
		String[] arr = str.split(" ");
		for(String tem : arr) {
			System.out.println(tem);
		}
	}
	
	public void findString(String str, String findStr) {
		if(str == null || findStr == null) return;
		
		int idx = str.indexOf(findStr);
		System.out.println(findStr + " is appeared at " + idx);
	}
	
	public void findAnyCaseString(String str, String findStr) {
		if(str == null || findStr == null) return;
		
		int idx = str.toLowerCase().indexOf(findStr);
		System.out.println(findStr + " is appeared at " + idx);
	}
	
	public void countChar(String str, char c) {
		if(str == null) return;
		
		char[] array = str.toCharArray();
		int count = 0;
		for(char ch : array) {
			if(ch == c) count++;
		}
		System.out.println("char '"+ c + "' count is " + count);
	}
	
	public void printContainWords(String str, String findStr) {
		String[] arr = str.split(" ");
		for(String tem : arr) {
			if(tem.contains(findStr)) {
				System.out.println(tem + " contains " + findStr);
			}
		}
	}
	
}
