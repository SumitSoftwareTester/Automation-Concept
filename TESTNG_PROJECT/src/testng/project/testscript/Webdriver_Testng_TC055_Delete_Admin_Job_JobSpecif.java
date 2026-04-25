package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC055_Delete_Admin_Job_JobSpecif {

	@Test
	public  void Delete_Admin_Job_JobSpecif()  throws Exception{

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.delete_Admin_Job_JobSpecifi();
		obj.logout();
		obj.closeApplication();

	}

}
