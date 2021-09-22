package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dataprovider_loginscenarios {
	
	
	ChromeDriver chDriver;

	 

    @Test(dataProvider="LoginScenario")
      public void LoginAllCases(String uName, String uPassword, String expectedMessage) throws InterruptedException 
    {
     
        
     chDriver.findElement(By.name("txtUsername")).clear();
     chDriver.findElement(By.name("txtUsername")).sendKeys(uName);
     chDriver.findElement(By.name("txtPassword")).clear();
     chDriver.findElement(By.name("txtPassword")).sendKeys(uPassword);
     chDriver.findElement(By.name("Submit")).click();
     
     try 
     {
      
      Boolean boolDisplayed = chDriver.findElement(By.linkText("Dashboard")).isDisplayed();
      
      if (boolDisplayed) 
      {
       System.out.println("Successfull Login");
       String strCurrDashboardLabel = chDriver.findElement(By.linkText("Dashboard")).getText();   
       Assert.assertEquals(expectedMessage, strCurrDashboardLabel);
     //Logout from the application
       chDriver.findElement(By.partialLinkText("Welcome")).click();
       Thread.sleep(3000);
       chDriver.findElement(By.linkText("Logout")).isDisplayed();
       chDriver.findElement(By.linkText("Logout")).click();
       chDriver.findElement(By.name("Submit")).isDisplayed();  
      }
      else {
       System.out.println("Unsuccessfull Login");
       String strInvalidLoginMessage = chDriver.findElement(By.id("spanMessage")).getText();
       Assert.assertEquals(expectedMessage, strInvalidLoginMessage);
      }

 

     }
     catch(Exception e)
     {
       e.printStackTrace();
     } 

 

      }
        
      @BeforeTest
      public void LaunchBrowser() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
      chDriver.manage().window().maximize();
      chDriver.get("https://opensource-demo.orangehrmlive.com/");
       
      }

 

      @AfterTest
      public void CloseBrowser() {
       chDriver.quit();
      }

}
