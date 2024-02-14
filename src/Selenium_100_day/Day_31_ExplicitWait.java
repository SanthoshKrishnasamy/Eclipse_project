package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day_31_ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");

		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// Explicitly mention to wait for this particular webelement get load
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		username.sendKeys("san");
		
		driver.quit();
				
		
	}

}
