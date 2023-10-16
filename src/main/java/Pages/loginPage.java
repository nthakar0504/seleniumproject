package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage  extends BasePage {
	// 1. Page Elements   //3 WebDriver
		
	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	// 2. Page Actions
	
	public void enterUserName(String usr) {
		username.sendKeys(usr);
	}
	public void enterPassword(String passwd) {
		pwd.sendKeys(passwd);
	}

	public void clickLogin() {
		loginBtn.click();
	}
	
}
