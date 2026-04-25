package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC042_Admin_Job_JobTitles {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Job_JobTitle();
		obj.logout();
		obj.closeApplication();
	}

}
