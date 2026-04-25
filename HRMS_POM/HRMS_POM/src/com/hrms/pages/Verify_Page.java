package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.Base_Class_Info;

public class Verify_Page extends Base_Class_Info {	
	// fun
	
	public static void title(String title) {
		
		if(driver.getTitle().equals("Oragne HRMS")) {
			System.out.println("Title Matched");
			Reporter.log("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
			Reporter.log("Title Not Matched");
			System.out.println("Titles are : "+driver.getTitle());
			Reporter.log("Titles are : "+driver.getTitle());
		}
	}

}
