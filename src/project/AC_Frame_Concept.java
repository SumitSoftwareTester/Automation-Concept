package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AC_Frame_Concept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfullly");
		Thread.sleep(4000);
		//Frame Concept started
		System.out.println("Frame Concept started");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value= 'Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("HRMS");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Project");
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("Employee Add Successfully");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		System.out.println("Frame Concept Ended");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		driver.close();
	}

}
