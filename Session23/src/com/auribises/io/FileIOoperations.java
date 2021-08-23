package com.auribises.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOoperations {
	
	public void writeDataInFile(String filePath, String dataToWrite) {
		
		// Work with Text i.e. Character
		
		try {
			File file = new File(filePath);
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // enable append mode
			writer.write(dataToWrite); // write as String
			writer.close();
			System.out.println("Data Written in File "+file.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void readDataFromFile(String filePath) {
		
		// Work with Text i.e. Character
		
		try {
			File file = new File(filePath);
			
			FileReader reader = new FileReader(file); // character by character
			BufferedReader buffer = new BufferedReader(reader); // to read data from file line by lime
			
			//String line = buffer.readLine();
			
			String line = "";
			while((line = buffer.readLine()) != null) {
				//System.out.println(line);
				//if(line.startsWith("import")) {
				if(line.contains("new") && !line.startsWith("//")) {
					System.out.println(line);
				}
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void writeDataInFileAgain(String filePath, String dataToWrite) {
	
		// Work with Bytes
		
		try {
			File file = new File(filePath);
			
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);
			stream.write(dataToWrite.getBytes()); // writer as bytes
			stream.close();
			System.out.println("Data Written in File "+file.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void readDataFromFileAgain(String filePath) {
		
		// Work with Text i.e. Character
		
		try {
			File file = new File(filePath);
			
			FileInputStream stream = new FileInputStream(file); // byte by byte
			
			// Explore how to process line by line
			// If not possible, explore the reason behind it
			
			int i = 0;
			while((i = stream.read()) != -1) {
				char ch = (char)i;
				System.out.print(ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
