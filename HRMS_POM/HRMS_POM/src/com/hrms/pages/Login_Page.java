package com.hrms.pages;
import com.hrms.utility.Base_Class_Info;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Login_Page extends Base_Class_Info {
	
	//Objects of the application defined 
	
	static By txt_LoginNameText		 	= 	By.name("txtUserName");
	static By txt_LoginPasswordtText	=	By.name("txtPassword");
	static By btn_login					=	By.name("Submit");
	
	//creating the method so that the object will get used 
	
	public static void login(String un, String ps) {
		
		driver.findElement(txt_LoginNameText).sendKeys(un);
		driver.findElement(txt_LoginPasswordtText).sendKeys(ps);
		driver.findElement(btn_login).click();
		Reporter.log("Login into the Application");
	}
}
