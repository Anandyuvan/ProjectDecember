 package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TnstcSelenium1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver" , "./driver1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // Creating object for access chromedriver
		
		driver.manage().window().maximize();       //To open window & window maximized
		driver.get("https://www.tnstc.in/TNSTCOnline/preUserRegistration.do");     // To Enter the URL
		
	    driver.findElement(By.name("txtUserLoginID")).sendKeys("anandyuvan999");    //Locate textbox & Enter Username
	    
	    driver.findElement(By.name("txtPassword")).sendKeys("Admin123");    // Locate textbox & Enter Password
	    driver.findElement(By.name("txtConfirmPassword")).sendKeys("Admin123");    // Locate Textbox & Re-Enetr Password
	    
	    WebElement question = driver.findElement(By.name("txtSecretQuestion"));   //Locate SecretQuestion DROPDOWN box 
	    Select dd = new Select(question);      //Creating object to access values of Dropdown
	    dd.selectByValue("smiddlename");       //Selecting the one of the dropdown value or option
	    
	    driver.findElement(By.name("txtSecretAnswer")).sendKeys("CFGDVHFHFF");      // Locate textbox & Enter Secret Answer
	    driver.findElement(By.name("txtUserFullName")).sendKeys("Anand Yuvan");   // Locate textbox & Enter Full Name
	    driver.findElement(By.className("textboxCopy")).clear();  // Locate DOB textbox & Clear it
	    driver.findElement(By.className("textboxCopy")).sendKeys("12/11/1994"); // Locate DOB box & Enter DOB
	    driver.findElement(By.name("txtEmailId")).sendKeys("anandyuvan994@gmail.com");
	    
	    WebElement gender = driver.findElement(By.name("selectGender")); // Locate Gender DROPDOWN box
	    Select aa = new Select(gender); // 
	    aa.selectByValue("M");
	    
	    driver.findElement(By.name("chkRules")).click();       // Locate & Click CHECKBOX 
	    //driver.findElement(By.className("dboxheader")).click();     //Locate button & Click REGISTER		
	    WebElement element = driver.findElement(By.xpath("//a[text()='Reset']"));
	    element.click();
	    //driver.findElement(By.name("chkRules")).click();
	    driver.close();
	}
}

