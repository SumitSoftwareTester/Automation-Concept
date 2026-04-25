package com.hrms.testsscript;

import com.hrms.pages.Add_Employee;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.pages.Verify_Page;
import com.hrms.utility.Base_Class_Info;
import org.testng.annotations.Test;

public class Add_Employee_TC003 {

//	public static void main(String[]args) throws Exception {
	@Test
	public static void add_employee()  throws Exception{
		Base_Class_Info.OpenApplication();
		Login_Page.login("admin", "admin");
		Verify_Page.title("OrangeHRMS");
		Add_Employee.addEmployee("Sood", "Sonu");
		Logout_Page.logout();
		Base_Class_Info.closeApplication();
		
	}
}
