package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AC_DropDown_Select {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		System.out.println("Login Successfully");
		System.out.println("Entering into frame");
		driver.switchTo().frame("rightMenu");
		//Selecting the dropdown data
		Select st = new Select(driver.findElement(By.name("loc_code")));
		//st.selectByVisibleText("Emp. ID");
		st.selectByIndex(1);
		Thread.sleep(4000);
		driver.findElement(By.name("loc_name")).sendKeys("0030");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(4000);
		System.out.println("Employee Id is deleted");
		driver.switchTo().defaultContent();
		System.out.println("Existing from Frame");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		driver.close();
		
	}

}
