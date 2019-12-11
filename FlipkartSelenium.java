package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlipkartSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.className("LM6RPg")).sendKeys("mobiles");
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("vh79eN")));
		
		driver.findElement(By.className("vh79eN")).click();
		
		
	}

}
