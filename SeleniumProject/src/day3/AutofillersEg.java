package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("vem");
		Thread.sleep(5000);
		
//		String x = driver.findElement(By.xpath("//text[@class='placeHolderMainText']")).getText();
//		System.out.println(x);
		
		List<WebElement> list = driver.findElements(By.xpath("//text[@class='placeHolderMainText']"));
		System.out.println(list.size());
		for(WebElement ele: list){
			String city = ele.getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("Vemulawada")) {
				ele.click();
				break;
			}
		}
		

	}

}
