package day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com/");
		
		String gmail_wid = driver.getWindowHandle();
//		System.out.println(gmail_wid);
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(10000);
		Set<String> s = driver.getWindowHandles();
		
		for (String wid : s) {
//			System.out.println(wid);
			driver.switchTo().window(wid);
			Thread.sleep(5000);
			String title = driver.getTitle();
			System.out.println(wid+"------"+title);
			
			if (title.contains("Privacy")) {
				driver.findElement(By.linkText("Terms of Service")).click();
				break;
			}
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://redbus.in");
	
	}

}
