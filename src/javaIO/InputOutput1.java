package javaIO;

import java.io.*;

public class InputOutput1 {

	public static void main(String[] args) {
		
//		File file = new File("C:\\JavaIO\\java.txt");
//		File file = new File("javaIO.txt");
		File dir = new File("C:\\JavaIO\\Dir");
		System.out.println(dir.exists());
		dir.mkdir();
		System.out.println(dir.exists());
	} 

}
