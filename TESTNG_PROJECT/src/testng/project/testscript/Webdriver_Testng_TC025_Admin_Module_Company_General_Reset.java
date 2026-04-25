package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC025_Admin_Module_Company_General_Reset {

	@Test
		public void Admin_Module_Company_General_Reset () throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Admin_Company_General();
		obj.logout();
		obj.closeApplication();

	}

}
