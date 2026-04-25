package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC075_Reset_Imigration_PIM_EmployeeList {

	@Test
	public  void Reset_Imigration_PIM_EmployeeList() throws Exception {
 		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_Imigration_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

		

	}

}
