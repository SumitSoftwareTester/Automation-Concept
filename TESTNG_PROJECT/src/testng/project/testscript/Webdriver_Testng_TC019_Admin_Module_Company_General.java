package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC019_Admin_Module_Company_General {

		@Test
		public void Admin_Module_Company_General() throws Exception{ 
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Company_General();
		obj.logout();
		obj.closeApplication();

	}

}
