package Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_WAIT_STATEMENT {

	public static void main(String[] args) throws Exception {
		 //Test Steps
		System.setProperty("webdriver.geckodriver.driver", "C:\\drivers firefox\\mozila firefox\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		//Wait until Login btn - avalible : Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		//wait until empinfo: page to be available
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();

	}

}
