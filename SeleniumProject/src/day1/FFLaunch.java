package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFLaunch {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "D:\\Sowmya_Recordings\\Jars\\geckodriver.exe");
//		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver", "D:\\Sowmya_Recordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		

	}

}
