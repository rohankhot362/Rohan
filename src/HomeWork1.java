import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;


public class HomeWork1 {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  driver.get("https://www.bluestone.com/");
		 driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		 
		 driver.findElement(By.xpath("//img[@alt='The Thom Ring']")).click();
		 java.util.Set<String> window = driver.getWindowHandles();
		 ArrayList<String> win =new ArrayList<>(window);
		 driver.switchTo().window(win.get(1));
		 driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		WebElement error= driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		 System.out.println(error.getText());
		
		
	}
}
