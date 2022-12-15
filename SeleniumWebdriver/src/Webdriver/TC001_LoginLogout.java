package Webdriver;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_LoginLogout{
//providing test data and data variable
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";	
	static String title="OrangeHRM - New Level of HR Management";
	static String title1="OrangeHRM";
// FIREFOX WEBDRIVER 

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.geckodriver.driver", "C:\\drivers firefox\\mozila firefox\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		System.out.println("Application Opened");
		Thread.sleep(3000);
		driver.getCurrentUrl();
//verify page title
		if(driver.getTitle().equals(title)) {
			System.out.println("title matched");
		}
		else {System.out.println("title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Thread.sleep(3000);
		//verify page title
		if(driver.getTitle().equals(title1)) {
			System.out.println("title matched");
		}
		else { System.out.println("title not matched");
		System.out.println(driver.getTitle());
		}
//mouse over
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("mouse over complted");
		Thread.sleep(4000);
//click on add menu
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("click on sub menu");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
		
		}		

}
