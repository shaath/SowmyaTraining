package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg1 {

	@Parameters({"br", "pt"})
	@Test
	public void grid(String br, String pt) throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = new DesiredCapabilities();
		if (br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("windows")) {
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("windows")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("edge") && pt.equalsIgnoreCase("windows")) {
			cap.setBrowserName("MicrosoftEdge");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.8:4444/wd/hub"), cap);
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}
}
