package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_15_WebElement_Interaction {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/checkbox");
		
		/*NOTE:*/
		/*1.Find out the web element of sign in button*/
		/*2.Store them into the web element variable and check whether isEnabeld or not with isEnabel method*/
		/*3.Store that boolean resule into the variable of boolean*/
		/*4.Write the codintion of IF and pass the boolean variable to check whether its enabeld or not*/
		
		WebElement checkbox = driver.findElement(By.cssSelector(".rct-checkbox"));
		
		checkbox.click();
		
		String checkboxText = checkbox.getAttribute("class");
		System.out.println("Text of checkBox: "+checkboxText);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*NOTE:*/
		/*1.Find out the web element of the text and strore them into web element*/
		/*2.Use getText method to get all text which is releated to that and store them into String variable*/
		/*3.Use sysout to print the text by pass the string arg to the method*/
		// BY using this we got the text after clicking the checkBox
		WebElement text = driver.findElement(By.id("result"));
		String FinalText = text.getText();
		System.out.print(FinalText);

	}

}
