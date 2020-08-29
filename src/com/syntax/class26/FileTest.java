package com.syntax.class26;

public class FileTest {

public static void main(String[] args) {
		
		File [] files = {new JavaFile(), new WordFile(), new PdfFile()};
		for(File file : files) {
			file.open();
			file.edit();
			file.close();
		}
		
//		File java = new JavaFile();
//		java.open();
//		java.edit();
//		java.close();
//		
//		File doc = new WordFile();
//		doc.open();
//		doc.edit();
//		doc.close();
//		
//		File pdf = new PdfFile();
//		pdf.open();
//		pdf.edit();
//		pdf.close();
//		
	}
}

