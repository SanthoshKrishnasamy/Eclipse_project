package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_8_Locaters {

	public static void main (String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.get("https://www.linkedin.com/login");
		
		/*Here we are deeling with locaters know as " LinkText, Partiall Linktext" */

		WebElement joinnow = driver.findElement(By.linkText("Join now"));
		joinnow.click();
		
		WebElement joinnow2 = driver.findElement(By.partialLinkText("Join now"));
		joinnow2.click();
		
		driver.close();

	}

}
