package Selenium_100_day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_23_Alert3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");


		// Finding webelement
		WebElement clickMe = driver.findElement(By.id("promtButton"));

		clickMe.click();

		// Interacting with Aleret and passing some values
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Santhosh");

		//Extracting the alert pop text
		String alertPopUpMeg =	alert.getText();
		System.out.println(alertPopUpMeg);


		//Alert accept
		alert.accept();
		
		WebElement meg = driver.findElement(By.id("promptResult"));
		String megfrompop = meg.getText();
		System.out.println(megfrompop);
	
		driver.quit();
		
		


	}

}
