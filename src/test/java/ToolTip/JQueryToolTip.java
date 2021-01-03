package ToolTip;

import java.security.PublicKey;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



	
	public class JQueryToolTip{
	
		@Test(priority=1)
		public void login()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
	       /* Actions act = new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath("//a[.='Hover over me']"))).perform();
	      // to find this hoover element - have to press fn+f8
	       String text = driver.findElement(By.xpath("div[@class='tooltip-inner']")).getText();
	       System.out.println(text);
	       
	       driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
	       Actions act1 = new Actions(driver);
	       act1.moveToElement(driver.findElement(By.xpath("//button[.='Hover over me']"))).perform();
		*/
		System.out.println("Browser open");
		
		}
	}



