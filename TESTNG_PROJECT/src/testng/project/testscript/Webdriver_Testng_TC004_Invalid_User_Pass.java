package testng.project.testscript;
import org.testng.annotations.Test;
import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC004_Invalid_User_Pass {

	@Test
	public void invalid_User_Pass() {	
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.invalid_Login();
		obj.closeApplication();

	}

}
