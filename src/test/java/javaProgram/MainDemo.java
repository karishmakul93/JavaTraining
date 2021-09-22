package javaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainDemo {

	public static void main(String[] args) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      // browser type and chromedrover.exe path as parameters
			    
			      String url = " https://opensource-demo.orangehrmlive.com/";
			      driver.get(url);
			  
	
	}

}
