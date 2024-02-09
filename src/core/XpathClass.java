package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		xPath
//		1. Absolute xPath
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button"));
		submitButton.click();
		
//		2. Relative xPath
		WebElement contactName = driver.findElement(By.xpath("//input[@name='wpforms[fields][0][first]']"));
		contactName.sendKeys("");
		
	}

}
