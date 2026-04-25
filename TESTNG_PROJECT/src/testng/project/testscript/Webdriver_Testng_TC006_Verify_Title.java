package testng.project.testscript;
import org.testng.annotations.Test;
import com.hrms.testng.lib_function.General_Data;

public class Webdriver_Testng_TC006_Verify_Title {

	@Test
	public void verify_title()  throws Exception{
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.title_Befor_Login();
		obj.login();
		obj.title_After_Login();
		obj.logout();
		obj.closeApplication();
		
	}

}
