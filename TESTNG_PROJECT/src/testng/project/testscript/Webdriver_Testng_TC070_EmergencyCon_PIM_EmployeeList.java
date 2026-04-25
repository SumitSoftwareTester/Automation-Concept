package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC070_EmergencyCon_PIM_EmployeeList {

	@Test
	public  void EmergencyCon_PIM_EmployeeList() throws Exception {

		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj. Emergency_Contact_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

	}

}
