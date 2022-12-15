package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_FILEUPLOAD {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.geckodriver.driver", "C:\\drivers firefox\\mozila firefox\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("rightMenu");
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("last name");
        driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("first name");
        //To upload a file
        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']")); 
        fileInput.sendKeys("C:\\image\\a.png");
        Thread.sleep(6000);
        System.out.println("File uploaded successfully");        
        driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
        Thread.sleep(6000);
          System.out.println("New Employee Added");
          driver.switchTo().defaultContent();
          driver.findElement(By.linkText("Logout")).click();
          driver.close();
	}

}
