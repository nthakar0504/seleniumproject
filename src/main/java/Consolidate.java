import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Consolidate {
	@Test
	public void BasicOperations() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		WebElement credentials = driver.findElement(By.xpath("//h4[text()= 'Accepted usernames are:']"));
		System.out.println(credentials.getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		button.click();
		driver.quit();
	}
	@Test
	public void booleanOperations() {
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
		driver.quit();   
	}
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
		System.out.println("Table Rows: "+ rows.size());
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
	@Test
	public void findElement() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement single = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		List<WebElement> multiple = driver.findElements(By.xpath("//input[@type='text']"));//2
		System.out.println(multiple.size());
		driver.quit();
	}
	@Test
	public void Alerts() throws InterruptedException {
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
	@Test
	public void HandleDropDown() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement skills = driver.findElement(By.id("Skills"));
		Select sel = new Select(skills);
		List<WebElement> alloptions = sel.getOptions();  // code
		System.out.println(alloptions);
		sel.selectByValue("iPhone");
		sel.selectByVisibleText("Mobile");
		sel.selectByIndex(4);
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.name("cars"));
		Select multi = new Select(cars);
		multi.selectByIndex(0);
		multi.selectByValue("audi");
		multi.selectByVisibleText("Opel");
		multi.deselectByValue("audi");
		multi.deselectAll();
		boolean x = multi.isMultiple();
		System.out.println(x);
		driver.quit();
	}
	
	public void Frames() {
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
	@Test
	public void HandleTabs() throws InterruptedException {
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
	@Test
	public void inPrivateWindow() throws InterruptedException {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void ActionsClass() throws InterruptedException {
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
	
	@Test
	public void Locators() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("user-name"));
		driver.findElement(By.name("password"));
		driver.findElement(By.tagName("form"));
		driver.findElement(By.tagName("title"));
		driver.findElement(By.className("btn_action"));
		driver.findElement(By.cssSelector("input#login-button"));    // combination of id and className
		driver.findElement(By.cssSelector("input.btn_action"));
		driver.findElement(By.xpath("//input[@type='submit']"));
		driver.findElement(By.name("login-button")).click();	
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Hom")).click();
		driver.quit();
	}
	@Test
	public void navigate() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html"); //1, faster
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com"); // 2, 
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}
	@Test
	public void JSExcecutor() {
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
