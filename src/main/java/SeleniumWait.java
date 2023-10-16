import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWait {
	   // 1. Implicit wait( Page load) 2. Explicit wait( waiting for certain condition)
	WebDriver driver;
	@Test
	public void waitTypes() {
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ExplicitWait(driver.findElement(By.xpath("//input[@placeholder='First Name']")));
		driver.quit();
	}

	public void ExplicitWait(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	
}
