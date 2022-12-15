package Webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_keyboard {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chromedriver.driver","C:\\driver chrome\\chrome\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("TAB");
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("ENTER");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
	}

}
