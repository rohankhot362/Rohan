
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTested {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement Search = driver.findElement(By.xpath("//input[@type='text']"));
	  Search.sendKeys("Java",Keys.ENTER);
	  driver.navigate().back();
	  Search.sendKeys("Selenium",Keys.ENTER);

	  
	  
}
}