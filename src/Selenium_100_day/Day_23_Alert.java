package Selenium_100_day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_23_Alert {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		// Finding alert button webelement
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		
		alertButton.click();
		
		// Interacting with alert and  Priting the message from that alert.
		Alert alert = driver.switchTo().alert();
		
		
		String AlertMessage = alert.getText();
		
		System.out.println(AlertMessage);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Accepting the alert
		alert.accept();
	}

}
