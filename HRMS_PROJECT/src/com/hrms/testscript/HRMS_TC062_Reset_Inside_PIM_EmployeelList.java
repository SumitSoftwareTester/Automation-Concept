package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC062_Reset_Inside_PIM_EmployeelList {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.Reset_Inside_pim_EmployeeLst();
 		obj.logout();
		obj.closeApplication();

	}

}
