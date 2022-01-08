package Basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		Set<String>winhandles=driver.getWindowHandles();//all the windows
		
		System.out.println("the number of window are:"+winhandles.size());
		
		
		for(String winhandle:winhandles) {
			driver.switchTo().window(winhandle);
		}
		String title=driver.getTitle();
		System.out.println("the page title is"+ title);
		driver.quit();
		
		}
		
		
		
		
	}


