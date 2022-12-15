package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KB_WD {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.geckodriver.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Keys.ARROWS_DOWN");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Keys.ARROWS_DOWN");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Keys.ENTER");
		Thread.sleep(4000);
		driver.close();
	}

}
