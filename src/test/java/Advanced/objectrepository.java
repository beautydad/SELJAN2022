package Advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class objectrepository {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver();					
    driver.get("https://www.facebook.com/");					
    driver.manage().window().maximize();			
// Load the properties File		
    Properties obj = new Properties();					
    FileInputStream objfile = new FileInputStream("C:\\Users\\joshi\\eclipse-workspace\\training\\src\\selenium\\configuration");									
    obj.load(objfile);					
			
// Enter Data into Form	
    driver.findElement(By.id(obj.getProperty("username"))).sendKeys("testguru99@gmail.com");									
    driver.findElement(By.id(obj.getProperty("password"))).sendKeys("1234");									
    driver.findElement(By.xpath(obj.getProperty("submit"))).click();							
  }		
	
}

	
	
	
