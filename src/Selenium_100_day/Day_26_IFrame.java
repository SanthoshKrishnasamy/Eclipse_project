package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_26_IFrame {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		// Finding the Frame webelement
		WebElement Iframe = driver.findElement(By.id("frame1"));
		
		//Switch to that frame
		driver.switchTo().frame(Iframe);
		
		//Get text from the frame whoch we are
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		String frame_text = frameText.getText();
		System.out.println(frame_text);
	}

}
