package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;

public class one extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testOne() {
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
		System.out.println(driver.getTitle()+" from chrome");
		
	}
	
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
	driver=	initializeBrowser("chrome");
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
