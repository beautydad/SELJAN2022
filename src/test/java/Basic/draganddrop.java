package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com//droppable//");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		WebElement drop =driver.findElement(By.id("droppable"));
		
		WebElement drag=driver.findElement(By.id("draggable")); 
		
		Actions a =new Actions(driver);
		
		a.dragAndDrop(drag, drop).build().perform();
	}

		
		
		

	}


