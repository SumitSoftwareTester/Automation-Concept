package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC052_Rest_Inside_Admin_Job_JobSepeif {

	@Test
	public void Rest_Inside_Admin_Job_JobSepeif() throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_inside_admin_job_JobSepecif();
		obj.logout();
		obj.closeApplication();


	}

}
