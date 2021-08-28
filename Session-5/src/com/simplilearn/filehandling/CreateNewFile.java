package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void createFileUsingFileClass() throws IOException{
		
		File file=new File("//home//sonamgravitygma//files//hello.txt");
		
		if(file.createNewFile()) {
			System.out.println("file created");
		}else {
			System.out.println("file Already Exist");
		}
		
		//write some content
		FileWriter writer=new FileWriter(file);
		writer.write("Welcome to the world of File Hanling");
		writer.close();
	}
	
	public static void main(String[] args) throws IOException{
		createFileUsingFileClass();
	}
}
