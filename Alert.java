package week1day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./driver1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		WebElement button = driver.findElementByXPath("//button[text()='Try it']");
		button.click();
		
		String text = driver.switchTo().alert().getText();
	    System.out.println(text);
		
		driver.switchTo().alert().sendKeys("Anand");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       
	}

}
