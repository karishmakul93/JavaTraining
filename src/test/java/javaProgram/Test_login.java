package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_login {
	
	
	@Test
	public void run()
	{ System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    // browser type and chromedrover.exe path as parameters
  
    String url = "https://opensource-demo.orangehrmlive.com/";
    driver.get(url);
    
    String str=driver.findElement(By.name("txtUsername")).getAttribute("name");
    String str2=driver.findElement(By.name("txtPassword")).getAttribute("name");
    
//    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//    driver.findElement(By.name("Submit")).click();
//    
    
    System.out.println(str);
    System.out.println(str2);
    


String str4=driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
       
        driver.findElement(By.id(str)).click();
//Click
        /*
         driver.findElement(By.xpath("//button[text()='Click Me']")).click();
   
        String str=driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
       
        driver.findElement(By.id(str)).click();
        */
       
       
       
        //Double Click
        /*
        WebElement element=driver.findElement(By.id("doubleClickBtn"));
       
        Actions act = new Actions(driver);
        act.moveToElement(element).doubleClick().build().perform();
        //act.doubleClick(element).build().perform();
        */
       
        //Right Click
       
        WebElement element=driver.findElement(By.id("rightClickBtn"));
       
        Actions act = new Actions(driver);
        //act.moveToElement(element).contextClick().build().perform();
        act.contextClick(element).build().perform();


    
    

	}
	
	
	
}
