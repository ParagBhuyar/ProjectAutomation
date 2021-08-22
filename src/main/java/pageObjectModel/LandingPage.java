package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Base;

public class LandingPage  {

	public WebDriver driver;
	WebDriverWait wait;

	By signin = By.cssSelector("a[href*='sign_in']");
	By title =By.xpath("//h2[contains(text(),'Featured Courses')]");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		 wait = new WebDriverWait(driver,10);
		 
	}

	public void getLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		 driver.findElement(signin).click();;
	}

	public WebElement getTitle() {
		
		return driver.findElement(title);
	}

}
