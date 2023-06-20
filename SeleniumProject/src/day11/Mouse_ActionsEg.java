package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_ActionsEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signIn).perform();
		Thread.sleep(5000);
		act.contextClick().perform();
		Thread.sleep(5000);
	}

}
