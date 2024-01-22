package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_14_WebElement_Interaction {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/login");
		
		/*NOTE:*/
		/*1.Find out the web element of sign in button*/
		/*2.Store them into the web element variable and check whether isEnabeld or not with isEnabel method*/
		/*3.Store that boolean resule into the variable of boolean*/
		/*4.Write the codintion of IF and pass the boolean variable to check whether its enabeld or not*/
		
		WebElement Signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
		Signin.click();
		
		boolean result = Signin.isEnabled();
		
		System.out.println("Boolean value of the sigin :"+result);
		
		if (result) {
			System.out.println("Sign in button is enable");
			
		} else {
			System.out.println("Sign in button is not enabel");

		}
		
		driver.quit();
	}

}
