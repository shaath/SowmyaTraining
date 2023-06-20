package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RasioButtonsEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='group1' or @name='group2']"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) {
			String rname = radios.get(i).getAttribute("value");
			System.out.println(rname);
			
			if (rname.equalsIgnoreCase("milk")) {
				radios.get(i).click();
			}else if (rname.equalsIgnoreCase("water")) {
				radios.get(i).click();
			}
		}

	}

}
