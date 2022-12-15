package Webdriver;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_dropdown {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chromedriver.driver","C:\\driver chrome\\chrome\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
Thread.sleep(4000);
		//Verify Title - stop exe - cond: failed
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Title matched");
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		System.out.println("Drag&Drop");
	Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.close();
		}}
		




