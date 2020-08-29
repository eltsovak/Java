package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/Task.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
	}

}
