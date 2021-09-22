package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	//VA0129073479
	
	
		
		@Test(dataProvider="Login")
	    
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
            String Element = driver.findElement(By.linkText("Dashboard")).getText();
            System.out.println(Element);
    }
    

 

    @DataProvider(name="Login")
    public Object[] getData()
    {
        Object[] data = {"Admin","abcd"};
        return data;
    }
 
		
		
		
		
	}
	
	
	

