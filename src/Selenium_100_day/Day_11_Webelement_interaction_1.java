package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_11_Webelement_interaction_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		
		// Here we are find out all the webelements
		WebElement username = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		WebElement SignIn = driver.findElement(By.cssSelector(".login__form_action_container"));
		
		WebElement ShowAndHide = driver.findElement(By.id("password-visibility-toggle"));
		
		// here we are passing some values or doing some actions on the webelement
		username.sendKeys("look4");
		
		password.sendKeys("Sanths");
		
		SignIn.click();
		
		ShowAndHide.click();
		
	}

}
