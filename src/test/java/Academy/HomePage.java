package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import pageObjectModel.LoginPage;
import resources.Base;

public class HomePage extends Base{

	public WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,10);
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		//landing page
		LandingPage lp = new LandingPage(driver);
		lp.getLogin();
		
		//login page
		LoginPage login=new LoginPage(driver);
		login.getEmail().sendKeys(username);
		login.getPwd().sendKeys(password);
		System.out.println(text);
		login.getSubmit().click();		
		
	}
	
	@DataProvider
	public Object getData() {
		
		Object[][] data =new Object[2][3];
		
		data[0][0]="nonstricteduser@qw.com";
		data[0][1]="12345";
		data[0][2]="restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="3456";
		data[1][2]="non restricted user";
		
		return data;
	}
}
