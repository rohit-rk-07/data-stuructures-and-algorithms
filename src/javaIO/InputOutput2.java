package javaIO;

import java.io.File;

public class InputOutput2 {

	public static void main(String[] args) {
		
		String file1path = "C:\\JavaIO\\java.txt";
		String file2path = "javaIO.txt";
		String dirpath = "C:\\JavaIO\\Dir";

		File file = new File(dirpath);
	
//		System.out.println(file.getPath());
		System.out.println(file.getParent());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
		
	}

}
