package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC071_Reset_EmergencyCont_PIMEmployeeList {

	@Test
	public  void Reset_EmergencyCont_PIMEmployeeLis()  throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Emergency_Contact_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

 
	}

}
