package com.auribises.io;

import java.io.File;

public class FileAPI {

	public static void main(String[] args) {
		
		
		File file = new File("/Users/ishantkumar/Downloads/roti123.jpg");
		
		//file.createNewFile()
		
		if(file.exists()) {
			System.out.println("File Exists: "+file.getName());
			
			if(file.isFile()) {
				System.out.println(file.getName()+" is a File");
			}
			
			if(file.isDirectory()) {
				System.out.println(file.getName()+" is a Directory");
			}
			
		}else {
			System.out.println("Sorry File "+file.getName()+" does not exist");
		}
		
		

		//File file1 = new File("/Users/ishantkumar/Downloads/ATPL-Java-Batch");
		//file1.mkdir();
		//file1.delete();
		
		
		File file1 = new File("/Users/ishantkumar/Downloads/");
		
		/*String[] names = file1.list();
		for(String name: names) {
			if(name.endsWith(".png") || name.endsWith(".jpg")) {
				System.out.println(name);
			}
		}*/
		
		File[] files = file1.listFiles();
		for(File f: files) {
			if(f.isDirectory()) {
				System.out.println(f.getName());
			}
		}
		
		// Take the Path as Input from User
		// List all the documents, images, audios, videos as 4 different categories
		// Using File API of Java
	}

}
