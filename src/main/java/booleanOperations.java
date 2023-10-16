import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class booleanOperations {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkbox1")).click();
		boolean x = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("Is Selected: "+ x);
		boolean y = driver.findElement(By.id("checkbox1")).isDisplayed();
		System.out.println("Is Displayed: " + y);
		boolean z = driver.findElement(By.id("checkbox1")).isEnabled(); // clickable
		System.out.println("Is Enabled: "+ z);
		driver.quit();   //
	}

}
