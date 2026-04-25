package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC006_Verify_Title {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.title_Befor_Login();
		obj.login();
		obj.title_After_Login();
		obj.logout();
		obj.closeApplication();
		
	}

}
