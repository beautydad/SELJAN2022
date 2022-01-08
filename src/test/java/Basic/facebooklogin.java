package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.gecko.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("hi");
		
		
		//driver.findElement(By.id("email")).sendKeys("franky22j@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("aaaaaaa");
		//driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
//driver.findElement(By.xpath("//*[@id=\'u_0_m\']")).sendKeys("franklin");

	}

}
