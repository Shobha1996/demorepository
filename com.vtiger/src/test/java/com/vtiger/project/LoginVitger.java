package com.vtiger.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginVitger {
   WebDriver driver=null;
	String Browser=System.getProperty("browser");
	String Url=System.getProperty("url");
	String Un=System.getProperty("username");
	String Pwd=System.getProperty("password");
	
	@Test
	public void login() 
	{
		 if(Browser.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		 }
		 else if(Browser.equalsIgnoreCase("firefox"))
			{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
			}
		 else if(Browser.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
	else
	{
		driver=new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	
		
	}
}
