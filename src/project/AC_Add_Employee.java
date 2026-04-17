package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AC_Add_Employee {

	static String username = "admin";
	static String password = "admin";
	static String Street1 = "Rashtriya Ganj";
	static String Street2 = "Phulwari Sharif";
	static String city = "Phulwari Sharif";
	static String state = "Bihar";
	static String zipcode = "801505";
	static String mobile = "9876543230";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		System.out.println("Login Successfully");
		Thread.sleep(4000);
		driver.switchTo().frame("rightMenu");
		System.out.println("Entering into the Frame");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Progamming");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Data Added");
		// Adding the File into the Employee
		Thread.sleep(4000);
		WebElement file = driver.findElement(By.id("photofile"));
			file.sendKeys("E:\\Noise_Buds_Image.jpg");
			System.out.println("Image added successfully");
		Thread.sleep(4000);
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("contactsLink")).click();
		driver.findElement(By.id("btnEditContact")).click();
		Thread.sleep(4000);
		System.out.println("Selecting the Dropdown data in contactlinks");
		Select st= new Select(driver.findElement(By.xpath("//select[@name= 'cmbCountry']")));
		Thread.sleep(4000);
		st.selectByValue("IN");
		Thread.sleep(4000);
		driver.findElement(By.name("txtStreet1")).sendKeys(Street1);
		driver.findElement(By.name("txtStreet2")).sendKeys(Street2);
		driver.findElement(By.id("cmbCity")).sendKeys(city);
		driver.findElement(By.id("txtState")).sendKeys(state);
		driver.findElement(By.name("txtzipCode")).sendKeys(zipcode);
		driver.findElement(By.name("txtMobile")).sendKeys(mobile);
		Thread.sleep(4000);
		driver.findElement(By.id("btnEditContact")).click();
		System.out.println("Contact Details data addedd successfully");
		driver.switchTo().defaultContent();
		System.out.println("Exist from the Frame");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfully");
		driver.close();
	}

}
