package javaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties_example {
	
	@Test
	public void f() throws Exception {
	     
	      File file = new File("C:\\Users\\Administrator\\java\\JavaTraining\\src\\test\\java\\OR.properties");
	     
	      FileInputStream fInput= new FileInputStream(file);
	     
	      Properties prop = new Properties();
	     
	      prop.load(fInput);
	     
	      System.out.println(prop.getProperty("objUsername"));
	  }

	

}
