package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC028_Admin_CompnayGeneral_Locations {
	
		@Test
		public void Admin_CompnayGeneral_Locations() throws Exception{
			
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Module_CompnayInfo_Location();
		obj.logout();
		obj.closeApplication();
	}

}
