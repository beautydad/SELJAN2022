package Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger ;

public class logdemo {

	 Logger logger;
	@Test
	public void testLogs(){
	logger = Logger.getLogger("devpinoyLogger");
	logger.debug("Starting of Selenium tests");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	logger.debug("Mozilla browser opens");
	driver.get("http:\\google.com");
	logger.debug("Navigate to google");

	}

}
