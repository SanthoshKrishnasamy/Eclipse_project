package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_7_Locaters_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// By using this method "Id" we can interact with the "Webelement"
		WebElement joinnow3 = driver.findElement(By.id("join_now"));
		joinnow3.click();

		// By using this method "name" we can interact with the "Webelement"
		WebElement password = driver.findElement(By.name("session_password"));
		password.sendKeys("SANTHOSH");

		// By using this method "tagName" we can interact with the "Webelement"
		WebElement tagname = driver.findElement(By.tagName("a")); 
		tagname.click();
		
		// By using this method "className" we can interact with the "Webelement"
		WebElement signIn = driver.findElement(By.className("login__form_action_container"));
		signIn.click();

	}

}
