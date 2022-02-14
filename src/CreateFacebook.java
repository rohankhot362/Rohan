import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohan");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("gdsj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rohan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khot");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("4785439392");
		
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		 Select sday =new Select(day);
		 sday.selectByValue("9");
		

	}
	
}
