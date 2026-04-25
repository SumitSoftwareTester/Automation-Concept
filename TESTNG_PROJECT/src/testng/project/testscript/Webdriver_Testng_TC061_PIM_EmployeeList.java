package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC061_PIM_EmployeeList {

	@Test
	public void PIM_EmployeeList() throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.pim_EmployeeLst();
 		obj.logout();
		obj.closeApplication();
	}

}
