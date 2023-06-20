package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import functionalDriven.GenericMethods;

public class TestNGMaster extends GenericMethods {
	public String expval, actval;
	public FileInputStream fi;
	public String fPath = System.getProperty("user.dir")+"\\src\\com\\SeleniumProject\\properties\\orgHRM.properties";
	public Properties pr;
	public String br = "Firefox", url = "http://orangehrm.qedgetech.com";
	public String u ="Admin", p = "Qedge123!@#";
	public String f = "Soumya", l = "Sayini", eId = "SS4867";
	public String ename = f+" "+l, uname = "AAA"+f+l+"1445", pwd = "Test@5432167890";
	
	@BeforeTest
	public void orgLaunch() throws IOException{
		fi = new FileInputStream(fPath);
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		BrLaunch(br);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(360));
		actval = driver.findElement(By.xpath(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval, "Application Launch Failed");
	}
	
	@BeforeClass
	public void orgLogin(){
		expval = "welcome";
		driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Application Login Failed");
	}
	
	@AfterClass
	public void orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Application Logout Failed");
	}
	
	@AfterTest
	public void orgClose(){
		driver.close();
	}

}
