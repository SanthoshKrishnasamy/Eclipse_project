package Selenium_100_day;

public class Day_29_Synchronization {

	public static void main(String[] args) {

		System.out.println("Synchronization");

		/*
        Introduction to Synchronization
        In web testing, ensuring that your scripts are robust and reliable is key.  One of the challenges we often face is dealing with the asynchronous nature of web applications.

        Why is synchronization important?
        Web pages load elements at different speeds. Without proper synchronization, your Selenium scripts might interact with elements that haven't fully loaded, leading to flaky tests and false positives/negatives. 

        **Handling synchronization with Selenium:

     1. Implicit Wait: Set a global wait for a certain duration, allowing Selenium to wait for elements before throwing an exception.
        Syntax :
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
     2. Explicit Wait: Use WebDriverWait to wait for a specific condition to be true before proceeding to the next steps.
        Syntax :
        WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourElementId")));
       
     3. Fluent Wait: A more flexible wait allowing you to define polling intervals and exceptions to ignore during the wait.
        Syntax :
        Wait wait = new FluentWait(driver) .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(2)) .ignoring(NoSuchElementException.class); WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourElementId")));

     4. Key takeaways:
        Patience is a virtue: Allow Selenium to wait for elements instead of rushing through your script.
        Understand your app: Know when and how elements load to choose the right synchronization strategy.
		 */


	}

}
