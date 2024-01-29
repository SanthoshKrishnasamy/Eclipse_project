package Selenium_100_day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_24_ConfirmationAlert {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		// finding webelement.
		WebElement ClickMe = driver.findElement(By.id("confirmButton"));
		ClickMe.click();
		
		//Interacting with alert button and print the message based on the button clicked
		Alert alert = driver.switchTo().alert();
		
		String alertMeg = alert.getText();
		
		System.out.println(alertMeg);
		
		//Accepting the alert
		alert.accept();
		
		//Dismiss the alert
		alert.dismiss();
		
		WebElement OkCancel = driver.findElement(By.id("confirmResult"));
		
		String megfromOKCancel = OkCancel.getText();
		
		System.out.println(megfromOKCancel);
		
		//Browser quit
		driver.quit();
		
		
		
		
	}

}
