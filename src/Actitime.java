import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Actitime {
	public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  Thread.sleep(2000); tumchya badalyat gheto varale
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager",Keys.ENTER);
	 WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
	 ww.until(ExpectedConditions.titleContains("Enter"));
	 driver.findElement(By.xpath("//a[@class='logout']")).click();

	}
}
