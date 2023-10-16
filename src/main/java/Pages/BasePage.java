package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {   // Open close principle Open for extention, close for modification
							// new changes
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}

}
