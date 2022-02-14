import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Herokuapp {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );	
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();

		  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  TakesScreenshot ts =(TakesScreenshot) driver;
		  
		  File ss=ts.getScreenshotAs(OutputType.FILE);
		  File sss=new File("./screenshot/herokuapp.png");
		  Files.copy(ss, sss);
		
		  
		  
	}

}
