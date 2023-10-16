import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
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

}
