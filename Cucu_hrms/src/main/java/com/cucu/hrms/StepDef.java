package com.cucu.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	public WebDriver driver;
	
	@Given("Open Application")
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Application Open");
		Reporter.log("Application Open");
	}
	
	@When("Provide Login Credential")
	public void ProvideLoginCredential(){
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}
	
	@When("Logout")
	public void logoutpage() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout from Application");
		Reporter.log("Logout from Application");
	}
	
	@When("Verify Title")
	public void verifytitle() {
		
		if(driver.getTitle().equals("Orange HRMS")) {
			System.out.println("Title Matched");
			Reporter.log("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
			Reporter.log("Title Not Matched");
			System.out.println(driver.getTitle());
	}
}
	@When("Add Employee")
	public void addEmployee() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Project");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Cucumber");
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee added Successfully");
		Reporter.log("Employee Added Successfully");
		
	}

	@Then("Close Application")
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
	}
}