package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeletFile {

	public static void main(String[] args) {
		try {
			Files.deleteIfExists(Paths.get("//home//sonamgravitygma//files//hello2.txt"));
		}
		catch (NoSuchFileException e) {
			e.printStackTrace();
		}
		catch (DirectoryNotEmptyException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("File Deleted Successfully");
	}
}
