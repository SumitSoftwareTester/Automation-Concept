package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class AC_ScreenShot {

	static String username = "admin";
	static String password = "admin";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		try {
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		act.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Screen");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Shots");
		WebElement fileupload = driver.findElement(By.id("photofile"));
		fileupload.sendKeys("E:\\paper 3.jpeg");
		driver.switchTo().defaultContent();
		System.out.println("Employee added successfully with Photo");
	
		driver.findElement(By.linkText("Logout"));
		System.out.println("Logout from Application");
		driver.close();
		}
		catch (Exception e){
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("E:\\testres.png"));
		}
		driver.quit();
	}
}


