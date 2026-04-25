package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC051_Admin_Job_JobSpecification {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Admin_Job_JobSpecification();
		obj.logout();
		obj.closeApplication();

	}

}
