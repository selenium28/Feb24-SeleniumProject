package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(countryDropDown);
//		select.selectByIndex(10);
//		select.selectByValue("CANADA");
		select.selectByVisibleText("INDIA");
		driver.quit();
		
	}

}
