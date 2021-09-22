package javaProgram;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_demoqa2 {
	
	public void run() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();


			 driver.get("https://www.demoqa.com/alerts");
			        //driver.get("https://www.demoqa.com/nestedframes");
			        //driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_textarea_form");
			        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			        driver.manage().window().maximize();
			        //accept, dismiss, getText, sendKeys
			        
			        //Alert - Interface
			        //RemoteAlert - class which implements alert
			        
			        
			        
			        
			        driver.findElement(By.id("alertButton")).click();
			        Thread.sleep(2000);
			        
			        driver.switchTo().alert().accept();
			                
			        driver.findElement(By.id("timerAlertButton")).click();
			        Thread.sleep(6000);
			        String str=driver.switchTo().alert().getText();
			        System.out.println(str);
			        
			        driver.switchTo().alert().accept();
			        
			        driver.findElement(By.id("confirmButton")).click();
			        Thread.sleep(2000);
			        
			        driver.switchTo().alert().dismiss();
			                
			        driver.findElement(By.id("promtButton")).click();
			        Thread.sleep(2000);
			        
			        driver.switchTo().alert().sendKeys("Selenium");
			        
			        driver.switchTo().alert().accept();
			                        
			      
			        WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
			        driver.switchTo().frame(ele);
			        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("selenium");
			        
			        
			        System.out.println(driver.getPageSource());
			        
			        driver.switchTo().frame("frame1");
			        
			        System.out.println(driver.getPageSource());
			        
			        driver.switchTo().frame(0);
			        
			        System.out.println(driver.findElement(By.tagName("P")).getText());
			        
			        System.out.println(driver.getPageSource());
			        
			        driver.switchTo().parentFrame();
			        
			        System.out.println(driver.getPageSource());
			        
			        //driver.switchTo().defaultContent();
			        
			        //driver.navigate().to("https://www.demoqa.com/alerts");
			        
			        String parentWndHndl=driver.getWindowHandle();
			        System.out.println(parentWndHndl);
			            
			        driver.findElement(By.id("opentab")).click();
			        Thread.sleep(5000);
			        
			        Set<String> winHndls = driver.getWindowHandles();
			        System.out.println(winHndls.size());
			        
			        for(String win:winHndls)
			        {
			            if(!parentWndHndl.equalsIgnoreCase(win))
			            {
			                driver.switchTo().window(win);
			                System.out.println(win);
			                driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")).click();
			                driver.close();                
			            }
			        }
			        
			    
			        //driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL+"t"));
			        ((JavascriptExecutor)driver).executeScript("window.open()");
			        
			        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//			        driver.switchTo().window(tabs.get(1)); //switches to new tab
//			        driver.get("https://www.facebook.com");
//
//			 
//
//			        driver.switchTo().window(tabs.get(0)); // switch back to main screen        
//			        driver.get("https://www.google.com");
//			        
//			        
//			        //driver.switchTo().window(parentWndHndl);
//	
	
	
	
	
	}
}
