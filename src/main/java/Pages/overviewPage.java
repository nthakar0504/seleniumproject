package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends BasePage{
	


	public overviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="finish")
	private WebElement finish;
	
	public void clickFinish() {
		finish.click();
	}
	
	
}
