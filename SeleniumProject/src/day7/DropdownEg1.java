package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement drop = driver.findElement(By.name("country"));
		
		Select sel = new Select(drop);

		sel.selectByIndex(4);
		Thread.sleep(5000);
		sel.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		sel.selectByValue("EGYPT");
		
		List<WebElement> items = sel.getOptions();
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) {
			sel.selectByIndex(i);
			String country = items.get(i).getText();
			System.out.println(country);
		}
	}

}
