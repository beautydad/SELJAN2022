package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://jqueryui.com//selectable//");
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	
     WebElement a= driver.findElement(By.xpath("//*[@id=\'selectable']/li[1]"));
     WebElement b= driver.findElement(By.xpath("//*[@id=\'selectable']/li[2]"));
     WebElement c= driver.findElement(By.xpath("//*[@id=\'selectable']/li[3]"));
     WebElement d= driver.findElement(By.xpath("//*[@id=\'selectable']/li[4]"));
     
     Actions builder =new Actions(driver);
     
     builder.clickAndHold(a).clickAndHold(d).release().build().perform();
          
	}
}
