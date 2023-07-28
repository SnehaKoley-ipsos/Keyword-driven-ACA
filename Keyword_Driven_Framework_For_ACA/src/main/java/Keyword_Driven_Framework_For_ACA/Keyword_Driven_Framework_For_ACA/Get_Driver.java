package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Driver {

	public static WebDriver driver;	
		
	public static WebDriver getdriver(){
	    if (driver == null){
	    	System.setProperty("webdriver.chrome.drier","C:\\Users\\Prosenjit.Ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	      return driver;
	    }
	    else{
	      return driver;
	    }
	  }
	
	
}
