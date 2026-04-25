package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC020_Admin_Company_General_Not_Select_Mandatoryfield {

	@Test
		public void  Admin_Company_General_Not_Select_Mandatoryfield() throws Exception{
		General_Data obj= new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Company_General_Not_Select_Mandatoryfield();
		obj.logout();
		obj.closeApplication();
	}

}
