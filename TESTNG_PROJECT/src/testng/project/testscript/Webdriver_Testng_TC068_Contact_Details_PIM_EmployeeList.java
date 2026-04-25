package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC068_Contact_Details_PIM_EmployeeList {
	
	@Test
	public  void Contact_Details_PIM_EmployeeList() throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj. contactdetails_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

	}
}
