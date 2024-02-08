package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		Locators
//		1. ID
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
//		2. Name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
//		1. ID 
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
//		3. LinkText
		WebElement homePageLink = driver.findElement(By.linkText("Home"));
		homePageLink.click();
		
//		4. Partial-LinkText
		WebElement contactLink = driver.findElement(By.partialLinkText("Cont"));
		contactLink.click();
		
//		5. ClassName
//		6. TagName
		WebElement link = driver.findElement(By.tagName("a"));
		link.getText();
		
//		7.xPath
		WebElement contactName = driver.findElement(By.xpath("//input[@name='wpforms[fields][0][first]']"));
		contactName.sendKeys("");
//		contactEmail   -    //input[@type='email']
//		submitButton   - //button[@data-submit-text='Submit']
		
//		8.Css Selector
		WebElement ContactSubmitButton = driver.findElement(By.cssSelector("button[data-submit-text='Submit']"));
	}

}
