package com.syntax.tasks;

public interface WebDriver {

	void open();

	void close();

	public String getTitle();

}

interface RemoteWebDriver extends WebDriver {

	void navigate();
}

interface TakesScreenshots extends RemoteWebDriver {

	void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver {

	String title;

	ChromeDriver(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void navigate() {
		System.out.println("ChromeDriver navigates");
	}

	public void open() {
		System.out.println("ChromeDriver open");
	}

	public void close() {
		System.out.println("ChromeDriver close");
	}
	
}

class FirefoxDriver implements RemoteWebDriver {

	String title;

	FirefoxDriver(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void navigate() {
		System.out.println("FirefoxDriver navigates");
	}

	public void open() {
		System.out.println("FirefoxDriver open");
	}

	public void close() {
		System.out.println("FirefoxDriver close");
	}

}

class SafariDriver implements RemoteWebDriver {
	
	String title;

	SafariDriver(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void navigate() {
		System.out.println("SafariDriver navigates");
	}

	public void open() {
		System.out.println("SafariDriver open");
	}

	public void close() {
		System.out.println("SafariDriver close");
	}


}
