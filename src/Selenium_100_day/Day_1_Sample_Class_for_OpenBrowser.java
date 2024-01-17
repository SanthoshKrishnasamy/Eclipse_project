package Selenium_100_day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_1_Sample_Class_for_OpenBrowser {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\eclipse-workspace\\selenium\\resource\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
	}}