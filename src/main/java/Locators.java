import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("user-name"));
		driver.findElement(By.name("password"));
		driver.findElement(By.tagName("form"));
		driver.findElement(By.tagName("title"));
		driver.findElement(By.className("btn_action"));
		driver.findElement(By.cssSelector("input#login-button"));    // combination of id and className
		driver.findElement(By.cssSelector("input.btn_action"));
		driver.findElement(By.xpath("//input[@type='submit']"));
		driver.findElement(By.name("login-button")).click();	
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Hom")).click();
		driver.quit();
	}

}
