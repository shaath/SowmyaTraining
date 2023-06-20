package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_POM {

	@Test
	public void login() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		lp.login();
		
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		Thread.sleep(5000);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}
}
