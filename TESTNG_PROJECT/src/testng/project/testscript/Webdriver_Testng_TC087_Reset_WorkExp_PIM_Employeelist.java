package testng.project.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC087_Reset_WorkExp_PIM_Employeelist {

	@Test
	public void mReset_WorkExp_PIM_Employeelist() throws Exception{

		DOMConfigurator.configure("logj.xml");
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_workExperience_PIM_Employeelist();
 		obj.logout();
		obj.closeApplication();

		
	}

}
