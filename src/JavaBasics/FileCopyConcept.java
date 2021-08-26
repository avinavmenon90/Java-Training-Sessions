package JavaBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyConcept {

	/*
	 * Copy a file (pdf) and create a diff file in the same location
	 * 
	 */
	public static void main(String[] args) {
		
		copyFile(); //calling method to copy the file

}

public static void copyFile() {



	File origfile = new File("C:\\Users\\Avinav\\Downloads\\BETTER WATER.pdf");//path of 1st file
	File copyFile = new File ("C:\\\\Users\\\\Avinav\\\\Downloads\\\\BETTER WATER copy.pdf"); //path of copy file

	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;
	
	try {
		fileInputStream = new FileInputStream(origfile); //path of orig file
		fileOutputStream = new FileOutputStream(copyFile); //path of copy file
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
	
	try {
		System.out.println(fileInputStream.available()); //# of bytes
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//read contents of original file using while-loop
	int i=0;
	try {
		while ((i = fileInputStream.read())!= -1) { //read orig file 1 byte at a time
			
			fileOutputStream.write(i); //while content can be read, write to copy file
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	//add finally block to close the streams:
	finally {
		
		if(fileInputStream != null) {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(fileOutputStream != null) {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

 }

}
