package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Base_Class_Info;

public class Logout_Page extends Base_Class_Info{
	
	// objects 
	
	static By link_text 	=		By.linkText("Logout");
	
	//func
	
	public static void logout() {
		driver.findElement(link_text).click();
		Reporter.log("Logout from Application");
	}

}
