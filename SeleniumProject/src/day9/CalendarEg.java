package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarEg {

	public static void main(String[] args) throws InterruptedException {
		
		String d = "18/April/2024";
		String m_y = (d.split("/"))[1]+" "+(d.split("/"))[2];
		String day = (d.split("/"))[0];
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(360));
		
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//div[@class='d-flex']//*[local-name()='path' and @stroke-linecap='round']"))))
		.click();
		Thread.sleep(5000);
		WebElement cal = driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='mask']/.."));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		cal.click();
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0, 350)", "");
		Thread.sleep(5000);
		
		String actual_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		
		while(!m_y.equalsIgnoreCase(actual_m_y)){
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			actual_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			Thread.sleep(2000);
		}
		
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[contains(@class, 'DayPicker-Day')]"));
		for (int i = 0; i < days.size(); i++) {
			String dt = days.get(i).getAttribute("aria-label");
			System.out.println(dt);
			if ((dt.split(" "))[2].equals(day)) {
				days.get(i).click();
				break;
			}
		}
	}

}
