package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("1234321");
		
		WebElement submtButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submtButton.click();
		
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		String msg = alert.getText();
//		System.out.println(msg);
		System.out.println(alert.getText());
		
		
	}

}
