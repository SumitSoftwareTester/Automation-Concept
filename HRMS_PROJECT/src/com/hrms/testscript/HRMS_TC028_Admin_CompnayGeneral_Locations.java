package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC028_Admin_CompnayGeneral_Locations {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Module_CompnayInfo_Location();
		obj.logout();
		obj.closeApplication();
	}

}
