import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InPrivateWindow {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
