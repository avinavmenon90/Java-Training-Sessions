package JavaBasics;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFileConcepts {

	public static void main(String[] args) {
		
		String path = null;
		FileInputStream fis = null;
		FileReader fr = null;
		Scanner sc = null;
		int c=0;
		
 //1. Open a file using Desktop class
		
		try {
			path = "C:\\Users\\Avinav\\Downloads\\avinav.txt";
			
			File file = new File(path); //wrap the String path inside File object
			
			if(!Desktop.isDesktopSupported()) { //from  java.awt.Desktop package
				System.out.println("Desktop not supported");
			}
			
			Desktop desktop = Desktop.getDesktop();
			
			if(file.exists()) {
				desktop.open(file); //launch the file
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
//2. Read a file using FileInputStream class
		
		try {
			 path = "C:\\Users\\Avinav\\Downloads\\avinav.txt";
			
			File file = new File(path); //wrap the String path inside File object
			fis = new FileInputStream(file); //connection established with specified file
			
			System.out.println("File content using FileInputStream class: ");
			
			//read file
			while((c=fis.read())!= -1){ //while end-of-file hasn't been reached
				
				System.out.print((char)c); //convert ASCII value back to characters and print on same line
			}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				
				try {
					fis.close(); //close stream after use
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
 
		
//3. Read a file using BufferReader class
		
			try {
				 	File file = new File(path);
				 	
				 	BufferedReader br = new BufferedReader(new FileReader(file));
				 	
				 	System.out.println("file content using BufferReader class: ");
				 	
				 	while((c=br.read())!= -1) { //while end-of-file hasn't been reached
				 		
				 		System.out.print((char)c);
				 	}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
	

//4. Read a file using FileReader class	
			try {
				
				fr = new FileReader(path);
				System.out.println("File content using FileReader class: ");
				
				while((c=fr.read())!= -1) { //while end-of-file hasn't been reached
					
					System.out.print((char)c);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				
				try {
					fr.close(); //close FileReader obj after use
				} catch (IOException e) {
						e.printStackTrace();
				} 
			}

//4. Read a file using Scanner class			
			try {
				
				File file = new File(path);
				 sc = new Scanner(file);
				System.out.println("File content using Scanner class: ");
				
				while(sc.hasNextLine()) { //while end-of-file hasn't been reached
					
					System.out.println(sc.nextLine()); //print each line of the file
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				sc.close(); //close scanner object after use
			}
			
//4. Read a file using Java Nio package
			try {
				
				//read all the contents (lines) in the file into a List of stringss
				List<String> li = Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
				
				Iterator<String> it = li.iterator();
				
				while(it.hasNext()) {
					System.out.println("Reading file using Java Nio package: "+it.next()); //print file content using Iterator
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
 }	
