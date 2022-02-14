import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

import java.awt.AWTException;
import java.awt.Window;





public class HomeWork2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='The Thom Ring']")).click();
		Set<String>
		 ArrayList<String> win =new ArrayList<>(Window);
		 driver.switchTo().window(win.get(1));
		 driver.findElement(By.xpath("//span[text()='8']")).click();
	//	driver.findElement(By.xpath("//span[@class='ring-size-box']"));
		
	}	

}
