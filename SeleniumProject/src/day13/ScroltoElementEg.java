package day13;

import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScroltoElementEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://amazon.com");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(360));
		Thread.sleep(20000);
//		WebElement navb = driver.findElement(By.id("navBackToTop"));
//		org.openqa.selenium.Rectangle rect = navb.getRect();
//	    int deltaY = rect.y + rect.height;
		Actions act = new Actions(driver);
//		act.scrollByAmount(0, deltaY).perform();
//		Thread.sleep(20000);
//		rect = navb.getRect();
//	    deltaY = rect.y + rect.height;
//	    act.scrollByAmount(0, deltaY).perform();
//		Thread.sleep(5000);
		act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Shop deals in Fashion']"))).perform();
//		
//		Thread.sleep(5000);

	}

}
