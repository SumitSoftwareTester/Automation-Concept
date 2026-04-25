package com.hrms.testsscript;
import org.testng.annotations.Test;

import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.utility.Base_Class_Info;

public class Login_TC001 {
	
	@Test
	public static void Login() {
		
		Base_Class_Info.OpenApplication();
		Login_Page.login("admin", "admin");
		Logout_Page.logout();
		Base_Class_Info.OpenApplication();
		
	}

}
