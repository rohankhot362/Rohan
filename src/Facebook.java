import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1`.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(2000);
	  driver.findElement( By.xpath("//input[@name='email']")).sendKeys("rohan");
	  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akya");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("desai");
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("a@123");
	  Thread.sleep(2000);
	  
	 WebElement  day=driver.findElement(By.xpath("//select[@title='Day']"));
	Select sday =new Select(day);
	 sday.selectByValue("9");
    	
	 WebElement  ak=driver.findElement(By.xpath("//select[@id='month']"));
     Select aks=new Select(ak);
     aks.selectByVisibleText("Dec");
     
   WebElement  yr=driver.findElement(By.xpath("//select[@id='year']"));
	 Select year=new Select(yr);
	 year.selectByIndex(2);

	 driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
	 driver.findElement(By.xpath("//button[contains(.,'Sign Up')]")).click();

}
}