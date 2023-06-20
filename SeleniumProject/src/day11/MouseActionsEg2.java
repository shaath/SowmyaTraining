package day11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(360));
		
		WebElement helo = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(helo).perform();
		Thread.sleep(5000);
		
		WebElement ord = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		act.click(ord).perform();

	}

}
