

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new EdgeDriver();   //Open the browser
		driver.get("https://demoqa.com/broken");  //1. 
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]")); // 3	
		Thread.sleep(200);
        System.out.println("No of links are "+ links.size()); //count of links  // 3    
        for(WebElement e: links ) {
        	Thread.sleep(200);
        	String link = e.getAttribute("href"); // https://ww
        	System.out.println(link);
        	verifyLinks(link);
        }
	}
        public static void verifyLinks(String linkUrl)
        {
            try
            {
               URL url = new URL (linkUrl); // 1 
                //Now we will be creating url connection and getting the response code
                HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
                httpURLConnect.setConnectTimeout(5000);
                httpURLConnect.connect();
                if(httpURLConnect.getResponseCode()>=400 || httpURLConnect.getResponseCode()>=500)
                {
                	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
                }              
                //Fetching and Printing the response code obtained
                else{
                    System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
                }
            }catch (Exception e) {
          }

	}

}
