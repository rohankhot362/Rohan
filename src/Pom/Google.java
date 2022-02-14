package Pom;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
	@FindBy(name="q")
			private WebElement Search;
	
	
	

	public Google(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		
	}


	public void sendText(String txt) {
	   Search.sendKeys(txt,Keys.ENTER);
		
	}

}
