package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitInSelenium {

	@Test
	public void testCaseOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
//		1. Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("1234321");
		
		
//		2. Explicit wait
		WebElement submtButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(submtButton));
		submtButton.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.textToBePresentInElement(cusID, "123"));
		cusID.sendKeys("1234321");
		
		
		
//		3. Fluent wait
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		
	}
	
}
