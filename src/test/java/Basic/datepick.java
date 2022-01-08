package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/?gclid=Cj0KCQjw3qzzBRDnARIsAECmryqJzahCRajA3USOPneNdXvyB38xANvOj98R0pDjJgqda8pOYmUnMvYaArHSEALw_wcB");
		
		
		WebElement date= driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
		date.click();
        
        WebElement date1= driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]/div/p[1]"));
        date1.click();
	}

}
