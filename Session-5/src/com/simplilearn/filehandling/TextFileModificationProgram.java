package com.simplilearn.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileModificationProgram {

	public static void modifyFile(String file,String oldString,String newString) {
		
		File file1=new File(file);
		String oldContent="";
		BufferedReader reader=null;
		FileWriter writer=null;
		try {
			reader=new BufferedReader(new FileReader(file1));
			String line=reader.readLine();
			
			while(line!=null) {
				oldContent=oldContent+line+System.lineSeparator();
				line=reader.readLine();
			}
			String newContent=oldContent.replaceAll(oldString, newString);
			writer=new FileWriter(file1);
			writer.write(newContent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		modifyFile("//home//sonamgravitygma//files//hello.txt", "world", "new world");
	}
}
