package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class AC_DragandDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		
		/*  Here we are giving the condition of title match , if the title would not match
			then the execution of program would stopped there. 
			
			If its match it will continue the execution of programs.
		*/
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Title Match");
		Thread.sleep(4000);
		driver.switchTo().frame(0); // in the URL ,there is no any name/id/next in https. So for that i have gone through index to check
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
						driver.findElement(By.id("droppable"))).perform();
		System.out.println("Draging the box into the place");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
