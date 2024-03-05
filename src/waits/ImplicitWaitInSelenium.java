package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		WebElement submtButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submtButton.click();

		
		
	}
	
}
