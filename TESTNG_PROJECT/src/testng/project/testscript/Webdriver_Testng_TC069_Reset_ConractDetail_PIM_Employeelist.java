package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC069_Reset_ConractDetail_PIM_Employeelist {

	@Test
	public  void Reset_ConractDetail_PIM_Employeelist() throws Exception{

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj. reset_contactDetail_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();


	}

}
