import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Coustomwait2 {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  driver.get("file:///C:/Users/HP/Downloads/WebDriverWait%20Examples/WebDriverWait%20Examples/sam1.html");
		  

           driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("name");
           System.out.println(driver.findElement(By.xpath("x")).getAttribute("value"));
           WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
	         ww.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver d ) {
			WebElement ele = d.findElement(By.xpath("//input[@name='textA']"));
			return ele.getAttribute("value").equalsIgnoreCase("name");
		}

	});
	         driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Rohan");
	}
}
