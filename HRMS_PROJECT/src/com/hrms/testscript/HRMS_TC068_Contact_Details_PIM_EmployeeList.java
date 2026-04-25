package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC068_Contact_Details_PIM_EmployeeList {
	
	public static void main(String[] args) throws Exception {

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj. contactdetails_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

	}
}
