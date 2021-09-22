

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_demoqa {
	
	
	@Test
	public void run()
	{ System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    // browser type and chromedrover.exe path as parameters
  
    String url = "https://demoqa.com/buttons";
    driver.get(url);

    
    
    
    WebElement element=driver.findElement(By.id("doubleClickBtn"));
    
    Actions act = new Actions(driver);
    act.moveToElement(element).doubleClick().build().perform();
    //act.doubleClick(element).build().perform();
    
    WebElement element2=driver.findElement(By.id("rightClickBtn"));
	//		VA0129043189
    Actions act2 = new Actions(driver);
    //act.moveToElement(element).contextClick().build().perform();
    act2.contextClick(element2).build().perform();

   // Actions act3 = new Actions(driver);
  //  WebElement element3= driver.findElement(By.xpath("//*[contains(text(),'Click Me')]"));
  
    //act3.click(element3).perform();
  // System.out.println(element3.getText());
    
    driver.findElement(By.xpath("//button[text()='Click Me']")).click();

//String str4=driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
//       
//        driver.findElement(By.id(str4)).click();
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
       
       

    
    

	}
	
	
	
}
