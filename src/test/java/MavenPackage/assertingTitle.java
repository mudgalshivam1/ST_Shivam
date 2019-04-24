package MavenPackage;
		

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class assertingTitle {
	
	//declaring the instances of variables 
	private WebDriver driver;
	 
	 String chromeDriverpath = "C:\\\\Users\\\\shivam.mudgal\\\\Downloads\\\\chromedriver.exe";
  
	 String baseUrl="http://www.newtours.demoaut.com/";
	 
	 
	 //////////Test Class with No Priority //////////////
	 @Test
  public void testMethod() {	
		
		 //calling the URL
		driver.get(baseUrl);
		
		//Getting the title 
		String title = driver.getTitle();				
		
		//asserting the title of the webpage
		AssertJUnit.assertTrue(title.contains("Welcome: Mercury Tours"));
  }
  
	 
	 /////////Before Test Class /////////
	 @BeforeTest
  public void beforeTest() {
		 
	  //defining the property of Chrome Browser
	  System.setProperty("webdriver.chrome.driver", chromeDriverpath);
	  
	  //passing the constructor for ChromeDriver()
	  driver = new ChromeDriver(); 
  }
     
  
  	////////After Test Class //////////
	 @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  //closing and exiting the driver/ChromeDriver
	  Thread.sleep(5000);
		 
		 driver.quit();
  }
}
