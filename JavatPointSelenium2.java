package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavatPointSelenium2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.className("homecontent")).click();
		driver.findElement(By.className("spanh2")).click();
		
		
	
	}

}
