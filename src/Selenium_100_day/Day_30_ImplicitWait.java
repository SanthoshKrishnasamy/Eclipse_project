package Selenium_100_day;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_30_ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");
		
		/*Declaring implicit wait to load all the web element, So that we can get rid of the errors and exception because of 
		element not got loaded properly*/
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Santhosh");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Santhosh");
		
		WebElement singin = driver.findElement(By.xpath("//button[text()='Sign in']"));
		singin.click();
		
		driver.quit();
		
	}

}
