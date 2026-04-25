package com.cucu.hrms;

 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/main/java/com/cucu/hrms",
	    glue = "com.cucu.hrms",
	    plugin = {"pretty", "html:target/cucumber-report.html"},
	    tags = "@VerifyTitle or @LoginPage"
 	)
public class TestRun extends AbstractTestNGCucumberTests {

}
