package ACA_Report_Module;

import java.io.File;
import java.io.IOException;
import java.util.Date;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ACA_Common_Test_Cases.ACA_Common_Test_Cases;
import ACA_Global_Functions.ACA_Activate_Global_Functions;
import ACA_Optimize_Module.ACA_Optimize_Module_Path;
import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Report_Module {
	
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();

	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	ACA_Report_Module_Path mp = new ACA_Report_Module_Path(driver);
	
	public void Go_To_Report_Module() throws Throwable
	{
    	try
    	{
    		Thread.sleep(1000);
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("REPORT")) 
    			{
    				System.out.println("\n" + "Module Name is : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
    		WebDriverWait wait_1 = new WebDriverWait(driver, 200);
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    		
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Go_To_Report_Module : " + ex.getMessage());
		}    	
	}
	
	
}
