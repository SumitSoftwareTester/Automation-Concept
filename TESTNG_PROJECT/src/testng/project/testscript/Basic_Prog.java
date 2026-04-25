package testng.project.testscript;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Basic_Prog {
	

	@BeforeClass
	public void first() {
		System.out.println("First_Method");
	}
	@Test
	public void secon() {
		System.out.println("Second Method");
	}
	@Test
	public void third() {
		System.out.println("Third Method");
	}
	@AfterClass
	public void forth() {
		System.out.println("Forth Method");
	}
}
