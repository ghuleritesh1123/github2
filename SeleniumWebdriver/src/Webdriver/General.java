package Webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
;

public class General {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver","C:\\driver chrome\\chrome\\chromedriver_win32.cronedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.getPageSource();
		System.out.println(driver.getPageSource());
		//driver.getTitle();		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("txtUserName")).sendKeys(Keys.F5);
		System.out.println("refresh textbox");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).clear();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

}
