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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
	
	public static String path = System.getProperty("user.dir");
    String sourcePath="";
	int All_Report_Count;
	
	ACA_Report_Module_Path mp = new ACA_Report_Module_Path(driver);
	
	public void Navigate_to_Report_Module(ExtentTest test, String folderName) throws Throwable
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
    		
    		//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    		All_Report_Count  = driver.findElements(By.xpath("//*[@class='pd-5 wd-pct-100']")).size();
	  	  	//int TacticScreenOpen = aca_TMP.get_TacticScreenOpen().size();
			if(All_Report_Count != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Report_Module"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Navigate_to_Report_Module - Tactic Module is Open");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Navigate_to_Report_Module - Report Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Navigate_to_Report_Module : " + ex.getMessage());
		}    	
	}
	
	public void Navigate_to_All_Individual_Report(ExtentTest test, String folderName) throws Throwable
	{
    	try
    	{
    		Thread.sleep(1000);
    		//int All_Report_Count  = driver.findElements(By.xpath("//*[@class='pd-5 wd-pct-100']")).size();
    		String Navigate_to_Report_Part_1 = "//*[@id='main']/div/div/div[1]/div/div/div/div/div[";
    		String Navigate_to_Report_Part_2 = "]";
    		
    		for(int i = 1; i < All_Report_Count+1; i++)
    		{
    			String Navigate_to_All_Report = (Navigate_to_Report_Part_1 + i + Navigate_to_Report_Part_2);
                WebElement Navigate_to_Every_Report = driver.findElement(By.xpath(Navigate_to_All_Report));
                String Navigate_to_All_Report_Name = Navigate_to_Every_Report.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Navigate_to_All_Report)).click();
                //Thread.sleep(500);
                
                WebDriverWait wait_1 = new WebDriverWait(driver, 200);
        		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
        		
        		//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
        		
    			if(All_Report_Count != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Report_Module"+".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Navigate_to_All_Report_Name - " + Navigate_to_All_Report_Name + " Report Module is Open");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Navigate_to_All_Report_Name - Report Module is not open<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
    			//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
    			
        		
        		System.out.println("\n" + "Navigate_to_All_Individual_Report : " + Navigate_to_All_Report_Name);        		
        		
    		}    		
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Go_To_Report_Module : " + ex.getMessage());
		}    	
	}
	
	
}
