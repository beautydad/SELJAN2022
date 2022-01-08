package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://hdfcbank.com");
		Actions action = new Actions(driver);
		WebElement a= driver.findElement(By.xpath("//*[@id=\'main\']/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[2]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\'main\']/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
       action.moveToElement(a);
       action.moveToElement(b).click().build().perform();
       	}
	}


