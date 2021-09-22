package javaProgram;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Synchronization {
	
	
	 @Test
     public void LoginAllCases() throws InterruptedException 
   {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   
   driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
          
   //Implicit Wait
  //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   //driver.findElement(By.xpath("//*[@id='start']/button")).click();
  
  //---------------------------------------------------------------
  
  //Explicit Wait - WebDriverWait
   
   
   //System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
   /* 
   driver.findElement(By.xpath("//*[@id='start']/button")).click();
   
   
   WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));    
   
   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
   
   String str=driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
   
   System.out.println(str);        
   */
   
   //---------------------------------------------------------------
   
   
   //Explicit Wait - FluentWait

   driver.findElement(By.xpath("//*[@id='start']/button")).click();



   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(6))
           .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);



   WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {



       public WebElement apply(WebDriver driver) {
           if (driver.findElement(By.xpath("//*[@id='finish']/h4")).isDisplayed()) {
               return driver.findElement(By.xpath("//*[@id='finish']/h4"));
           } else {
               return null;
           }



       }
   });



   System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
   
       
}}

   







	
	
	

