import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseActions {
	// Drag and drop, hover over, right click, double, sendkeys, click 
	
	static public void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement interaction = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		WebElement staTic = driver.findElement(By.xpath("//a[text()='Static ']"));
		Actions action = new Actions(driver);// CLassName obj = new ClassName();
		action.moveToElement(interaction).moveToElement(dragAndDrop).moveToElement(staTic).click().perform();		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));		
		WebElement drag = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement drop = driver.findElement(By.id("droparea"));
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		action.contextClick(drop).perform();  // Right click 
		Thread.sleep(2000);
		action.doubleClick(drag).perform();  // double click 
		Thread.sleep(2000);
		driver.quit();
	}

}
