package part26.io;

import static java.io.File.separator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManageTextFile {
	public static void main(String[] args) {
		ManageTextFile manager = new ManageTextFile();
		int numberCount = 10;
		String fullPath = separator+"godofjava"+separator+"text"+separator+"numbers.txt";
		manager.writeFile(fullPath, numberCount);
	}
	
	public void writeFile(String fileName, int numberCount) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i < numberCount; i++) {
				bufferedWriter.write(Integer.toString(i));
				bufferedWriter.newLine();
			}
			System.out.println("Write success!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}
