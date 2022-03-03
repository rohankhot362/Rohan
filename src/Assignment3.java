import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	public static void main(String[]args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager",Keys.ENTER);
	 
	 driver.findElement(By.xpath("//  div[@class='popup_menu_button popup_menu_button_support'] /div[@class='popup_menu_icon']/div[@class='menu_icon']")).click();
	 driver.findElement(By.xpath("//a[@onclick='MenuHandler.openAbout(); return false;']")).click();
	 
	WebElement txt= driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
	System.out.println(txt.getText());
	
	
	

	}

}
