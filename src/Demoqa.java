import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoqa {
	public static void main(String[] args) throws InterruptedException {
		
	
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
  
		  driver.get("https://demoqa.com/alerts");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	  		 Alert a=driver.switchTo().alert();
		          a.accept();
		  
		  
		  driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		      Alert b=driver.switchTo().alert();
		      b.dismiss();
		      WebElement msg = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		      System.out.println(msg.getText());
		      
		      driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		      Alert c = driver.switchTo().alert();
		      c.sendKeys("Rohan");
		      WebElement ma = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		      System.out.println(ma.getText());
		     
		      
		      driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		      WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		      ww.until(ExpectedConditions.alertIsPresent());
		      Alert d =driver.switchTo().alert();
		      d.accept();
		      driver.close();
		      
		      
		      
	}
}

