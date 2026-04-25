package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC012_Change_password_with_Wrong_NewPassword {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.wrong_confirmPassword();
		obj.logout();
		obj.closeApplication();
		
	}

}
