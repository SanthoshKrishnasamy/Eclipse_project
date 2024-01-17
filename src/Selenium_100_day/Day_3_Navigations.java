package Selenium_100_day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_3_Navigations {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().back();
		
		System.out.println("After back "+driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println("After forward "+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		System.out.println("After Refresh "+driver.getCurrentUrl());
		
	}

}
