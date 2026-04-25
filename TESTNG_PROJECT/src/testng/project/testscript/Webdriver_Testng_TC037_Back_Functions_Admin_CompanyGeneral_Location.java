package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC037_Back_Functions_Admin_CompanyGeneral_Location {

	@Test
		public void Back_Functions_Admin_CompanyGeneral_Location() throws Exception{
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Back_Admin_CompanyGeneral_Location();
		obj.logout();
		obj.closeApplication();
		
	}

}
