package testng.project.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.testng.lib_function.*;

public class Webdriver_Testng_TC001_Login {

 		// TODO Auto-generated method stub	
	@Test
	
		public void login_logout() throws Exception{
		
		DOMConfigurator.configure("log4j.xml");
		
		General_Data obj= new General_Data();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
	}

}
