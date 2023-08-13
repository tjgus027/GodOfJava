package part26.io;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
	DecimalFormat formatter = null;
	public static void main(String[] args) {
		FileSizeSummary sample = new FileSizeSummary();
		String path = "/godofjava";
		long sum = sample.printFileSizes(path);
		System.out.println(path + "'s total size = " + sum);
	}
	
	private FileSizeSummary(){
		String pattern = "#,##0.0#";
		formatter = new DecimalFormat(pattern);
	}
	
	public long printFileSizes(String dirName) {
		File dir = new File(dirName);
		long sum = 0;
		if(dir.isDirectory()) {
			File[] fileList = dir.listFiles();
			for(File file : fileList) {
				if(file.isFile()) {
					String tempFilename = file.getAbsolutePath();
					long fileLength = file.length();
					System.out.println(tempFilename + " = " + fileLength);
					sum += fileLength;
				} else {
					String tempDirName = file.getAbsolutePath();
					long fileLength = printFileSizes(tempDirName);
					System.out.println("[" +tempDirName + "] = " + fileLength);
					sum += fileLength;
				}
			} 
		}
		return sum;
	}
	
	private final long KB = 1024;
	private final long MB = 1024*1024;
	private final long GB = 1024*1024*1024;
	
	private String convertFileLength(long fileLength) {
		if(fileLength < KB) {
			return fileLength + "b";
		} else if(fileLength < MB) {
			return formatter.format(1.0 * fileLength / KB) + "kb";
		} else if(fileLength < GB) {
			return formatter.format(1.0 * fileLength / MB) + "mb";
		} else {
			return formatter.format(1.0 * fileLength / GB) + "gb";
		}
	}
}
