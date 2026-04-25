package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC051_Admin_Job_JobSpecification {

	@Test
	public void Admin_Job_JobSpecification() throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Job_JobSpecification();
		obj.logout();
		obj.closeApplication();

	}

}
