package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC013_Change_Password_with_Wrong_Old_Confirm {

	@Test
	public void Change_Password_with_Wrong_Old_Confirm()  throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.wrong_OldPassword_Confirm_Password();
		obj.logout();
		obj.closeApplication();
	}

}
