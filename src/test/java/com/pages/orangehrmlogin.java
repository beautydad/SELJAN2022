package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmlogin {
	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(className="button")
	WebElement Loginbutton;
	
	public orangehrmlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}
	public void login(String uname,String pass) {
		username.sendKeys(uname);
		pwd.sendKeys(pass);
		
		Loginbutton.click();
		
	}
	
	
	
	

}
