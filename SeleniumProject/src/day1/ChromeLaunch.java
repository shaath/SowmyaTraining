package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Sowmya_Recordings\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
	}

}
