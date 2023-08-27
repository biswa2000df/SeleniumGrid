package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;

public class two extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testOne() {
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
		System.out.println(driver.getTitle()+" from edge");
		
	}
	
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
	driver=	initializeBrowser("edge");
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
