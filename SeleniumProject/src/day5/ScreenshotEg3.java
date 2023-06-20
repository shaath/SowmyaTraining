package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		
		Thread.sleep(20000);
		
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D://Sowmya_Recordings//Workspace//SeleniumProject//src//screenshots//bing1.png"));

		File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://Sowmya_Recordings//Workspace//SeleniumProject//src//screenshots//bing2.png"));
	}

}
