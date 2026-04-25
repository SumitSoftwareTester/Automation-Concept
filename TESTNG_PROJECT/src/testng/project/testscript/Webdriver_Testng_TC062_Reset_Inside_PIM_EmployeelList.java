package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC062_Reset_Inside_PIM_EmployeelList {

	@Test
	public void Reset_Inside_PIM_EmployeelList() throws Exception{
		
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Inside_pim_EmployeeLst();
 		obj.logout();
		obj.closeApplication();

	}

}
