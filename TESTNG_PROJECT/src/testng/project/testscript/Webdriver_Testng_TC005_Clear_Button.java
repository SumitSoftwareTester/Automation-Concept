package testng.project.testscript;

import org.testng.annotations.Test;

import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC005_Clear_Button {
	@Test
	public void clear_button() throws Exception{
		General_Data obj= new General_Data();
		obj.openApplication();
		obj.clear();
		obj.closeApplication();

	}

}
