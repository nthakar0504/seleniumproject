import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class fileUpload {

	@Test
	public void upload() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@type='file']"));
		e.sendKeys("C:\\Users\\PC\\Pictures\\Saved Pictures\\Capture1.png");
		driver.quit();
	}
	
	@Test
	public void WebTable_Rows_Columns() {
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/PC/Desktop/page.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//table[@name='BookTable']"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Table Rows: "+ rows.size());  // 7
		for(WebElement e: rows) {
			System.out.println(e.getText());
		}
		List<WebElement> headers = driver.findElements(By.xpath("//table//th"));
		System.out.println("Table Headers: "+ headers.size());
		for(WebElement x: headers) {
			System.out.println(x.getText());
		}
		driver.quit();
	}
	@Test
	public void WebTableData() {
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/PC/Desktop/page.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();	
		List<WebElement> data = driver.findElements(By.xpath("//table//td"));
		System.out.println("Table Data: "+ data.size());
		for(WebElement d : data) {
			System.out.println(d.getText());
			String str = d.getText();
		}
		driver.quit();
	}
	// Practice: https://cosmocode.io/automation-practice-webtable/
	
	
	
	
}
