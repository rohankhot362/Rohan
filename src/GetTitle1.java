import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1 {
	
	public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  String title = driver.getTitle();
	 System.out.println(title);
	 System.out.println(driver.getCurrentUrl());
	  
}
}