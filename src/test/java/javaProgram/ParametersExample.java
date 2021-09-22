package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class ParametersExample {
	
	

    WebDriver driver;

 

    @BeforeTest
    @Parameters({"browser"})
    public void LaunchBrowser(String browser) throws Exception {

 

        if(browser.equalsIgnoreCase("Chrome")){
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");

        }      
        
        if(browser.equalsIgnoreCase("firefox")){
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
          
            driver = new FirefoxDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }
       
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
                
       // driver.get(app);
    }     
        
    

 

        
    @Test
    public void OrangeHRM_Login() {
          //  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
            driver.findElement(By.name("txtUsername")).clear();
            driver.findElement(By.name("txtUsername")).sendKeys("Admin");
            driver.findElement(By.name("txtPassword")).clear();
            driver.findElement(By.name("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            String Element = driver.findElement(By.linkText("Dashboard")).getText();
            System.out.println(Element);

 

    }
    
    
    
    
    
    


//@Test
//
//    public void testAncestorInXpath(){
//
//        WebDriver driver = new FirefoxDriver();             
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://demo.guru99.com/test/guru99home/");
//
//        //Search All elements in 'Popular course' section 
//		//with the help of ancestor of the anchor whose text is 'SELENIUM'
//
//        List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
//
//        //Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'
//
//        for (WebElement webElement : dateBox) {
//            System.out.println(webElement.getText());
//        }
//     
//        driver.quit();
//    }
    
    
    
	@Parameters({ "UserName", "Passcode" })
	@Test
    public void OrangeHRM_Login1() {
          //  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
           
            driver.findElement(By.name("txtUsername")).sendKeys("Admin");
            driver.findElement(By.name("txtPassword")).clear();
            driver.findElement(By.name("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
            String Element = driver.findElement(By.linkText("Dashboard")).getText();
            System.out.println(Element);

 

    }
    
    
    @AfterTest
    public void CloseBrowser() {
        driver.quit();
    }
	
	
	
	
	
	
}
