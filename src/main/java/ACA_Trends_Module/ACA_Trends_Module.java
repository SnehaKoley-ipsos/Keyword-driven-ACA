package ACA_Trends_Module;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ACA_Global_Functions.ACA_Activate_Global_Functions;
import ACA_Tactics_Module.ACA_Tactics_Module_Path;

public class ACA_Trends_Module {
	
	//static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	static WebDriver driver = ACA_Web_Driver.ACA_Activate_Get_Driver.getdriver();
	ACA_Trends_Module_Path mp = new ACA_Trends_Module_Path(driver);
	public static String path = System.getProperty("user.dir");
    String sourcePath="";
    int TrendsScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-caret-down mg-t-2 fs-11']")).size();
	
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	String Trends_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Trends_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Trends_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    int DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']")).size();
	
	@SuppressWarnings("deprecation")
	public void Navigate_to_Trends_Module(ExtentTest test, String folderName) throws Throwable
	{
    	try 
    	{    		
    		Thread.sleep(500);
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("TRENDS")) 
    			{   
    				System.out.println("\n" + "Module Name is : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
    		WebDriverWait wait_1 = new WebDriverWait(driver, 200);
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    		
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	  	  	//TacticScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
	  	  	//int TacticScreenOpen = aca_TMP.get_TacticScreenOpen().size();
			if(TrendsScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Trends_Module"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Navigate_to_Trends_Module - Trends Module is Open");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Navigate_to_Trends_Module - Trends Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
    		
    		//ACA_Activate_Global_Functions.Take_Snap_Shot();
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Navigate_to_Trends_Module : " + ex.getMessage());
		}    	
	}
	
	public void Trends_Filter_Scope_Select_DeSelect(ExtentTest test, String folderName) throws Throwable
	{
		try
		{		
			if (mp.getTrends_Filter_Scope_Select_DeSelect().size() == 1)
            {
				System.out.println("\n" + "Attempted Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(500);				
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(1, 3);
                Thread.sleep(500);
				String Tactic_Filter_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/ol/li/ol/li[";
				String Tactic_Filter_2 = "]/span/label/span/i";
                String Tactic_Filter_3 = Tactic_Filter_1+Random_Value+Tactic_Filter_2;
                Thread.sleep(500);
                driver.findElement(By.xpath(Tactic_Filter_3)).click();
                Thread.sleep(500);

                System.out.println("\n" + "Trends_Filter_Scope_Select_DeSelect : Executed");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Trends_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}	
			
	public void Trends_DrillDown(ExtentTest test, String folderName) 
	{
		try 
		{
			List<WebElement> listB  = mp.getlistB();
			for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Month")) 
    			{   
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();													//Click On Month from Trends Module
    				Thread.sleep(500);
    				WebDriverWait wait = new WebDriverWait(driver, 200);
    				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    			}
        	}
			Thread.sleep(500);
			int Total_Trends_DrillDown_Grid_Items = mp.getTotal_Trends_DrillDown_Grid_Items().size();              //Count On Every Month Items from Trends Module
            
            for (int j = 3; j < Total_Trends_DrillDown_Grid_Items + 3; j++)
            {
            	if(j > 3) 
            	{
            		List<WebElement> listC  = mp.getlistC();
            		for (int i= 0; i<listC.size(); i++)
                	{
            			if(listC.get(i).getText().equalsIgnoreCase("Month")) 
            			{   
            				System.out.println("\n" + "Select on : " + listC.get(i).getText());
            				listC.get(i).click();
            				Thread.sleep(500);
            				WebDriverWait wait = new WebDriverWait(driver, 200);
            				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            			}
                	}
            	}
            	
                String Trends_DrillDown_Item = (Trends_DrillDown_Grid_Item_Path_1 + j + Trends_DrillDown_Grid_Item_Path_2);
                WebElement Trends_DrillDown_Item_Value = driver.findElement(By.xpath(Trends_DrillDown_Item));
                String Trends_DrillDown_Item_Name = Trends_DrillDown_Item_Value.getText();
                
                driver.findElement(By.xpath(Trends_DrillDown_Item)).click();
                Thread.sleep(500);
                
                System.out.println("\n" + "Trends_DrillDown Grid Item : " + Trends_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));

//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
              
                DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']")).size();
    			if(DrillBackIcon != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Trends_DrillDown-"+ Trends_DrillDown_Item_Name +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Trends_DrillDown - One Step DrillDown");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Trends_DrillDown - Page is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

                int Total_Dimension_Items = mp.getTotal_Dimension_Items().size();       //Select On Month & Day Dimension
                
                if (Total_Dimension_Items == 1)
                {
                	WebElement day_Dimension = mp.getday_Dimension();
                	day_Dimension.click();
                	Thread.sleep(1000);
                    
                	String Trends_day_Dimension = day_Dimension.getText();
                    System.out.println("\n" + "Trends_DrillDown Dimension Item : " + Trends_day_Dimension);
                    
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                	Thread.sleep(500);
                	
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                    
                    DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']")).size();
        			if(DrillBackIcon != 0)
        			{
        				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Trends_DrillDown_Dimension-"+ Trends_day_Dimension +".png";
        				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
        				Thread.sleep(2000);
        				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
        				test.log(Status.INFO, "Trends_DrillDown_Dimension - Day_Dimension");
        				test.log(Status.PASS, "<br>"+ path);
        			}
        			else
        			{
        				test.fail("Trends_DrillDown - Page is some issue<br>"+ path);
        				//Assert.assertEquals(1, size);
        			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
                	
                }
                
                Thread.sleep(500);
                int Total_Trends_DrillDown_Back_Items = mp.getTotal_Trends_DrillDown_Back_Items().size();		//Trends_DrillDown_Back

                //Thread.sleep(500);
                String Trends_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Trends_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Trends_DrillDown_Back_Item_Path_3 = "]/div[1]/div";

                //Thread.sleep(500);
                String Trends_DrillDown_Back_Item_1 = (Trends_DrillDown_Back_Item_Path_1 + (Total_Trends_DrillDown_Back_Items + 2) + Trends_DrillDown_Back_Item_Path_3);
                WebElement Trends_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Trends_DrillDown_Back_Item_1));
                String Trends_DrillDown_Back_Item_Name = Trends_DrillDown_Back_Item_Value.getText();
                //Thread.sleep(500);
                
                String Trends_DrillDown_Back_Item_3 = (Trends_DrillDown_Back_Item_Path_1 + (Total_Trends_DrillDown_Back_Items + 2) + Trends_DrillDown_Back_Item_Path_2);
                
                //Thread.sleep(500);
                driver.findElement(By.xpath(Trends_DrillDown_Back_Item_3)).click();
                Thread.sleep(500);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                
                System.out.println("\n" + "Trends_DrillDown Back Item : " + Trends_DrillDown_Back_Item_Name);
            }	
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Trends_DrillDown : " + ex.getMessage());
        }
	}
			
	public void Trends_Export(ExtentTest test, String folderName)
	{
		try
		{
			int Trends_Export_Path_Count = mp.getTrends_Export_Path_Count().size();
			
			if(Trends_Export_Path_Count != 0)
			{
				WebElement export = mp.getexport();
				export.click();
				Thread.sleep(3000);
				
				WebElement excel = mp.getexcel();
				excel.click();				
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                System.out.println("\n" + "Trends_Export : Excel Executed");
                                
                export.click();
				Thread.sleep(1000);
				
				WebElement csv = mp.getcsv();
				csv.click();		
				
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                if( driver.findElements(By.xpath("//*[@class='  btn-group']")).size() != 0)
               	 {
	     				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Trends_Export"+".png";
	     				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
	     				Thread.sleep(2000);
	     				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
	     				test.log(Status.INFO, "Trends_Export - Trends Export Working Successful");
	     				test.log(Status.PASS, "<br>"+ path);
               	 }
                 else
                 {
       				test.fail("Trends_Export - Trends Export is not Working<br>"+ path);
       				//Assert.assertEquals(1, size);
       			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

                WebDriverWait wait_1 = new WebDriverWait(driver, 10);
                wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));                
                
                System.out.println("\n" + "Trends_Export : CSV Executed");
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Trends_Export : " + ex.getMessage());
        }		
	}
	
	public void Trends_Add_Column(ExtentTest test, String folderName)
	{
		try 
		{			
			int Trends_Add_Column_Path_Count = mp.getTrends_Add_Column_Path_Count().size();
			
			if (Trends_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = mp.getAdd_Column();
				Add_Column.click();
				Thread.sleep(1000);
				
				int Total_Add_Column_Items = mp.getTotal_Add_Column_Items().size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                if( driver.findElements(By.xpath("//*[@class='btn-small btn-grey2 position-relative']")).size() != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Trends_Add_Column"+".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Trends_Add_Column - Add Column Working Successful");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Trends_Add_Column - Add Column is not Working <br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
           
                System.out.println("\n" + "Trends_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Trends_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = mp.getTotal_Grid_Name_Path_List();
                
                for (int i=0; i< Total_Grid_Name_Path_List.size(); i++ )
                {
                	if(!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name))
                	{                		
                		System.out.println("\n" + "Trends_Add_Column : Add Column and Grid verify successful");
                		break;
                	}
                }
			}			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Trends_Add_Column : " + ex.getMessage());
        }
	}
	
	
}
