import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2 {
	public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
	  	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
 
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_N);
	  r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_N);

	}
 

}
