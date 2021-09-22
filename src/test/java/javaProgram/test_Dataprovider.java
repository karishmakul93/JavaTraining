package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_Dataprovider {
	
	WebDriver driver;
	

 

    
    @Test(dataProvider="Login", dataProviderClass=DataProvider_Data.class)
    
        public void OrangeHRM_Login(String uname) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            System.out.println(uname);
            driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
            driver.findElement(By.name("txtUsername")).clear();
            driver.findElement(By.name("txtUsername")).sendKeys(uname);
            driver.findElement(By.name("txtPassword")).clear();
            driver.findElement(By.name("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            System.out.println(driver.findElement(By.linkText("Dashboard")).isDisplayed());
            driver.close();
    }        
 
	
	
	
	

}
