package Selenium_100_day;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_19_Broken_Link {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links : "+links.size());
		
		for (WebElement link : links) {
			
			String url = link.getAttribute("href");
			
			System.out.println(url);
			
			VerifyURL(url);
		}

	}
	
	private static void VerifyURL(String url) {
		
		try {
			URL links = new URL(url);
			
			HttpURLConnection HttpURLconnection = (HttpURLConnection) links.openConnection();
			HttpURLconnection.setConnectTimeout(3000);
			HttpURLconnection.connect();
			
			if (HttpURLconnection.getResponseCode()==200) {
				System.out.println(" - " + url + "is valid");
			} else {
				System.out.println(" - " + url + "is broken link .responseCode" +HttpURLconnection.getResponseCode());
			}
			
		} catch (Exception e) {
			System.out.println(" - " + url + "is a broken link" +e.getMessage());
		}
	
		
	}

}


