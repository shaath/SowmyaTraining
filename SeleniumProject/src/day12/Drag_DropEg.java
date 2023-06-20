package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_DropEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");

		WebElement cFrame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(cFrame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
//		act.clickAndHold(drag).moveToElement(drop).click().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
		
		driver.switchTo().frame(0);
		
		drag = driver.findElement(By.id("draggable"));
		act.dragAndDropBy(drag, 401, -3).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement vs = driver.findElement(By.xpath("//a[text()='Datepicker']"));
//		act.scrollToElement(vs).perform();
//		Thread.sleep(5000);
//		act.scrollToElement(vs).perform();
//		Thread.sleep(5000);
//		act.moveToElement(vs).perform();
//		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", vs);
	}

}
