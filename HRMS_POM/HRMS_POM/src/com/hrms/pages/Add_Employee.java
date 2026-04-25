package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Base_Class_Info;

public class Add_Employee  extends Base_Class_Info{

	//object
	
	
	static By xpath			= 	By.xpath("//input[@value = 'Add']");
	static By last_text 	=	By.id("txtEmpLastName");
	static By first_text 	=	By.name("txtEmpFirstName");
	static By btn_save		=	By.id("btnEdit");
 
	
	//function
	
	public static void addEmployee(String last , String first) throws Exception{
		
	driver.switchTo().frame("rightMenu");
	driver.findElement(xpath).click();
	driver.findElement(last_text).sendKeys(last);
	Thread.sleep(4000);
	driver.findElement(first_text).sendKeys(first);
	driver.findElement(btn_save).click();
	driver.switchTo().defaultContent();
	Reporter.log("Employee added Successfully");
	
	}
}
