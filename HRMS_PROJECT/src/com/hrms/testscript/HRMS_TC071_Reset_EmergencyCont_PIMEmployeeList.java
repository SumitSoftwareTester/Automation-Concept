package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC071_Reset_EmergencyCont_PIMEmployeeList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Emergency_Contact_PIM_EmployeeList();
 		obj.logout();
		obj.closeApplication();

 
	}

}
