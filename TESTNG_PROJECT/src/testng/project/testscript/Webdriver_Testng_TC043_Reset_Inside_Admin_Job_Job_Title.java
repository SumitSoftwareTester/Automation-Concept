package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC043_Reset_Inside_Admin_Job_Job_Title {
	 
	@Test
	public void  Reset_Inside_Admin_Job_Job_Title() throws Exception{
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_inside_Admin_Job_JobTitle();
		obj.logout();
		obj.closeApplication();
	}

}
