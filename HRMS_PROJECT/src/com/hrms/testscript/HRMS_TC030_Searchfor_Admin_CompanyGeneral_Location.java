package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC030_Searchfor_Admin_CompanyGeneral_Location {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Searchfor_Admin_CompanyGeneral_Location();
		obj.logout();
		obj.closeApplication();
	}

}
