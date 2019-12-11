package week1day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSorting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		
		Thread.sleep(10000);
		WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");	
		driver.switchTo().frame(frame);
		
		WebElement item1 = driver.findElementByXPath("//span[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//span[text()='Item 3']");
		
		int y = item3.getLocation().getY();
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(item1, 0, y);
		//builder.dragAndDrop(item3, item1).perform();
		
		
	}

}
