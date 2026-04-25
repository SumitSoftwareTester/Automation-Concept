package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC054_Reset_Admin_Job_JobSpeci {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_Admin_Job_JobSpeci();
		obj.logout();
		obj.closeApplication();

	}

}
