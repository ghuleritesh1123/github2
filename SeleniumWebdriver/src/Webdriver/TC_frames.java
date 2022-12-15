package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_frames {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chromedriver.driver","C:\\driver chrome\\chrome\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		System.out.println("enter into frame");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("ritesh");
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("ghule");
		Thread.sleep(2000);
		driver.findElement(By.id("btnEdit")).click();
	    System.out.println("exit from frame");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		Thread.sleep(3000);
		driver.close();
		
	}

}
