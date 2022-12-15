package Webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_ALERT {
	public static void main(String[] args) throws Exception {
		//launch browser
		System.setProperty("webdriver.chromedriver.driver","C:\\driver chrome\\chrome\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// enter URL 
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		Thread.sleep(3000);
		// enter user name 
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		//click on login button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//alert method
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		// enter password 
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
	}

}
