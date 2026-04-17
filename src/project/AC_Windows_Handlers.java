package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
 
public class AC_Windows_Handlers {
	static String username= "admin";
	static String password = "admin";
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println("Clicking on the new Tab of chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("2nd Tab in login done");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println("3rd Tab is created");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println("Entering the 1st tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    driver.switchTo().window(tabs.get(1));
	    System.out.println("Returning to the Tab 1");
	    Thread.sleep(4000);
	    driver.switchTo().window(tabs.get(2));
	    System.out.println("Again return to 2st Tab");
	   Thread.sleep(4000);
	   driver.switchTo().window(tabs.get(0));
	    System.out.println("Again return to 1st Tab");
	   Thread.sleep(4000);
	   driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.close();
		System.out.println("1st tab is closed");
		driver.quit();
	}

}
