package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC053_Search_Admin_Job_JobSpeci {

	@Test
	public  void Search_Admin_Job_JobSpeci()  throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.search_Admin_Job_JobSepeci();
		obj.logout();
		obj.closeApplication();

	}

}
