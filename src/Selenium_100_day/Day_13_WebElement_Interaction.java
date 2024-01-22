package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_13_WebElement_Interaction {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");
		
		/*NOTE:*/
		/*1.Find out the web element of the linked in logo*/
		/*2.Store that web element variable into the web element*/
		/*3.Use isDisplayed method to find out that logo displayed or not*/
		/*4.Store that value into boolean variable*/
		/*5.Write a condition and pass the boolean variable inot that IF condition */
		
		WebElement logo = driver.findElement(By.id("linkedin-logo"));
		logo.click();
		
		boolean status = logo.isDisplayed();
		
		System.out.println("value of the logo :"+status);
		
		if (status) 
		{
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is not displayed");
		}

		driver.quit();
	}

}
