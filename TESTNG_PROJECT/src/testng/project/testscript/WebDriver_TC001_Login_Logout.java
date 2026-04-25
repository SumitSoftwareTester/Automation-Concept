package testng.project.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
 import org.testng.annotations.Test;

public class WebDriver_TC001_Login_Logout {
	
	WebDriver driver;
	
	@Test(priority= 1)
	public void login() throws Exception{
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Application Login");
		Reporter.log("Application Login");
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void closeapplication() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Application Logout");
		Reporter.log("Application Logout");
		driver.close();
	}
	
	@Test
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
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
	

}
