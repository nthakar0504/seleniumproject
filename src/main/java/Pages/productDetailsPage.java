package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePage {
	

	
	public productDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id= "add-to-cart-sauce-labs-backpack")
	private WebElement backPackAddToCart;
	
	@FindBy(name="remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(className= "inventory_details_price")
	private WebElement price;
	
	@FindBy(className = "shopping_cart_badge")
	private WebElement shoppingCart;
	
	public void clickBackPackAddToCart() {
		backPackAddToCart.click();
	}
	
	public void clickRemove() {
		remove.click();
	}
	
	public String getPrice() {
		return price.getText();
	}
	
	public void clickShoppingCart() {
		shoppingCart.click();
	}
	
	

}
