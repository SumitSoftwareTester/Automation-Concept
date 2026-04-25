package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC012_Change_password_with_Wrong_NewPassword {

	@Test
		public void Change_password_with_Wrong_NewPassword() throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.wrong_confirmPassword();
		obj.logout();
		obj.closeApplication();
		
	}

}
