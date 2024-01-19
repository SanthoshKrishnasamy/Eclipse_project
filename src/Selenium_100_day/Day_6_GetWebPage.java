package Selenium_100_day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_6_GetWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		String webPage = "https://www.youtube.com/";
		
		driver.get(webPage);
		
		driver.navigate().to(webPage);
		
	}

}
