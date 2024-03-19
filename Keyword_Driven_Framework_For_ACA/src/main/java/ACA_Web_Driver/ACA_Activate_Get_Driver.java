package ACA_Web_Driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACA_Activate_Get_Driver {

	public static WebDriver driver;	
		
	public static WebDriver getdriver()
	{
	    if (driver == null)
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Keyword_Driven_Framework_For_ACA\\src\\test\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	
//	    	System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//	        driver = new FirefoxDriver();
	    		    	
//	    	System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
//	        driver = new EdgeDriver();
	        
	        driver.manage().window().maximize();
	    	
	      return driver;
	    }
	    else
	    {
	      return driver;
	    }
	 }
	
	
}
