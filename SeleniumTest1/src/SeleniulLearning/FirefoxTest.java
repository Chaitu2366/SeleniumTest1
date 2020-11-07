package SeleniulLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.firefox.marionette","C://Program Files//eclipse//geckodriver//geckodriver.exe");
	
	
// FirefoxDriver driver=new FirefoxDriver();
// WebDriver driver=new FirefoxDriver();
WebDriver driver=new ChromeDriver();
 	
 //driver.get("https://www.facebook.com/");

	
driver.get("https://www.udemy.com/"); 

driver.manage().window().maximize();	

String exp_title="Online Courses - Learn Anything, On Your Schedule | Udemy";

 String act_title=driver.getTitle();// returns the title of the page

 System.out.println("act_title");
 
 if(exp_title.equals(act_title)==true)
	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test is failed");
	}

driver.close(); //close the browser	
}

}







