package DemoTestNG;

import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void rohan()
	{
		
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  org.testng.Reporter.log("sachin", true);
		  driver.close();

	}
	@Test
	public void rohann()
	{
		
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  Assert.fail();
		  driver.close();

	}

}
