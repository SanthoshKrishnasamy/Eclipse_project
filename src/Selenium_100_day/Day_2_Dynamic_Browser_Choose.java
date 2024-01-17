package Selenium_100_day;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_2_Dynamic_Browser_Choose {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the browser name :(chrome or firefox):");
		
		String Browserchoise = scanner.next().toLowerCase();
		
		WebDriver driver;
		
		switch (Browserchoise) 
		{
		case ("chrome"):
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case ("firefox"):
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\eclipse-workspace\\selenium\\resource\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.close();
		break;
		
		default:
			
			System.out.println("You have choosen invalid browser");
			
			break;
		}
	}

}
