package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC025_Admin_Module_Company_General_Reset {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub7
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Admin_Company_General();
		obj.logout();
		obj.closeApplication();

	}

}
