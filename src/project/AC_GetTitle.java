package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AC_GetTitle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(4000);
		System.out.println("Application Open");

		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) 
		{
			System.out.println("It match the title ");
		}
		else {
			System.out.println("It's not match the title");
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successful");
		
		if(driver.getTitle().equals("Orange")) {
			System.out.println("It match the Title");
		}
		else {
			System.out.println("It's not match the title");
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successful ");
		driver.close();
		System.out.println("Application Closed");

	}

}
