package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_9_Locaters {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Here we are deeling with locaters know as " X-path" */
		
		// NOTE : If we are using the above syntax we should be aware which tag or should mention * instead
		
		// The x-path syntax is "//input or * [ @tag = ' value ']" <-- from // to ] should metion inside the "" qoutes
		WebElement username = driver.findElement(By.xpath(" //input[@id=\"username\"] "));
		username.sendKeys("Santhosh");
		
		WebElement password = driver.findElement(By.xpath(" //input[@id='password'] ")); 
		password.sendKeys("Santhosh");
		
		WebElement signin = driver.findElement(By.xpath(" //button[@type='submit'] "));
		signin.click();
		
		// The x-path syntax is "//input or * [ text() = ' value ']" <-- from // to ] should metion inside the "" qoutes
		WebElement joinnow = driver.findElement(By.xpath(" //a[text()='Join now'] "));
		joinnow.click();
		
		driver.quit();
		
		
	}

}


