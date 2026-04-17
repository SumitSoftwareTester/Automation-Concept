package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AC_PopUp_Alerts {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
 		Alert a = driver.switchTo().alert();
 		System.out.println(a.getText());
		a.accept();
		Thread.sleep(4000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfull");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		driver.close();
		

		
	}

}
