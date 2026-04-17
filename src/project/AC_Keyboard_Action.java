package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class AC_Keyboard_Action {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		// Here we are using the KEYBOARD ACTION TO LOGIN 
		Robot r = new Robot();
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Login Successfully");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		
		driver.close();
		

	}

}
