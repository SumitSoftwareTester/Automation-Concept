package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC087_Reset_WorkExp_PIM_Employeelist {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		General_Data obj = new General_Data();
		obj.openApplication();
		obj.login();
		obj.reset_workExperience_PIM_Employeelist();
 		obj.logout();
		obj.closeApplication();

		
	}

}
