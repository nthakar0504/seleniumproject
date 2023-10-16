package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {
	

	
	
	public productsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// 1. page elements 
	@FindBy(id= "item_4_title_link")
	private WebElement backPack;
	
	@FindBy(id="item_0_title_link")
	private WebElement bikeLight;
	  // Home Work add remaining products, add actions also
	
	//2. Page Action Methods
	
	public void clickBackPack() {
		backPack.click();
	}
	
	public void clickBikeLight() {
		bikeLight.click();
	}

}
