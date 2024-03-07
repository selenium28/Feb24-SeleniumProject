package asert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClass {
	
	@Test
	public void assertt() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement loginButton = driver.findElement(By.id("submit"));
		loginButton.click();
		
		WebElement loginSuccessful = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		loginSuccessful.isDisplayed();
		
		Assert.assertEquals("Logged in Successfully", loginSuccessful.getText(), "Logged not successful");
	
	}

}
