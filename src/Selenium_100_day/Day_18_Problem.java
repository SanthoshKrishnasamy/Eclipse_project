package Selenium_100_day;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_18_Problem {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int NumberOfLinks = links.size();
		
		System.out.println("Total number of links presented : "+NumberOfLinks);
		
		System.out.println("All links are listed below :");
		
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		
		
		}
	}

