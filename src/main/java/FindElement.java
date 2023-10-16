import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement single = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		List<WebElement> multiple = driver.findElements(By.xpath("//input[@type='text']"));//2
		System.out.println(multiple.size());
		driver.quit();
	}

}
