package com.jamal.pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverLoader {


	public static WebDriver driver;

	public  void launchBrowser(){

		

		String exePath = "C:\\Users\\jmohamme\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		
	}
	
		public  void launchurl(){
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/jmohamme/Documents/My%20Received%20Files/Example1(1).html");
		

	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	
}



