package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./driver1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // Creating object for access chromedriver
		driver.manage().window().maximize();       //To open window & window maximized
		driver.get("https://www.tnstc.in/TNSTCOnline/preUserRegistration.do");     // To Enter the URL
		
        driver.findElement(By.name("txtUserLoginID")).sendKeys("anandyuvan999");    //Locate textbox & Enter Username
	    driver.findElement(By.name("txtPassword")).sendKeys("Admin123"); 
	    
	    WebElement element = driver.findElement(By.xpath("//a[text()='Reset']"));
	    element.click();
	    	    
	}

}


