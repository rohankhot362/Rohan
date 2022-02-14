import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Coustomwait {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  driver.get("file:///C:/Users/HP/Downloads/WebDriverWait%20Examples/WebDriverWait%20Examples/ButtonClick.html");
		  
WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
	ww.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver d) {
			WebElement ele=d.findElement(By.xpath("//input[@id='otherBtn']")) ;
			return ele.isEnabled() ;
		}
});



}
}