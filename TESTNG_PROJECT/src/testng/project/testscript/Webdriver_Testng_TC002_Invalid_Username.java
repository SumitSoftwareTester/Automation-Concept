package testng.project.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC002_Invalid_Username {

	@Test
	public void invalid_Username() {
		DOMConfigurator.configure("log4j.xml");
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.invalid_Login();
		obj.closeApplication();

	}

}
