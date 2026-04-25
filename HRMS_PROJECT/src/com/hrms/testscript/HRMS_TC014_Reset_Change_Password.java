package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC014_Reset_Change_Password {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.change_password_Reset();
		obj.logout();
		obj.closeApplication();

	}

}
