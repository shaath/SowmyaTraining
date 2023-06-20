package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg2 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		
		File ele = signIn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ele, new File("D://Sowmya_Recordings//Workspace//SeleniumProject//src//screenshots//signIn.png"));
	}

}
