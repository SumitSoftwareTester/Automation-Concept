package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC055_Delete_Admin_Job_JobSpecif {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.delete_Admin_Job_JobSpecifi();
		obj.logout();
		obj.closeApplication();

	}

}
