package com.syntax.tasks;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
//		ChromeDriver cd = new ChromeDriver("ChromeDriver");
//		cd.open();
//		cd.close();
//		cd.navigate();
//		System.out.println(cd.getTitle());
		
		RemoteWebDriver[] browsers = {new ChromeDriver("ChromeDriver"), new FirefoxDriver("FirefoxDriver"), new SafariDriver("SafariDriver")};
		for(RemoteWebDriver browser:browsers) {
			browser.open();
			browser.close();
			browser.navigate();
			System.out.println(browser.getTitle());
			System.out.println();
			
		}
		
		
		
		
	}

}
