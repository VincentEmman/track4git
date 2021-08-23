package org.ssglobal.training.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

public class FunList {

	private BufferedReader bufferedReader;
	private Word word; // injectables
	
	//Step 1A!! private, static and getLogger(Class.class.getName())
	private static Logger logger = Logger.getLogger(FunList.class.getName());
	
	{
		// STEP 1B : SET THE LOGGING LEVEL
		logger.setLevel(Level.ALL);
		// STEP 2: Creating another handler
		// STEP 3: Format the message
		try {
			FileHandler fileHandler = new FileHandler("./src/log/funlist.log");
			fileHandler.setEncoding("UTF-8");
			fileHandler.setLevel(Level.WARNING);
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			logger.addHandler(fileHandler);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	
	}
	
	public FunList() {

	}
	
	public FunList(String filename) {
		Path path = Paths.get(filename);
		try {
			this.bufferedReader = Files.newBufferedReader(path);
		} catch (IOException e) {
			// STEP 1C : Apply logging
			logger.severe("Error message: " + e.getMessage());
		}
		
	}
	
	public long countWords() {
		logger.info("Execute countWords");
		long temp = this.bufferedReader.lines()
				.map((str) -> {return str.split(" ");}).count();
		logger.info("Exit without error countWords");
		return temp;
		
	}
	
	@SuppressWarnings("deprecation")
	public boolean enableDisplay() {
		logger.info("Execute enableDisplay");
		logger.warning("custom date is deprecated");
		Date xmas = new Date(121,11,25);
		try {
			if(this.bufferedReader.lines().toArray(String[]::new).length > 0) {
				showLines();
				logger.info("Exit without errors enableDisplay");
				return true;
			}
		} catch (Exception e) {
			// STEP 1C : Apply logging
			logger.severe("Error message: " + e.getMessage());
		}
		
		logger.info("Exit with errors enableDisplay");
		return false;
		
	}
	
	public void showLines() {
		logger.info("Execute showLines");
		this.bufferedReader.lines().forEach((line) -> {System.out.println(line);});
		logger.info("Exit without error showLines");
	}
	
	public List<String> getContentList() {
		logger.info("Execute getContentList");
		List<String> temp = this.bufferedReader.lines().collect(Collectors.toList());
		logger.info("Exit without error getContentList");
		return temp;
	}
	
	public String[] getContentArray() {
		//return this.bufferedReader.lines().toArray(String[]::new);
		logger.info("Execute getContentArray");
		String[] temp = (String[]) this.bufferedReader.lines().toArray();
		logger.info("Exit without error getContentArray");
		return temp;
	}
	
	public static String processStr(String str1, String str2) {
		logger.info("Execute  processStr");
		String temp = String.join(" ", str1, str2);
		logger.info("Exit without error processStr");
		return temp;
	}
	
}


class Word {
	
}
