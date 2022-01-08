package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
		
	    Select day=new Select(driver.findElement(By.id("day")));
	   List<WebElement> values=day.getOptions();
	    values.get(4).click();
	    //month
	    Select month=new Select(driver.findElement(By.id("month")));
	    List<WebElement> values1=month.getOptions();
	    values1.get(8).click();
	    
	    //year
	    Select year=new Select(driver.findElement(By.id("year")));
	    List<WebElement> values2=year.getOptions();
	    values2.get(6).click();
	    //Select month=new Select(driver.findElement(By.id("month")));

	   // month.selectByVisibleText("Jun");
	    month.selectByIndex(8);

	    
	    

	    
	    
	    
	    
	    
		
		
	}

}
