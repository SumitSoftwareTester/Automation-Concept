package com.hrms.testscript;
import com.hrms.lib_function.*;

public class HRMS_TC001_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		General_Data obj= new General_Data();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
	}

}
