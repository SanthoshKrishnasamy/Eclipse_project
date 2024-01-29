package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_27_IFrame2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		
		driver.switchTo().frame(frame2);
		
		WebElement frame2Text = driver.findElement(By.id("sampleHeading"));
		String frame2heading = frame2Text.getText();
		System.out.println(frame2heading);
		
		driver.quit();
		

	}

}
