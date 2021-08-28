package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileUsingNIO {

	private static void createFileUsingNIO() throws IOException{
		
		Path path=Paths.get("//home//sonamgravitygma//files//hello2.txt");
		
	String data="TestData";
	Files.write(path, data.getBytes());
	
	List<String> lines=Arrays.asList("this is my first line","this is my second line");
	Files.write(Paths.get("//home//sonamgravitygma//files//hello3.txt"), lines, StandardCharsets.UTF_8,
			StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	
	public static void main(String[] args) throws IOException {
		createFileUsingNIO();
	}
}
