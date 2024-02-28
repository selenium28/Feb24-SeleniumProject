package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();

	}

}
