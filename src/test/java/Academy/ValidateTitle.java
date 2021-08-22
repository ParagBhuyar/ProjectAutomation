package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import pageObjectModel.LoginPage;
import resources.Base;

public class ValidateTitle extends Base{

	public WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,10);
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		//landing page
		LandingPage lp = new LandingPage(driver);
		
		
		Assert.assertEquals(lp.getTitle().getText(), "Featured Courses1");
	}
	
}
