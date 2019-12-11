package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelenium1 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver" , "./driver1/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com");
				
				WebElement element = driver.findElement(By.className("_2AkmmA _29YdH8"));
				element.click();
//				driver.findElement(By.className("LM6RPg")).sendKeys("mobiles");
//				
//				WebDriverWait wait = new WebDriverWait(driver,15);
//				wait.until(ExpectedConditions.elementToBeClickable(By.className("vh79eN")));
//				
//				driver.findElementByClassName("vh79eN").click();
//				
				

	}

}
//C:\Selenium\sel-id2\drivers\chromedriver.exe
//./driver1/chromedriver.exe
