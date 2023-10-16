package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends BasePage {


	
	public infoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="first-name")
	private WebElement fName;
	
	@FindBy(id="last-name")
	private WebElement lName;
	
	@FindBy(id= "postal-code")
	private WebElement zipCode;
	
	@FindBy(id= "continue")
	private WebElement cont;
	
	public void enterDetails() {
		fName.sendKeys("Manju");
		lName.sendKeys("M");
		zipCode.sendKeys("423432423423");
		cont.click();
	}
	
	
	
	
	
	
	
	
}
