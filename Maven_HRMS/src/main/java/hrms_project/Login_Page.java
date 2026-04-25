package hrms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Page {

@Test
	public static void prog() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("txtUserName")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login into the Application");
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout from Application");
			driver.close();
	}

}
