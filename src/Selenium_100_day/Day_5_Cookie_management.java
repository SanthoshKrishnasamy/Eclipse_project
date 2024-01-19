package Selenium_100_day;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_5_Cookie_management {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");
		
		driver.get("https://www.youtube.com/");
	
		// By using this "getCookie" method we can able to get the current website cookie which we are accessed.
		Set<Cookie> cookie =driver.manage().getCookies();
		System.out.println("Im your cookie "+cookie);
		
		// By using this "addCookie" method we can able to set the cookie name.
		Cookie addCookie = new Cookie("SANTHOSH", "santhosh");
		driver.manage().addCookie(addCookie);
		System.out.println("Added cookie is "+addCookie);
		
		
		Cookie cookie1 =driver.manage().getCookieNamed("SANTHOSH");
		System.out.println("Specific cookie name "+cookie1);
		
		// By using this method "DeleteAllCookie" we can able to delete the cooie
		driver.manage().deleteAllCookies();
		
		// By using this method "getCookie" is able to get the current cookie
		Set<Cookie> cookie2=driver.manage().getCookies();
		System.out.println("After deleting cookies "+cookie2);
		
	}
}
