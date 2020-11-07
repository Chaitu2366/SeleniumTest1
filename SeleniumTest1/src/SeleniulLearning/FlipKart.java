package SeleniulLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");


driver.findElement(By.xpath( "//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("gchaitanya236");
driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("nani2366");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
Thread.sleep(4000);

driver.close();



	
	
	
	
	
	
	
	}

}
