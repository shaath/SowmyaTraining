package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg1 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int links_count = links.size();
		System.out.println(links_count);
		
		for (int i = 0; i < links_count; i++) {
			String lText = links.get(i).getText();
			System.out.println(lText);
			
			if (lText.equalsIgnoreCase("About")) {
				links.get(i).click();
				break;
			}
		}

	}

}
