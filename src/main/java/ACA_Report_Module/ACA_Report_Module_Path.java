package ACA_Report_Module;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ACA_Report_Module_Path 
{
	static WebDriver driver;
	By Report_Module_ListA = By.xpath("//*[@class='outer']");
	
	public ACA_Report_Module_Path(WebDriver driver) 
	{
		ACA_Report_Module_Path.driver = driver;
    }
	public List<WebElement> get_Report_Module_ListA()
    {
    	return driver.findElements(Report_Module_ListA);
    }
}
