package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MaltipleCatchBlocks {
	
	public static void main(String[] args) {
		
		String file = System.getProperty("user.dir") + "/testdata/SampleData.xlsx";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			fis.close();
			Workbook wb = new XSSFWorkbook(fis);
			// when we have 2 or more catch blocks
			// ALWAYS START WITH THE MOST SPECIFIC CATCH --> TO THE GENERIC
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ------- ");
		
	}

}
