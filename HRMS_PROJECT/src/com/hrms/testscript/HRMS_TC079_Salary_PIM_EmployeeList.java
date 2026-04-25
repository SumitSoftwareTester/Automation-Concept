package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC079_Salary_PIM_EmployeeList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.salary_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

		
	}

}
