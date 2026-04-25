package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC014_Reset_Change_Password {

		@Test
		public void Reset_Change_Password() throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.change_password_Reset();
		obj.logout();
		obj.closeApplication();

	}

}
