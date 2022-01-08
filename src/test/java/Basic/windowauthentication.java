package Basic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowauthentication {
	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver", "E:\\Sathish Files\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();       
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// admin is username and admin is password
	//sysntax: https://username:password@url

}
}
