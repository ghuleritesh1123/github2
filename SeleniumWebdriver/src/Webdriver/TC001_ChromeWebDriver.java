package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_ChromeWebDriver {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";	
	static String title="OrangeHRM - New Level of HR Management";
	static String title1="OrangeHRM";

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver chrome\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to(url);
		Thread.sleep(3000);
		System.out.println("Application Opened");
		Thread.sleep(3000);
		if(driver1.getTitle().equals(title)) {
			System.out.println("title matched");
		}
		else {System.out.println("title not matched");
		System.out.println(driver1.getTitle());
		}
		driver1.findElement(By.name("txtUserName")).sendKeys(username);
		Thread.sleep(3000);
		driver1.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver1.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Thread.sleep(3000);
		if(driver1.getTitle().equals(title1)) {
			System.out.println("title matched");
		}
		else {System.out.println("title not matched");
		System.out.println(driver1.getTitle());
		}
	//mouse over
		Actions ac1=new Actions(driver1);
		ac1.moveToElement(driver1.findElement(By.linkText("PIM"))).perform();
		System.out.println("mouse over complted");
		Thread.sleep(4000);
		//click on add menu
		driver1.findElement(By.linkText("Add Employee")).click();
		System.out.println("click on sub menu");
		Thread.sleep(4000);
		driver1.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver1.close();

	}

}
