package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_10_Locaters {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// The syntax for this CSS selector of "tag#id" --> "tag#tag attribute value" or "#attribute value"
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("santhosh");
		
		// The syntax for this css selector of "tag[attribute='attribute value']"
		WebElement password = driver.findElement(By.cssSelector("input[id=\"password\"]"));
		password.sendKeys("sa");
		
		// The syntax for this CSS selector of "tag.class" --> "tag.attribute value the classname" OR ".attribute value the classname"
		WebElement sign_in = driver.findElement(By.cssSelector(".login__form_action_container "));
		sign_in .click();
		
		driver.quit();
		
	}

}
