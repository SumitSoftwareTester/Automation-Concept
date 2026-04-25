package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC010_Change_Password {

	@Test
	public void change_Password()  throws Exception{
	General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.change_password();
		obj.logout();
		obj.closeApplication();
	}

}
