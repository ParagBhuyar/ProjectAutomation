package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	//login page updatye 
	public WebDriver driver;
	
	By email=By.id("user_email");
	By pwd=By.id("user_password");
	By submit=By.cssSelector("input[type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getEmail() {
		
		return driver.findElement(email);
		
	}
	public WebElement getPwd() {
		
		return driver.findElement(pwd);
	}
	
	public WebElement getSubmit() {
		
		return driver.findElement(submit);
	}
}
