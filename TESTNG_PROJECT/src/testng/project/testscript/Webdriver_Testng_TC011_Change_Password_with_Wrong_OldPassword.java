package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC011_Change_Password_with_Wrong_OldPassword {

	@Test
		public void Change_Password_with_Wrong_OldPassword()  throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.wrong_oldpassword();
		obj.logout();
		obj.closeApplication();
	}

}
