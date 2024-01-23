package Selenium_100_day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_18_problem_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/checkbox");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		int NumberOfId = links.size();
		
		System.out.println("All id values are :"+NumberOfId);
		
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}

	}

}
