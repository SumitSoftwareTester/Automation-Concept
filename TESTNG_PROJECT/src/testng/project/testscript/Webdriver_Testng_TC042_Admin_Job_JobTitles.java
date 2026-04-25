package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC042_Admin_Job_JobTitles {

	@Test
		public void Admin_Job_JobTitles() throws Exception{
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Job_JobTitle();
		obj.logout();
		obj.closeApplication();
	}

}
