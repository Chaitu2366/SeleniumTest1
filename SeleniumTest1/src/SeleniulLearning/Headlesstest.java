package SeleniulLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	
	//options.addArguments("--headless");
		
	WebDriver driver=new ChromeDriver(options); 
	
	driver.get("https://www.udemy.com/"); 
	
	System.out.println("Title of the page"  +driver.getTitle());
	//driver.close();
	}
	
	

}
