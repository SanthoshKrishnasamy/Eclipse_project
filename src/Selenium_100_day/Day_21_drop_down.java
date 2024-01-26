package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_21_drop_down {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		// Finding each webelements
		WebElement username = driver.findElement(By.id("user-name"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement logIn = driver.findElement(By.id("login-button"));

		// Interacting with each webelement
		username.sendKeys("standard_user");

		password.sendKeys("secret_sauce");

		logIn.click();
		

		//dropDown Webelement finding

		WebElement filter = driver.findElement(By.className("product_sort_container"));

		// Drop down acctivity

		Select dropDown = new Select(filter);
		
		boolean  b = dropDown.isMultiple();
		
		System.out.println(b);
		
		driver.quit();
	}

}
