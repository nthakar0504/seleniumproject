import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Open the Browser
		driver.manage().window().maximize();  // Maximize the window
		driver.get("https://www.emirates.com");  // go to website
		System.out.println(driver.getTitle());    // print the title of website
		System.out.println(driver.getCurrentUrl()); // print the current URL
		driver.quit();        // Close the browser
	}

}
