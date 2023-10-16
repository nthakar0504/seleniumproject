import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {
		
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("OKTab")).click(); // to get the alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert input = driver.switchTo().alert();
		Thread.sleep(2000);
		input.sendKeys("Student");
		input.accept();
		driver.quit();
		//https://demoqa.com/alerts ---Practice
	}

}
