package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_12_WebElement_Interaction {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");

		/*NOTE :*/
		/*Here we are going to get the the error text from the input fields*/
		/*1.find out the web element of the sign in button*/
		/*2.click that button and produce the error*/
		/*3.Find out the error message web element Id and store them into the web element variable*/
		/*4.Get the text from that web element varibale and store them into string*/
		/*4.pass that string variable into the sysout and print*/
		
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signin.click();
		
		WebElement errorMeg = driver.findElement(By.id("error-for-username"));
		
		String error = errorMeg.getText();
		System.out.println("Error message of username field :"+error);
		
		/*NOTE:*/
		/*1.Here we figuered out the webelement of the password field*/
		/*2.store them into the web element variable*/
		/*3.Using getaAttribute value menthod to get the value of the attribute from the inspect page*/
		/*4.Storing that value into string variable and print them by using sysout*/
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		String passwordAttribute = password.getAttribute("aria-describedby");
		System.out.println("Attribute value :"+passwordAttribute);
		
		driver.quit();
	}

}
