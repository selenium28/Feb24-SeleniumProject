package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNGTest {
	WebDriver driver; 

	@Test
	public void testCaseOne() {
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("1234321");
		
		WebElement submtButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submtButton.click();
	}

	@Test
	public void testCaseTwo() {
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		String msg = alert.getText();
//		System.out.println(msg);
		System.out.println(alert.getText());
		alert.accept();
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
