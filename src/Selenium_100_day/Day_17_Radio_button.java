package Selenium_100_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_17_Radio_button {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\selenium\\\\resource\\\\geckodriver.exe");

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/checkbox");
		
		WebElement radio = driver.findElement(By.id("item-2"));
		radio.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement yesRadio = driver.findElement(By.cssSelector(".custom-control-label"));
		yesRadio.click();
		
		String textOfRadioButton = yesRadio.getText();
		System.out.println("A mesaage of radio button after selecting : "+textOfRadioButton);

	}

}
