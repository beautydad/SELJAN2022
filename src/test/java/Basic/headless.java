package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headless {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://facebook.com");
System.out.println("The driver title is :"+driver.getTitle());


	}

}
