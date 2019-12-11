package week1day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TnstcWindow {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tnstc.in/TNSTCOnline/preUserRegistration.do#");
		
		WebElement help = driver.findElementByXPath("//span[text()='Help']");
		help.click();
		
		Set<String> allwindow = driver.getWindowHandles();// getting all windows
		
		List<String> eachwindow = new ArrayList<String>();// 
		eachwindow.addAll(allwindow);//adding allwindows in LIST
		//System.out.println(eachwindow);// printing all windows
		
		//String firstwind = driver.getTitle(); //get the title & stored in String variable
		//System.out.println(firstwind); //printing the title of first window
		
		driver.switchTo().window(eachwindow.get(1)); //switching second window using index
		//String secondwind = driver.getTitle(); // get the title & stored in string variable
		//System.out.println(secondwind);// print the title of secondwind
	
		driver.close();// close the second driver
		driver.switchTo().window(eachwindow.get(0));// switching first window using index
	}

}
