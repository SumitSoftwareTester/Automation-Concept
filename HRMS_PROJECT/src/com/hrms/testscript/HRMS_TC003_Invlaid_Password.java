package com.hrms.testscript;

import com.hrms.lib_function.General_Data;

public class HRMS_TC003_Invlaid_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		General_Data  obj = new General_Data();
		obj.openApplication();
		obj.invalid_Login();
		obj.closeApplication();
	}

}
