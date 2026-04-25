package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC030_Searchfor_Admin_CompanyGeneral_Location {

	
	@Test
		public void Searchfor_Admin_CompanyGeneral_Location() throws Exception{
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Searchfor_Admin_CompanyGeneral_Location();
		obj.logout();
		obj.closeApplication();
	}

}
