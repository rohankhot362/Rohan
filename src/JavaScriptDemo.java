import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  
		  
		  
		  
		//WebElement ele= driver.findElement(By.xpath(""));
		  
		  
//		  js.executeScript("window.scrollBy(0,1500)");
//	  Thread.sleep(3000);
//		  js.executeScript("window.scrollBy(0,-1500)");
//
		  
		  
		  
		  
//		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");     direct  top to bottom
//		  Thread.sleep(2000);
//		  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");        direct bottom to top
//		  
		  	  
	     js.executeScript("window.scrollBy(500,0)");                                //scroll left to right  index
		 Thread.sleep(2000);
	     js.executeScript("window.scrollBy(-500,0)");									//scroll left rto right
//		  
		  
//		  js.executeScript("window.scrollTo(document.body.scrollWidth,0)");              // scroll left to right direct
//		  Thread.sleep(2000);
//		  js.executeScript("-window.scrollTo(document.body.scrollWidth,0)");               //  scroll right to left direct
	}
}
