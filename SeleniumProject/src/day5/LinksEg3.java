package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		WebElement sec = driver.findElement(By.id("Table_011"));
		List<WebElement> links = sec.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			String lText = links.get(i).getText();
			System.out.println(lText);
			
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D://Sowmya_Recordings//Workspace//SeleniumProject//src//screenshots//"+lText+".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			sec = driver.findElement(By.id("Table_011"));
			links = sec.findElements(By.tagName("a"));
		}

	}

}
