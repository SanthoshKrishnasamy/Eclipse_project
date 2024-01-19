package Selenium_100_day;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_4_Window_Management {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		driver.get("https://www.youtube.com/");
		
		//It will maxmize the window will all options
		driver.manage().window().maximize();
		
		//It's comnpletly come up with full-screen where we can not see all the window options
		driver.manage().window().fullscreen();

		//By using this option we can cutomize the window size
		Dimension CustomSize = new Dimension(1000, 2000);
		driver.manage().window().setSize(CustomSize);
		
		// By using this methode we can customize the window position where excatly it has to be position
		Point customePosition = new Point(100, 200);
		driver.manage().window().setPosition(customePosition);
		
		// By using this method we can get the current window size
		Dimension customeSize = driver.manage().window().getSize();
		System.out.println("The current window size is :" +customeSize );
		
		//By using this methode we can get the position of current window
		driver.manage().window().setPosition(customePosition);
		System.out.println("Current window position :" +customePosition);
		
	}

}
