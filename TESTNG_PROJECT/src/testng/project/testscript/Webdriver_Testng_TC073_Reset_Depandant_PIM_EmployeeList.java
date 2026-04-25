package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC073_Reset_Depandant_PIM_EmployeeList {

	@Test
	public  void Reset_Depandant_PIM_EmployeeList() throws Exception {
 
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_Dependant_PIM_Employee();
 		obj.logout();
		obj.closeApplication();

	}

}
