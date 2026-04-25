package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC013_Change_Password_with_Wrong_Old_Confirm {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.wrong_OldPassword_Confirm_Password();
		obj.logout();
		obj.closeApplication();
	}

}
