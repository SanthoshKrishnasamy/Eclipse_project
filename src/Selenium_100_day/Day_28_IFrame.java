package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_28_IFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		int number_of_frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(number_of_frames);
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame1);
		
		WebElement frame_1_text = driver.findElement(By.id("sampleHeading"));
		String frame1Text = frame_1_text.getText();
		System.out.println(frame1Text);
		
		driver.quit();
		
		
	}

}
