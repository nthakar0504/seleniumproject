import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicOperations {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		WebElement credentials = driver.findElement(By.xpath("//h4[text()= 'Accepted usernames are:']"));
		System.out.println(credentials.getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		button.click();
		driver.quit();
	}

}
