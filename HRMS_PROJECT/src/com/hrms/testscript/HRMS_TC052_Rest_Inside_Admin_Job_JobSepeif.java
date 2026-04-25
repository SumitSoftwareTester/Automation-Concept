package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC052_Rest_Inside_Admin_Job_JobSepeif {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_inside_admin_job_JobSepecif();
		obj.logout();
		obj.closeApplication();


	}

}
