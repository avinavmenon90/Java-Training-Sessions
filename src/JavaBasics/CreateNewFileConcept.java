package JavaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFileConcept {

	public static void main(String[] args) throws FileNotFoundException {
		
		//specify path of new file to be created
		String path= "C:\\Users\\Avinav\\Downloads\\sample.txt"; 
		
	//1. using File:
		File file = new File(path);
		try {
			boolean flag = file.createNewFile(); //creates the new file in the path mentioned
			
			if(flag) {
				System.out.println("file created");
			}
			else
				System.out.println("file already present"); //prevent duplication of file
			
		} catch (IOException e) {
			e.printStackTrace();
		
			}
		
	//2. Using FileOutputStream along with Scanner:
	
		//take filename from user during execution
		Scanner sc = new Scanner(System.in); //from java.util.Scanner package
		
		System.out.println("Enter file name with path of file: ");
		
		String fileName = sc.nextLine(); //store filename from user 
		
		FileOutputStream fos = new FileOutputStream(fileName,true); //append file=true
		
		System.out.println("Enter file content:");
		String content = sc.nextLine(); //get the content of file from user into a variable
		
		byte[] b = content.getBytes(); //convert to bytes so it can be used by fileoutputstream obj
		
		try {
			fos.write(b); //write content into the file as bytes
			fos.close(); //close the stream after writing
			
			System.out.println("file is saved in the given path");
		} catch (IOException e) {
			System.out.println("Exception");
			e.printStackTrace();
		} 
		
		
	//3. Using Java nio package:	
		
		
		try {
			//get file path including name of the file to be created
			Path pathlocation = Paths.get("C:\\Users\\Avinav\\Downloads\\JavaNioFile.txt"); 
			
			//create the file
			Path newPath = Files.createFile(pathlocation); 
			System.out.println("New file created at: "+newPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //create the file

	}
	
}
