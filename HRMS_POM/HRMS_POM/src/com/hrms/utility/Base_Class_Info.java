package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Base_Class_Info {

	public  static WebDriver driver;
	
	public static void OpenApplication() {
	System.setProperty("webdriver.chrome.driver", "E://Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Reporter.log("Open Application");
	}
	
	public static void closeApplication() {
		driver.close();
		Reporter.log("Close Application");
	}
}
