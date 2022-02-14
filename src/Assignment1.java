import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  driver.get("https://www.google.co.in/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement search=  driver.findElement(By.xpath("//input[@name='q']"));
		 search.sendKeys("oneplus",Keys.ENTER);
		
		for(int i=1; i>0;) {
			WebElement next= driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
			next.click();
			
			
		}
		  
	}
	}

