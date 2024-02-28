package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TestNGClass {
	WebDriver driver;   // Globally declared
	
//	TestNG has its own execution engine.
	
	@Test
	public void validTestcase() {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement loginButton = driver.findElement(By.id("submit"));
		loginButton.click();
			
	}
	
	@Test
	public void InvalidUser() {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("fdrtee");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement loginButton = driver.findElement(By.id("submit"));
		loginButton.click();
			
	}
	
	@Test
	public void InvalidPass() {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1234556");
		
		WebElement loginButton = driver.findElement(By.id("submit"));
		loginButton.click();
			
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
