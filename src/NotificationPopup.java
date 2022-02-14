import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","software/chromedriver.exe" );
		  ChromeOptions co = new ChromeOptions();
	      co.addArguments("--disable-notifications");                   //--disable-notifications is case sensitive
	       WebDriver driver = new ChromeDriver(co);                     //constructer overloading
		  driver.manage().window().maximize();
		  driver.get("https://www.justdial.com/");

	}
}
 