import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","./software/chromedriver1.exe" );	
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.get("https://www.google.co.in/");
  Thread.sleep(2000);
  driver.manage().window().minimize();
  



	}
		
	}


