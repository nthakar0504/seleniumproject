import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement demo = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(demo);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345345345"+Keys.BACK_SPACE);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement parent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parent);
		WebElement child = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(child);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("ABC");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		// Practice: https://demoqa.com/frames
		driver.quit();
	}

}
