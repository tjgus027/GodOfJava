package part26.io;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
//		String pathName = "MAC/User/mac/day.txt";
		String pathName = File.separator + "Users/mac/opt";
		sample.checkPath(pathName);
	}
	
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());
	}
}
