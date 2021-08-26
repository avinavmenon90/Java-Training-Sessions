package JavaBasics;

import java.io.File;
import java.util.Arrays;

public class PrintFileNamesConcept {

	public static void main(String[] args) {


		String path = "C:\\Users\\Avinav\\Downloads"; //path of folder to print from

		File file = new File(path);
		
		//get a list of all files &folders in Downloads folder
		File[] downloadDirFiles = file.listFiles();
		
		//sort the File array above
		Arrays.sort(downloadDirFiles);
		
		//read each file in the array
		for(File e: downloadDirFiles) {
			if(e.isFile()) {
				System.out.println("File: "+e.getName()); //if object is a File, print its name
			}
			else if(e.isDirectory()) {
				System.out.println("Directory: "+e.getName()); //if object is a Directory, print its name
			}
			else {
				System.out.println("Unknown: "+e.getName()); //neither file nor folder
			}
		}
	}

}