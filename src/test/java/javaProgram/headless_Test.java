package javaProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class headless_Test {
	
	@Test
	  public void actionsOnCookies() throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	             
	      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileHandler.copy(src, new File("C:\\Users\\Administrator\\Desktop\\screenshot\\Appscreenshot.png"));
	         
	  }
	         
	  
		
	  



}
