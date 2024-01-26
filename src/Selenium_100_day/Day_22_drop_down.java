package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_22_drop_down {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		WebElement multiSelector = driver.findElement(By.id("multi-select"));

		// Using Select method for drop down handling
		Select dropdown = new Select(multiSelector);

		if (dropdown.isMultiple()) 
		{	
			dropdown.selectByIndex(2);
			dropdown.selectByValue("Florida");
			dropdown.selectByVisibleText("New Jersey");
		}
		
		// De-select
		
		dropdown.deselectByIndex(2);
		dropdown.deselectByValue("Florida");
		dropdown.deselectByVisibleText("New Jersey");
	}

}
