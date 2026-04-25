package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC086_WorkExperince_PIM_Employeelist {

	@Test
	public  void WorkExperince_PIM_Employeelist() throws Exception {
 
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.work_Experience_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

		
	}

}
