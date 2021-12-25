package com.thoughtfocus.exception.customexception.checked;
import java.io.*;

public class ReadAndWrite {
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
		
	}
	void saveFile() throws FileNotFoundException{
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
		
	}

}

class Test{
	public static void main(String[] args) {
		ReadAndWrite rw =new ReadAndWrite();
		try {
			rw.readFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			rw.saveFile();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}
}
