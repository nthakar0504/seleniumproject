
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html"); //1, faster
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String firstTab = (String)windowHandles.toArray()[0];
		String secondTab = (String)windowHandles.toArray()[1];
		driver.switchTo().window(secondTab);
		Thread.sleep(500);
		driver.switchTo().window(firstTab);
		Thread.sleep(500);
		driver.switchTo().window(secondTab);
		Thread.sleep(500);
		driver.switchTo().window(firstTab);
		Thread.sleep(500);
		driver.switchTo().window(secondTab);
		Thread.sleep(500);
		driver.switchTo().window(firstTab);
		// Practice: https://demoqa.com/browser-windows
		driver.quit();
	}

}
