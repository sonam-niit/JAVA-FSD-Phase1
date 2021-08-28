package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {

	public static List<String> readFile(String file){
		
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static void main(String[] args) {
		List<String> result=readFile("//home//sonamgravitygma//files//hello3.txt");
		//System.out.println(result);
		
		Iterator<String> iterator=result.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
