package Webdriver;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WINDO_HANDLERS {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chromedriver.driver", "C:\\driver chrome\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//to maximize windows
	driver.manage().window().maximize();
	//to launch browser
	driver.get("file:///C:/WINDOW_HANDLERS/multiplewindows.html");
	Thread.sleep(3000);
	//click on window2
	
	driver.findElement(By.id("btn2")).click();
	//click om window3
	
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	
	//navigate to 1st window to 3rd window
	
	ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(wind.get(0));
	Thread.sleep(3000);
	// close window and current window
	//driver.close();
	driver.quit();
}

}
