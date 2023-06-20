package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IELaunch {

	public static void main(String[] args) {
//		WebDriverManager.iedriver().setup();
		System.setProperty("webdriver.ie.driver", "D:\\Sowmya_Recordings\\Jars\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://selenium.dev");

	}

}
