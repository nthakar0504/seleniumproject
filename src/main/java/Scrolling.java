import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement submit = driver.findElement(By.id("submitbtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submit);
		js.executeScript("window.scrollBy(1473, 14);"); // x, y coordinates
		WebElement refresh = driver.findElement(By.id("Button1"));
		js.executeScript("arguments[0].click();", refresh);
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		js.executeScript("arguments[0].value = arguments[1];", phone, "+9134343");
		driver.quit();
	}

}
