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
		
		// Here we are storing all links as webElement
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		// Here we used .size method to get to knopw how many links are there
		int NumberOfId = links.size();
		
		// Here we just print the count of the links
		System.out.println("All id values are :"+NumberOfId);
		
		// Here we looped all the links from "links" variable we are passing them into "link" 
		for (WebElement link : links) {
			// Here we using .getAttribute method to get all the links from "href" tag and we printed here
			System.out.println(link.getAttribute("href"));
		}

	}

}
