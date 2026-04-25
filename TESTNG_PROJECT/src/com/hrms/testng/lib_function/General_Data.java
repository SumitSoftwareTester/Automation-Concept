package com.hrms.testng.lib_function;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.testng.utility.Log;

public class General_Data extends Global_Data {

	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Application Open");
		Reporter.log("Application Open");
		Log.info("Application Open");
	}
	
	public void closeApplication() {
		driver.close();
		System.out.println("Applcation Closed");
		Reporter.log("Application Closed");
		Log.info("Application Closed");
	}
	
	public void login() throws Exception {
		driver.findElement(By.name(txt_LoginName)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Login into Application");
		Reporter.log("Login into Application");
		Log.info("Login into Application");
		Thread.sleep(4000);
	}
	
	public void invalid_Login() {
		driver.findElement(By.name(txt_LoginName)).sendKeys(wrong_username);	
		driver.findElement(By.name(txt_password)).sendKeys(wrong_password);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Invalid Login Data");
		Reporter.log("Invalid Login Data");
		Log.info("Invalid Login Data");
	}
	public void clear() throws Exception {
		driver.findElement(By.name(txt_LoginName)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_Clear)).click();
		System.out.println("Entered Data has been clear");
		Reporter.log("Entered Data has been Clear");
		Log.info("Entered Data has been Clear");
		Thread.sleep(4000);
		
	}
	public void title_Befor_Login() {
		 if(driver.getTitle().equals(txt_beofre_title)){
			 System.out.println("Title has matched");
			 Reporter.log("Title has matched");
			 Log.info("Title has matched");
		 }
		 else {
			 System.out.println("Title Not Matched : "+driver.getTitle());
			 Reporter.log("Title Not Matched :" +driver.getTitle());
			 Log.info("Title Not Matched :" +driver.getTitle());
		 }
	}
	public void title_After_Login() {
		 if(driver.getTitle().equals(txt_title)){
			 System.out.println("Title has matched");
			 Reporter.log("Title has matched");
			 Log.info("Title has matched");
		 }
		 else {
			 System.out.println("Title Not Matched : "+driver.getTitle());
			 Reporter.log("Title Not Matched :" +driver.getTitle());
			 Log.info("Title Not Matched :" +driver.getTitle());

		 }
	}
	
		public void change_password() throws Exception {
			Thread.sleep(4000);
			driver.findElement(By.linkText(link_text)).click();
			driver.switchTo().frame(frame);
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(txtOldPassword)).sendKeys(oldpassword);
			driver.findElement(By.name(txtNewPassword)).sendKeys(newPassword);
			driver.findElement(By.name(txtConfirmPassword)).sendKeys(confirmPassword);
			driver.findElement(By.id(btn_save)).click();
			System.out.println("Password has been Changed");
			Reporter.log("Password has been Changed");
			Log.info("Password has been Changed");
			driver.switchTo().defaultContent();
		}
		public void wrong_oldpassword() throws Exception {
			Thread.sleep(4000);
			driver.findElement(By.linkText(link_text)).click();
			driver.switchTo().frame(frame);
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(wrong_txtOldPassword)).sendKeys(wrong_oldpassword);
			driver.findElement(By.name(txtNewPassword)).sendKeys(newPassword);
			driver.findElement(By.name(txtConfirmPassword)).sendKeys(confirmPassword);
			driver.findElement(By.id(btn_save)).click();
			Thread.sleep(4000);
			Alert at = driver.switchTo().alert();
			System.out.println(at.getText());
			at.accept();
			driver.switchTo().defaultContent();
		}
		
		public void wrong_confirmPassword() throws Exception {
			
			driver.findElement(By.linkText(link_text)).click();
			driver.switchTo().frame(frame);
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(txtOldPassword)).sendKeys(oldpassword);
			Thread.sleep(4000);
			driver.findElement(By.name(txtNewPassword)).sendKeys(newPassword);
			Thread.sleep(4000);
			driver.findElement(By.name(wrong_txtConfirmPassword)).sendKeys(wrong_confirmPassword);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.findElement(By.id(btn_save)).click();
			Alert at = driver.switchTo().alert();
			at.accept();

			Thread.sleep(4000);
			System.out.println(at.getText());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.switchTo().defaultContent();			
		}
	
		public void wrong_OldPassword_Confirm_Password() throws Exception {
			driver.findElement(By.linkText(link_text)).click();
			driver.switchTo().frame(frame);
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(wrong_txtOldPassword)).sendKeys(wrong_oldpassword);
			Thread.sleep(4000);
			driver.findElement(By.name(txtNewPassword)).sendKeys(newPassword);
			Thread.sleep(4000);
			driver.findElement(By.name(wrong_txtConfirmPassword)).sendKeys(wrong_confirmPassword);
			driver.findElement(By.id(btn_save)).click();
			Alert at = driver.switchTo().alert();
			System.out.println(at.getText());
			at.dismiss();
			driver.switchTo().defaultContent();
		}
		
		
		public void change_password_Reset() throws Exception{
			driver.findElement(By.linkText(link_text)).click();
			driver.switchTo().frame(frame);
			System.out.println("Entering into the Frame");
			Reporter.log("Entering into the Frame");
			Log.info("Entering into the Frame");
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(txtOldPassword)).sendKeys(oldpassword);
			driver.findElement(By.name(txtNewPassword)).sendKeys(newPassword);
			driver.findElement(By.name(txtConfirmPassword)).sendKeys(confirmPassword);
			Thread.sleep(4000);
			driver.findElement(By.xpath(btn_Reset)).click();
			driver.switchTo().defaultContent();
			System.out.println("Exist from Frame");
			Reporter.log("Exist from Frame");
			Log.info("Exist from Frame");
		}
		
		public void Admin_Company_General() throws Exception{
			Actions at = new Actions(driver);
			at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			System.out.println("Clicking on the Admin");
			Reporter.log("Clicking on the Admin");
			Log.info("Clicking on the Admin");
			Thread.sleep(4000);
			at.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
			System.out.println("clicking on the company Info");
			Reporter.log("Clicking on the Company Info");
			Log.info("Clicking on the Company Info");
			driver.findElement(By.linkText(btn_submenu_txt)).click();
			System.out.println("Clicking on the General");
			Reporter.log("Clicking on the General");
			Log.info("Clicking on the General");
			Thread.sleep(4000);
			driver.switchTo().frame(frame);
			driver.findElement(By.id(btn_save)).click();
			driver.findElement(By.name(txt_compnayName)).sendKeys(tctCompanyName);
			driver.findElement(By.name(txtId)).sendKeys(txID);
			driver.findElement(By.name(txt_Nacis)).sendKeys(txtNaics);
			driver.findElement(By.name(txt_Phone)).sendKeys(txtphone);
			driver.findElement(By.name(txt_fax)).sendKeys(txtfax);
			Thread.sleep(4000);
			Select st = new Select(driver.findElement(By.name(dropdown)));
				st.selectByVisibleText(dropdown_list);
			Thread.sleep(4000);
				driver.findElement(By.name(txt_address)).sendKeys(txtaddress);
				driver.findElement(By.name(txt_City)).sendKeys(txtCity);
				driver.findElement(By.name(txt_state)).sendKeys(txtState);
				driver.findElement(By.name(txt_Zip)).sendKeys(txtZip);
				driver.findElement(By.name(txt_Comment)).sendKeys(txtCommnet);
				Thread.sleep(4000);
				driver.findElement(By.id(btn_save)).click();
				driver.switchTo().defaultContent();
				System.out.println("Data has been Saved in Company Info General");
				Reporter.log("Data has been Saved in Company Info General");
				Log.info("Data has been Saved in Company Info General");

		}
		public void Reset_Admin_Company_General() throws Exception{
			Actions st = new Actions(driver);
			st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
			driver.findElement(By.linkText(btn_submenu_txt)).click();
			driver.switchTo().frame(frame);
			Thread.sleep(4000);
			driver.findElement(By.id(btn_save)).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(btn_Reset)).click();
			driver.switchTo().defaultContent();
			System.out.println("Data has been Reset Successfully");
			Reporter.log("Data has been Reset Successfully");
			Log.info("Data has been Reset Successfully");
		}
		
		public void Admin_Company_General_Not_Select_Mandatoryfield() throws Exception {
			Actions st = new Actions(driver);
			st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
			driver.findElement(By.linkText(btn_submenu_txt)).click();
			driver.switchTo().frame(frame);
			Thread.sleep(4000);
			driver.findElement(By.id(btn_save)).click();
			Thread.sleep(4000);
			driver.findElement(By.name(txt_compnayName)).clear();
			Thread.sleep(4000);
			driver.findElement(By.id(btn_save)).click();
			Alert at = driver.switchTo().alert();
			System.out.println(at.getText());
			at.accept();
			driver.switchTo().defaultContent();
			System.out.println("Data trying to Save ");
			Reporter.log("Data trying to Save");
			Log.info("Data trying to Save");
		}
		   public void Admin_Module_CompnayInfo_Location() throws Exception {
			Actions st = new Actions(driver);
			st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
			driver.findElement(By.linkText(txt_location)).click();
			driver.switchTo().frame(frame);
			System.out.println("Entering into the Frame");
			Reporter.log("Entering into the Frame");
			Log.info("Entering into the Frame");
			Thread.sleep(4000);
			driver.findElement(By.xpath(save_btn)).click();
			Thread.sleep(4000);
			//driver.switchTo().frame(frame);
			driver.findElement(By.name(location_txtt)).sendKeys(txt_loc_name);
			Thread.sleep(4000);
			Select ast = new Select(driver.findElement(By.name(dropdown)));
			ast.selectByVisibleText(dropdown_list);
			driver.findElement(By.name(txt_state)).sendKeys(txtState);
			driver.findElement(By.name(location_city)).sendKeys(txtloc_city);
			driver.findElement(By.name(txt_address_loc)).sendKeys(txtaddress);
			driver.findElement(By.name(txt_Zip)).sendKeys(txtZip);
			driver.findElement(By.name(txt_Phone)).sendKeys(txtphone);
			driver.findElement(By.name(txt_fax)).sendKeys(txtfax);
			driver.findElement(By.name(txt_Comment)).sendKeys(txtCommnet);
			driver.findElement(By.id(btn_save)).click();
			driver.switchTo().defaultContent();
			System.out.println("Location has been added successfully");
			Reporter.log("Location has been added successfully");
			Log.info("Location has been added successfully");
		}
		   public void Searchfor_Admin_CompanyGeneral_Location() throws Exception {
			   Actions st = new Actions(driver);
				st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
				st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
				driver.findElement(By.linkText(txt_location)).click();
				driver.switchTo().frame(frame);
				System.out.println("Entering into the Frame");
				Reporter.log("Entering into the Frame");
				Log.info("Entering into the Frame");
				Thread.sleep(4000);
				Select ast = new Select(driver.findElement(By.name(txt_droplist)));
				ast.selectByVisibleText(txt_visble);
				driver.findElement(By.name(txt_searchdata)).sendKeys(txt_sear);
				driver.findElement(By.xpath(searchbtn)).click();
				Thread.sleep(4000);
				driver.switchTo().defaultContent();
				System.out.println("Data has been Searched ");
				Reporter.log("Data has been Searched");
				Log.info("Data has been Searched");
		   }
		   
		   public void Reset_Admin_CompanyGeneral_Location()  throws Exception{
			    Actions st = new Actions(driver);
				st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
				st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
				driver.findElement(By.linkText(txt_location)).click();
				driver.switchTo().frame(frame);
				System.out.println("Entering into the Frame");
				Reporter.log("Entering into the Frame");
				Log.info("Entering into the Frame");

				Thread.sleep(4000);
				Select ast = new Select(driver.findElement(By.name(txt_droplist)));
				ast.selectByVisibleText(txt_visble);
				driver.findElement(By.name(txt_searchdata)).sendKeys(txt_sear);
				driver.findElement(By.xpath(btn_Reset)).click();
				Thread.sleep(4000);
				driver.switchTo().defaultContent();
				System.out.println("Data has been Reseted Successfully ");
				Reporter.log("Data has been Reseted Successfully");
				Log.info("Data has been Reseted Successfully");

		   }
		
		   public void delete_Admin_ComapnayGeneral_Location() throws Exception {
			   
			   Actions st = new Actions(driver);
				st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
				st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
				driver.findElement(By.linkText(txt_location)).click();
				driver.switchTo().frame(frame);
				System.out.println("Entering into the Frame");
				Reporter.log("Entering into the Frame");
				Log.info("Entering into the Frame");

				Thread.sleep(4000);
				Select ast = new Select(driver.findElement(By.name(txt_droplist)));
				ast.selectByVisibleText(txt_visble);
				driver.findElement(By.name(txt_searchdata)).sendKeys(txt_sear);
				driver.findElement(By.xpath(searchbtn)).click();
				Thread.sleep(4000);
				driver.findElement(By.name(checkbox)).click();
				driver.findElement(By.xpath(delete_btn)).click();
				Alert at= driver.switchTo().alert();
				at.accept();
				driver.switchTo().defaultContent();
				System.out.println("Data has been deleted Successfully ");
				Reporter.log("Data has been deleted Successfully");
				Log.info("Data has been deleted Successfully");

		   }
		   
		   public void Reset_Inside_Admin_CompanyGeneral_Location()  throws Exception{
			   	Actions st = new Actions(driver);
				st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
				st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
				driver.findElement(By.linkText(txt_location)).click();
				driver.switchTo().frame(frame);
				System.out.println("Entering into the Frame");
				Reporter.log("Entering into the Frame");
				Log.info("Entering into the Frame");

				Thread.sleep(4000);
				driver.findElement(By.xpath(save_btn)).click();
				Thread.sleep(4000);
				//driver.switchTo().frame(frame);
				driver.findElement(By.name(location_txtt)).sendKeys(txt_loc_name);
				Thread.sleep(4000);
				Select ast = new Select(driver.findElement(By.name(dropdown)));
				ast.selectByVisibleText(dropdown_list);
				driver.findElement(By.name(txt_state)).sendKeys(txtState);
				driver.findElement(By.name(location_city)).sendKeys(txtloc_city);
				driver.findElement(By.name(txt_address_loc)).sendKeys(txtaddress);
				driver.findElement(By.name(txt_Zip)).sendKeys(txtZip);
				driver.findElement(By.name(txt_Phone)).sendKeys(txtphone);
				driver.findElement(By.name(txt_fax)).sendKeys(txtfax);
				driver.findElement(By.name(txt_Comment)).sendKeys(txtCommnet);
				driver.findElement(By.xpath(btn_Reset)).click();
				driver.switchTo().defaultContent();
				System.out.println("Data has been Reseted successfully");
				Reporter.log("Data has been Reseted successfully");
				Log.info("Data has been Reseted successfully");
		   }
		   
		   public void Back_Admin_CompanyGeneral_Location()  throws Exception{
			   Actions st = new Actions(driver);
				st.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
				st.moveToElement(driver.findElement(By.linkText(btn_menu_txt))).perform();
				driver.findElement(By.linkText(txt_location)).click();
				driver.switchTo().frame(frame);
				System.out.println("Entering into the Frame");
				Reporter.log("Entering into the Frame");
				Log.info("Entering into the Frame");
				Thread.sleep(4000);
				driver.findElement(By.xpath(save_btn)).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(back_funct)).click();
				driver.switchTo().defaultContent();
				System.out.println("Back functionality worked");
				Reporter.log("Back functionality worked");
				Log.info("Back functionality worked");
		   }
		   
		   public void Admin_Job_JobTitle() throws Exception {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(jobtext)).click();
			   driver.switchTo().frame(frame);
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(job_title_name)).sendKeys(jobtitlename);
			   driver.findElement(By.name(txtJobTitleDesc)).sendKeys(txtJobTitle_Desc);
			   driver.findElement(By.name(txtJobTitleComments)).sendKeys(txtJTComments);
			   Select jb = new Select(driver.findElement(By.id(jbdrop_down)));
			   jb.selectByIndex(2);
			   System.out.println("Data has been entered in the job title");
			   Reporter.log("Data has been entered in the job title");
			   Log.info("Data has been entered in the job title");
			
			   driver.findElement(By.xpath(paygrade)).click();
			   driver.findElement(By.name(namegrade)).sendKeys(namegradepay);
			   driver.findElement(By.xpath(save_btnpay)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   System.out.println("It has open the Job Pay Grade Page");
			   Reporter.log("It has open the Job Pay Grade Page");
			   Log.info("It has open the Job Pay Grade Page");
			   
			   Select currency = new Select(driver.findElement(By.id(txt_currency)));
			   currency.selectByVisibleText(curr_select);
			   
			   driver.findElement(By.id(min_Salary)).sendKeys(min_salry);
			   driver.findElement(By.id(max_salary)).sendKeys(max_salry);
			   driver.findElement(By.id(stp_incer)).sendKeys(stp_incre);
			   driver.findElement(By.id(saveBtn)).click();
			   System.out.println("New Currency has been Assigned");
			   Reporter.log("New Currency has been Assigned");
			   Log.info("New Currency has been Assigned");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.xpath(back_funct)).click();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   System.out.println("It has back to the Job Title");
			   Reporter.log("It has back to the Job Title");
			   Log.info("It has back to the Job Title");
			   
			   Alert att = driver.switchTo().alert();
	
			  System.out.println(att.getText());
			   att.accept();
			//   st.selectByIndex(1);
			   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   Thread.sleep(4000);
			   Select st = new Select(driver.findElement(By.name(jobspecif_drop)));//here it is used for Paygrade
			   st.selectByVisibleText(namegradepay);
			   System.out.println("It has selected the Paygrade Employee");
			   Reporter.log("It has selected the Paygrade Employee");
			   Log.info("It has selected the Paygrade Employee");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   driver.findElement(By.xpath(save_btnpay)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			   driver.findElement(By.id(btn_save)).click();
			   System.out.println("It has clicked on the edit of Job TItle");
			   Reporter.log("It has clicked on the edit of Job TItle");
			   Log.info("It has clicked on the edit of Job TItle");
			   driver.findElement(By.id(btn_save)).click();
			    
			   driver.switchTo().defaultContent();
			   System.out.println("Job Title add successfully");
			   Reporter.log("Job Title add successfully");
			   Log.info("Job Title add successfully");
		   }
		   
		   
		   public void reset_inside_Admin_Job_JobTitle() {
			   
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(jobtext)).click();
			   driver.switchTo().frame(frame);
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(job_title_name)).sendKeys(jobtitlename);
			   driver.findElement(By.name(txtJobTitleDesc)).sendKeys(txtJobTitle_Desc);
			   driver.findElement(By.name(txtJobTitleComments)).sendKeys(txtJTComments);
			   System.out.println("Data has been entered in the job title");
			   Reporter.log("Data has been entered in the job title");
			   Log.info("Data has been entered in the job title");
			   Select st = new Select(driver.findElement(By.name(jobspecif_drop)));
			   st.selectByContainsVisibleText(namegradepay);
			   System.out.println("It has selected the Paygrade Employee");
			   Reporter.log("It has selected the Paygrade Employee");
			   Log.info("It has selected the Paygrade Employee");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.xpath(btn_Reset)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   System.out.println("It has Reseted all the inputed data");
			   Reporter.log("It has Reseted all the inputed data");
			   Log.info("It has Reseted all the inputed data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void search_Admin_Job_JobTitle() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(jobtext)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(value_search);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void reset_Admin_Job_JobTitle() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(jobtext)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(value_search);
			   driver.findElement(By.xpath(btn_Reset)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			   System.out.println("Data has been reset successfully");
			   Reporter.log("Data has been reset successfully");
			   Log.info("Data has been reset successfully");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void delete_Admin_Job_JobTitle() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(jobtext)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(value_search);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(checkbox)).click();
			   System.out.println("It had selected the records");
			   Reporter.log("It had selected the records");
			   Log.info("It had selected the records");
			   driver.findElement(By.xpath(delete_btn)).click();
			   Alert atts = driver.switchTo().alert();
			   System.out.println(atts.getText());
			   atts.accept();
			   System.out.println("Data has been deleted successfully");
			   Reporter.log("Data has been deleted successfully");
			   Log.info("Data has been deleted successfully");
			   driver.switchTo().defaultContent();
		   }

		   public void Admin_Job_JobSpecification() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtjobspecif)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtFieldName)).sendKeys(speci_txtFidName);
			   driver.findElement(By.name(desc_txtDesc)).sendKeys(speci_txtDesc);
			   driver.findElement(By.name(duties_txtDuties)).sendKeys(speci_duties);
			   driver.findElement(By.id(btn_save)).click();
			   System.out.println("Job Specification Data has been Saved");
			   Reporter.log("Job Specification Data has been Saved");
			   Log.info("Job Specification Data has been Saved");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void reset_inside_admin_job_JobSepecif() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtjobspecif)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtFieldName)).sendKeys(speci_txtFidName);
			   driver.findElement(By.name(desc_txtDesc)).sendKeys(speci_txtDesc);
			   driver.findElement(By.name(duties_txtDuties)).sendKeys(speci_duties);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.xpath(btn_Reset)).click();
			   System.out.println("Job Specification Data has been removed");
			   Reporter.log("Job Specification Data has been removed");
			   Log.info("Job Specification Data has been removed");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void search_Admin_Job_JobSepeci() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtjobspecif)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(id_select);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void reset_Admin_Job_JobSpeci() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtjobspecif)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(id_select);
			   driver.findElement(By.xpath(btn_Reset)).click();
			   System.out.println("It has Reseted the input data");
			   Reporter.log("It has Reseted the input data");
			   Log.info("It has Reseted the input data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void delete_Admin_Job_JobSpecifi() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtjobspecif)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(id_select);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(checkbox)).click();
			   System.out.println("It had selected the records");
			   Reporter.log("It had selected the records");
			   Log.info("It had selected the records");
			   driver.findElement(By.xpath(delete_btn)).click();
			   Alert atts = driver.switchTo().alert();
			   System.out.println(atts.getText());
			   atts.accept();
			   System.out.println("Data has been deleted successfully");
			   Reporter.log("Data has been deleted successfully");
			   Log.info("Data has been deleted successfully");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void Admin_Job_PayGrade() {
			   
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtpaygrade)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(namegrade)).sendKeys(namegradepay);
			   driver.findElement(By.xpath(save_btnpay)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   System.out.println("It has open the Job Pay Grade Page");
			   Reporter.log("It has open the Job Pay Grade Page");
			   Log.info("It has open the Job Pay Grade Page");
			   Select currency = new Select(driver.findElement(By.id(txt_currency)));
			   currency.selectByVisibleText(curr_select);
			   
			   driver.findElement(By.id(min_Salary)).sendKeys(min_salry);
			   driver.findElement(By.id(max_salary)).sendKeys(max_salry);
			   driver.findElement(By.id(stp_incer)).sendKeys(stp_incre);
			   driver.findElement(By.id(saveBtn)).click();
			   System.out.println("New Currency has been Assigned");
			   Reporter.log("New Currency has been Assigned");
			   Log.info("New Currency has been Assigned");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.xpath(back_funct)).click();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   System.out.println("It has back to the Job Pay Grade");
			   Reporter.log("It has back to the Job Pay Grade");
			   Log.info("It has back to the Job Pay Grade");
			   driver.switchTo().defaultContent();
		   
		   }
		   
		   public void reset_inside_Admin_Job_PayGrade() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtpaygrade)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(namegrade)).sendKeys(namegradepay);
			   driver.findElement(By.xpath(btn_Reset)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			   System.out.println("It has Reset the data of Job Pay Grade Page");
			   Reporter.log("It has Reset the data of Job Pay Grade Page");
			   Log.info("It has Reset the data of Job Pay Grade Page");
			   driver.switchTo().defaultContent();
			 
		   }
		   public void search_Admin_Job_PayGrade() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtpaygrade)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(txt_pay_loc_name);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void reset_Admin_Job_Paygrade() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtpaygrade)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has successfully selected the Job Specification");
			   Reporter.log("It has successfully selected the Job Specification");
			   Log.info("It has successfully selected the Job Specification");
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(txt_pay_loc_name);
			   driver.findElement(By.xpath(btn_Reset)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void delete_Admin_Job_PayGrade() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(btn_menu))).perform();
			   at.moveToElement(driver.findElement(By.linkText(linktext))).perform();
			   driver.findElement(By.linkText(txtpaygrade)).click();
			   driver.switchTo().frame(frame);
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(txt_pay_loc_name);
			   driver.findElement(By.xpath(searchbtn)).click();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(checkbox)).click();
			   System.out.println("It had selected the records");
			   Reporter.log("It had selected the records");
			   Log.info("It had selected the records");
			   driver.findElement(By.xpath(delete_btn)).click();
			   Alert atts = driver.switchTo().alert();
			   System.out.println(atts.getText());
			   atts.accept();
			   System.out.println("Data has been deleted successfully");
			   Reporter.log("Data has been deleted successfully");
			   Log.info("Data has been deleted successfully");
			   driver.switchTo().defaultContent();
		   }
		   
		   public void pim_EmployeeLst()
		   {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtlast)).sendKeys(txt_last);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.name(txtFirst)).sendKeys(txt_first);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			   WebElement file = driver.findElement(By.id(photo_id));
			   file.sendKeys("E:\\paper 3.jpeg");
			   System.out.println("Photo uploaded successfully");
			   Reporter.log("Photo uploaded successfully");
			   Log.info("Photo uploaded successfully");
			   driver.findElement(By.xpath(save_btnpay)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("PIM Employee has been Added");
			   Reporter.log("PIM Employee has been Added");
			   Log.info("PIM Employee has been Added");
		   }
		   public void Reset_Inside_pim_EmployeeLst()
		   {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtlast)).sendKeys(txt_last);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.name(txtFirst)).sendKeys(txt_first);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			   WebElement file = driver.findElement(By.id(photo_id));
			   file.sendKeys("E:\\paper 3.jpeg");
			   System.out.println("Photo uploaded successfully");
			   Reporter.log("Photo uploaded successfully");
			   Log.info("Photo uploaded successfully");
			   driver.findElement(By.xpath(btn_Reset)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("PIM Employee has been Reseted Successfully");
			   Reporter.log("PIM Employee has been Reseted Successfully");
			   Log.info("PIM Employee has been Reseted Successfully");
		   }
		   
		   public void search_PIM_Employee() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(search_PIM);
			   driver.findElement(By.xpath(searchbtn)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("It has display the search data");
			   Reporter.log("It has display the search data");
			   Log.info("It has display the search data");
		   }
		   
		   public void reset_PIM_EmployeeList() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(search_PIM);
			   driver.findElement(By.xpath(btn_Reset)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("It has Reset the data successfully");
			   Reporter.log("It has Reset the data successfully");
			   Log.info("It has Reset the data successfully");
		   }
		   
		   public void delete_PIM_EmployeeList() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   Select st = new Select (driver.findElement(By.id(txt_droplist)));
			   st.selectByIndex(1);
			   driver.findElement(By.id(txt_searchdata)).sendKeys(search_PIM);
			   driver.findElement(By.xpath(searchbtn)).click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(checkbox)).click();
			   System.out.println("It had selected the records");
			   Reporter.log("It had selected the records");
			   Log.info("It had selected the records");
			   driver.findElement(By.xpath(delete_btn)).click();
			   Alert atts = driver.switchTo().alert();
			   System.out.println(atts.getText());
			   atts.accept();
			   driver.switchTo().defaultContent();

			   System.out.println("Data has been deleted successfully");
			   Reporter.log("Data has been deleted successfully");
			   Log.info("Data has been deleted successfully");
		   }
		   
		   public void persondetail_PIM_EmployeeList() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtlast)).sendKeys(txt_last);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.name(txtFirst)).sendKeys(txt_first);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			   WebElement file = driver.findElement(By.id(photo_id));
			   file.sendKeys("E:\\paper 3.jpeg");
			   System.out.println("Photo uploaded successfully");
			   Reporter.log("Photo uploaded successfully");
			   Log.info("Photo uploaded successfully");
			   driver.findElement(By.xpath(save_btnpay)).click();
			   System.out.println("PIM Employee has been Added");
			   Reporter.log("PIM Employee has been Added");
			   Log.info("PIM Employee has been Added");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(personal_edit)).click();
			   driver.findElement(By.id(personal_DOB)).sendKeys(DOB);
			   System.out.println("Date of Birth has been added ");
			   Reporter.log("Date of Birth has been added ");
			   Log.info("Date of Birth has been added ");
			   Select st = new Select(driver.findElement(By.name(personal_marriage)));
			   st.selectByVisibleText("Unmarried");
			   driver.findElement(By.name(personal_checbox)).click();
			   driver.findElement(By.id(personal_gender)).click();
			   System.out.println("Gender has been selected");
			   Reporter.log("Gender has been selected");
			   Log.info("Gender has been selected");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(personal_edit)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("Personal Details Edit Successfully");
			   Reporter.log("Personal Details Edit Successfully");
			   Log.info("Personal Details Edit Successfully");
			  
		   }
		   
		   public void Reset_persondetail_PIM_EmployeeList() {
			   Actions at = new Actions(driver);
			   at.moveToElement(driver.findElement(By.linkText(PIM_item))).perform();
			   driver.findElement(By.linkText(employee_menu)).click();
			   driver.switchTo().frame(frame);
			   System.out.println("It has entered into the Employee List");
			   Reporter.log("It has entered into the Employee List");
			   Log.info("It has entered into the Employee List");
			   driver.findElement(By.xpath(save_btn)).click();
			   driver.findElement(By.name(txtlast)).sendKeys(txt_last);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.name(txtFirst)).sendKeys(txt_first);
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			   WebElement file = driver.findElement(By.id(photo_id));
			   file.sendKeys("E:\\paper 3.jpeg");
			   System.out.println("Photo uploaded successfully");
			   Reporter.log("Photo uploaded successfully");
			   Log.info("Photo uploaded successfully");
			   driver.findElement(By.xpath(save_btnpay)).click();
			   System.out.println("PIM Employee has been Added");
			   Reporter.log("PIM Employee has been Added");
			   Log.info("PIM Employee has been Added");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.name(personal_edit)).click();
			   driver.findElement(By.id(personal_DOB)).sendKeys(DOB);
			   System.out.println("Date of Birth has been added ");
			   Reporter.log("Date of Birth has been added ");
			   Log.info("Date of Birth has been added ");
			   Select st = new Select(driver.findElement(By.name(personal_marriage)));
			   st.selectByVisibleText("Unmarried");
			   driver.findElement(By.name(personal_checbox)).click();
			   driver.findElement(By.id(personal_gender)).click();
			   System.out.println("Gender has been selected");
			   Reporter.log("Gender has been selected");
			   Log.info("Gender has been selected");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   driver.findElement(By.id(personal_Reset)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("Personal Details has been reset Successfully");
			   Reporter.log("Personal Details has been reset Successfully");
			   Log.info("Personal Details has been reset Successfully");
		   }
		   
		   public void contactdetails_PIM_EmployeeList()
		   {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[26]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(linktext_Contact)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 			   driver.findElement(By.id(txt_Edit)).click();
 			  System.out.println("Click on the Edit Button");
 			  Reporter.log("Click on the Edit Button");
 			  Log.info("Click on the Edit Button");
 			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			   Select st = new Select(driver.findElement(By.name(dropdown)));
			   st.selectByVisibleText(dropdown_list);
			   driver.findElement(By.name(txt_address)).sendKeys(txtaddress);
			   driver.findElement(By.name(txt_City)).sendKeys(txtCity);
			   driver.findElement(By.name(txt_state)).sendKeys(txtState);
			   driver.findElement(By.name(contacttxt_ZIp)).sendKeys(txtZip);
			   driver.findElement(By.name(txt_mobile)).sendKeys(txtphone);
			   driver.findElement(By.name(txt_Email)).sendKeys(txtemail_);
			   driver.findElement(By.id(txt_Edit)).click();
 			   driver.switchTo().defaultContent();
			   System.out.println("Empolyee Contact has been added Successfully");
			   Reporter.log("Empolyee Contact has been added Successfully");
			   Log.info("Empolyee Contact has been added Successfully");
		   }
		   
		   public void reset_contactDetail_PIM_EmployeeList() {
			      JavascriptExecutor js = (JavascriptExecutor) driver;
	  			   driver.switchTo().frame(frame);
				   System.out.println("Entering into the Frame");
				   Reporter.log("Entering into the Frame");
				   Log.info("Entering into the Frame");
			       //scroll the page 
				   js.executeScript("window.scrollBy(0,500)");
					   System.out.println("Page needs to scroll");
					   Reporter.log("Page needs to scroll");
					   Log.info("Page needs to scroll");
					//Actions at = new Actions(driver);
				driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[26]/td[3]/a")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.linkText(linktext_Contact)).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 			   driver.findElement(By.id(txt_Edit)).click();
	 			  System.out.println("Click on the Edit Button");
	 			  Reporter.log("Click on the Edit Button");
	 			  Log.info("Click on the Edit Button");
	 			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				   Select st = new Select(driver.findElement(By.name(dropdown)));
				   st.selectByVisibleText(dropdown_list);
				   driver.findElement(By.name(txt_address)).sendKeys(txtaddress);
				   driver.findElement(By.name(txt_City)).sendKeys(txtCity);
				   driver.findElement(By.name(txt_state)).sendKeys(txtState);
				   driver.findElement(By.name(contacttxt_ZIp)).sendKeys(txtZip);
				   driver.findElement(By.name(txt_mobile)).sendKeys(txtphone);
				   driver.findElement(By.name(txt_Email)).sendKeys(txtemail_);
				   driver.findElement(By.id(txt_Contact)).click();
	 			   driver.switchTo().defaultContent();
				   System.out.println("Empolyee Contact has been reset Successfully");
				   Reporter.log("Empolyee Contact has been reset Successfully");
				   Log.info("Empolyee Contact has been reset Successfully");
		   }
		   
		   public void Emergency_Contact_PIM_EmployeeList() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[26]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(txr_Emergency)).click();
			driver.findElement(By.name(txt_emerge_name)).sendKeys(emerge_contact);
			driver.findElement(By.name(txt_emerg_relat)).sendKeys(emerg_contac_rel);
			driver.findElement(By.name(emerge_phone)).sendKeys(emerg_phone);
			driver.findElement(By.name(emerg_save)).click();
			driver.switchTo().defaultContent();
			System.out.println("Emergency Contact Saved Successfully");
			Reporter.log("Emergency Contact Saved Successfully");
			Log.info("Emergency Contact Saved Successfully");
			
		   }
		   
		   public void Reset_Emergency_Contact_PIM_EmployeeList() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[26]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(txr_Emergency)).click();
			driver.findElement(By.name(txt_emerge_name)).sendKeys(emerge_contact);
			driver.findElement(By.name(txt_emerg_relat)).sendKeys(emerg_contac_rel);
			driver.findElement(By.name(emerge_phone)).sendKeys(emerg_phone);
			driver.findElement(By.xpath(emrge_Reset)).click();
			driver.switchTo().defaultContent();
			System.out.println("Emergency Contact Reset Successfully");
			Reporter.log("Emergency Contact Reset Successfully");
			Log.info("Emergency Contact Reset Successfully");
		   }
		   
		   public void dependant_PIM_EmployeeList() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.linkText(depeent_txt)).click();
			   driver.findElement(By.name(dependnt_name)).sendKeys(dependt_name);
			   driver.findElement(By.name(dependent_rel)).sendKeys(depent_rel);
			   driver.findElement(By.name(dependt_save)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("Dependant Data has been Saved Successfully ");
			   Reporter.log("Dependant Data has been Saved Successfully ");
			   Log.info("Dependant Data has been Saved Successfully ");
		   }
		   
		   public void reset_Dependant_PIM_Employee() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			   driver.findElement(By.linkText(depeent_txt)).click();
			   driver.findElement(By.name(dependnt_name)).sendKeys(dependt_name);
			   driver.findElement(By.name(dependent_rel)).sendKeys(depent_rel);
			   driver.findElement(By.xpath(depandnt_xpath)).click();
			   driver.switchTo().defaultContent();
			   System.out.println("Dependant Data has been Saved Successfully ");
			   Reporter.log("Dependant Data has been Saved Successfully ");
			   Log.info("Dependant Data has been Saved Successfully ");
		   }
		   
		   public void imigration_PIM_EmployeeList() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(link_imigrati)).click();
			driver.findElement(By.name(passportno)).sendKeys(passport_no);
			driver.findElement(By.name(txtStatus)).sendKeys(idstatuse);
			driver.findElement(By.id(txt_star_rev)).sendKeys(idstus_revi);
			Select st= new Select(driver.findElement(By.name(countr_drop)));
			st.selectByVisibleText("India");
			driver.findElement(By.name(txt_issuedate)).sendKeys(issue_date);
			driver.findElement(By.name(txt_expirydate)).sendKeys(expiry_date);
			driver.findElement(By.name(comment_txt)).sendKeys(impg_comment);
			driver.findElement(By.name(add_imagi)).click();
			driver.switchTo().defaultContent();
			System.out.println("Imigration Data has been Saved Successfully");
			Reporter.log("Imigration Data has been Saved Successfully");
			Log.info("Imigration Data has been Saved Successfully");
			  
		   }
		   
		   public void reset_Imigration_PIM_EmployeeList() {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(link_imigrati)).click();
			driver.findElement(By.name(passportno)).sendKeys(passport_no);
			driver.findElement(By.name(txtStatus)).sendKeys(idstatuse);
			driver.findElement(By.id(txt_star_rev)).sendKeys(idstus_revi);
			Select st= new Select(driver.findElement(By.name(countr_drop)));
			st.selectByVisibleText("India");
			driver.findElement(By.name(txt_issuedate)).sendKeys(issue_date);
			driver.findElement(By.name(txt_expirydate)).sendKeys(expiry_date);
			driver.findElement(By.name(comment_txt)).sendKeys(impg_comment);
			driver.findElement(By.xpath(reset_imigr)).click();
			driver.switchTo().defaultContent();
			System.out.println("Imigration Data has been Reset Successfully");
			Reporter.log("Imigration Data has been Reset Successfully");
			Log.info("Imigration Data has been Reset Successfully");
			
		   }
		   
		   public void photograph_PIM_EmployeeList() {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(photo_link)).click();
			WebElement st = driver.findElement(By.id(photo_id));
			st.sendKeys("E:\\paper 3.jpeg");
			driver.findElement(By.xpath(save_photo)).click();
			driver.switchTo().defaultContent();
			System.out.println("Photo has been added successfully");
			Reporter.log("Photo has been added successfully");
			Log.info("Photo has been added successfully");
		   }
		   
		   public void Job_PIM_EmployeeList() throws Exception {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[26]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(job_link)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.findElement(By.id(edit_job)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Select st = new Select(driver.findElement(By.id(jb_title)));
			st.selectByVisibleText("TataIPL");
			System.out.println("Job title Selected");
			Reporter.log("Job title Selected");
			Log.info("Job title Selected");
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(5000);
			Select ste =  new Select(driver.findElement(By.id(emp_stu_drop)));
			ste.selectByVisibleText("Terminated");
			System.out.println("Employment status Selected");
			Reporter.log("Employment status Selected");
			Log.info("Employment status Selected");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			Select stEE	= new Select(driver.findElement(By.id(EEO_drop)));
			stEE.selectByVisibleText("OFFICIALS AND ADMINISTRATORS");
			System.out.println("EEO Category Selected");
			Reporter.log("EEO Category Selected");
			Log.info("EEO Category Selected");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			driver.findElement(By.id(date_JOE)).sendKeys(joe_date);
			Thread.sleep(4000);
			
			// Not able to locate the Windows based application

			/*driver.findElement(By.name(txt_loc)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			WebElement wt = driver.findElement(By.linkText(win_data));
			wt.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				*/
			Select stloc= new Select(driver.findElement(By.id(location_txt)));
			stloc.selectByVisibleText(loc_text);
			
			driver.findElement(By.id(assign_txt)).click();
			System.out.println("It has assigned the Locations");
			Reporter.log("It has assigned the Locations");
			Log.info("It has assigned the Locations");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			driver.findElement(By.id(edit_job)).click();
			driver.switchTo().defaultContent();
			System.out.println("Job has been saved successfully");
			Reporter.log("Job has been saved successfully");
			Log.info("Job has been saved successfully");
			
		   }
		   
		   public void reset_Job_PIMEmployeeList() throws Exception {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[29]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(job_link)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.findElement(By.id(edit_job)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Select st = new Select(driver.findElement(By.id(jb_title)));
			st.selectByVisibleText("TataIPL");
			System.out.println("Job title Selected");
			Reporter.log("Job title Selected");
			Log.info("Job title Selected");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(5000);
			Select ste =  new Select(driver.findElement(By.id(emp_stu_drop)));
			ste.selectByVisibleText("Terminated");
			System.out.println("Employment status Selected");
			Reporter.log("Employment status Selected");
			Log.info("Employment status Selected");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			Select stEE	= new Select(driver.findElement(By.id(EEO_drop)));
			stEE.selectByVisibleText("OFFICIALS AND ADMINISTRATORS");
			System.out.println("EEO Category Selected");
			Reporter.log("EEO Category Selected");
			Log.info("EEO Category Selected");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			driver.findElement(By.id(date_JOE)).sendKeys(joe_date);
			Thread.sleep(4000);
			
			// Not able to locate the Windows based application

			/*driver.findElement(By.name(txt_loc)).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

			WebElement wt = driver.findElement(By.linkText(win_data));
			wt.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				*/
			Select stloc= new Select(driver.findElement(By.id(location_txt)));
			stloc.selectByVisibleText(loc_text);
			
			driver.findElement(By.id(assign_txt)).click();
			System.out.println("It has assigned the Locations");
			Reporter.log("It has assigned the Locations");
			Log.info("It has assigned the Locations");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			driver.findElement(By.id(reset_job)).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			System.out.println("Job has been reset successfully");
			Reporter.log("Job has been reset successfully");
			Log.info("Job has been reset successfully");
		   }
		   
		   public void salary_PIM_EmployeeList()  throws Exception   {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[20]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(salay_link)).click();
			
			Select st = new Select (driver.findElement(By.id(text_paygrade)));
			st.selectByVisibleText(" KPMG ");
			System.out.println("Selected the Pay Grade");
			Reporter.log("Selected the Pay Grade");
			Log.info("Selected the Pay Grade");
			Thread.sleep(4000);
			driver.findElement(By.name(txt_bas_curre)).sendKeys(basic_pay_Aus);
			Thread.sleep(4000);
			Select stpe = new Select(driver.findElement(By.id(drop_month_sal)));
			stpe.selectByVisibleText("Monthly");
			
			driver.findElement(By.id(btn_slary)).click();
			driver.switchTo().defaultContent();
			System.out.println("Salary Added with selected data");
			Reporter.log("Salary Added with selected data");
			Log.info("Salary Added with selected data");
		   }
		   
		   public void reset_salary_PIM_EmployeeList() throws Exception {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[23]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(salay_link)).click();
			
			Select st = new Select (driver.findElement(By.id(text_paygrade)));
			st.selectByVisibleText(" KPMG ");
			System.out.println("Selected the Pay Grade");
			Reporter.log("Selected the Pay Grade");
			Log.info("Selected the Pay Grade");
			Thread.sleep(4000);
			driver.findElement(By.name(txt_bas_curre)).sendKeys(basic_pay_Aus);
			Thread.sleep(4000);
			Select stpe = new Select(driver.findElement(By.id(drop_month_sal)));
			stpe.selectByVisibleText("Monthly");
			driver.findElement(By.xpath(btn_salry_rest)).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			System.out.println("Salary Added with selected data");
			Reporter.log("Salary Added with selected data");
			Log.info("Salary Added with selected data");
		   }
		   
		   public void work_Experience_PIM_EmployeeList() throws Exception {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[30]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(link_work)).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(txt_work_ex)).sendKeys(txt_workexp);
			driver.findElement(By.id(work_start)).sendKeys(txt_work_start);
			driver.findElement(By.name(txt_workstitle)).sendKeys(txt_wortitle);
			driver.findElement(By.id(txt_workenddate)).sendKeys(txt_enddate);
			driver.findElement(By.id(work_Save)).click();
			driver.switchTo().defaultContent();
			System.out.println("Work Experience has been add Successfully");
			Reporter.log("Work Experience has been add Successfully");
			Log.info("Work Experience has been add Successfully");
		   }
		   
		   public void reset_workExperience_PIM_Employeelist()  throws Exception {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
  			   driver.switchTo().frame(frame);
			   System.out.println("Entering into the Frame");
			   Reporter.log("Entering into the Frame");
			   Log.info("Entering into the Frame");
		       //scroll the page 
			   js.executeScript("window.scrollBy(0,500)");
				   System.out.println("Page needs to scroll");
				   Reporter.log("Page needs to scroll");
				   Log.info("Page needs to scroll");
				//Actions at = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[14]/td[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText(link_work)).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(txt_work_ex)).sendKeys(txt_workexp);
			driver.findElement(By.id(work_start)).sendKeys(txt_work_start);
			driver.findElement(By.name(txt_workstitle)).sendKeys(txt_wortitle);
			driver.findElement(By.id(txt_workenddate)).sendKeys(txt_enddate);
			Thread.sleep(4000);
			driver.findElement(By.xpath(reset_work)).click();
			driver.switchTo().defaultContent();
			System.out.println("Work Experience has been reset Successfully");
			Reporter.log("Work Experience has been reset Successfully");
			Log.info("Work Experience has been reset Successfully");
		   }
		   
	public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout from Application");
		Reporter.log("Logout from Application");
		Log.info("Logout from Application");
	}
	
	
	
}
