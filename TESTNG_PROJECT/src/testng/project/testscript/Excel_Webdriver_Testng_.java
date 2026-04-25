package testng.project.testscript;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Excel_Webdriver_Testng_ {

WebDriver driver;
	
	@Test(priority= 1)
	
	public void login() throws Exception {
		
		driver.manage().window().maximize();
		
		FileInputStream  file = new FileInputStream("E:\\HRMS Project\\Login_Detail.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet  sh = wb.getSheet("Sheet1");
		
 		System.out.println(sh.getSheetName());
 		 		
 		
 		String us = sh.getRow(1).getCell(0).getStringCellValue();
 		String ps = sh.getRow(1).getCell(1).getStringCellValue();
 		System.out.println("Data has been fetched from excel");
 		Reporter.log("Data has been Fetched from Excel;");
 		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");

		driver.findElement(By.name("txtUserName")).sendKeys(us);
		driver.findElement(By.name("txtPassword")).sendKeys(ps);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Application Login");
		Reporter.log("Application Login");
 		file.close();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
  	}
	
	@AfterClass
	public void closeapplication() {
		driver.close();
		System.out.println("Close Application");
		Reporter.log("Application Close Application");
	}
	
	@Test
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Application Open");
		Reporter.log("Application Open");
	}
	
	@Test(priority= 2)
	public void addemployee() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Testng");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Data of");
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
 		System.out.println("Employee Added Successfully");	
 		Reporter.log("Employee Added Successfully");
	}
	
	@Test(priority=3)
	
	public void logut()
	{
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		Reporter.log("Logout Successfully");
	}
}
