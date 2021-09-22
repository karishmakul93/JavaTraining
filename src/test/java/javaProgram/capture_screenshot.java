package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class capture_screenshot {
	
	@Test
	  public void actionsOnCookies() throws InterruptedException {
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();


		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		//options.addArguments("incognito");


		driver = new ChromeDriver(options);
		driver.manage().window().maximize();


		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Dashboard displayed: " + driver.findElement(By.linkText("Dashboard")).isDisplayed());
		driver.quit();
	  }



}
