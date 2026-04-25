package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC044_Search_Admin_Job_JobTitle {

	@Test
	public void  Search_Admin_Job_JobTitle() throws Exception{
	

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.search_Admin_Job_JobTitle();
		obj.logout();
		obj.closeApplication();
	}

}
