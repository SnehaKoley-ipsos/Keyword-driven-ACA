package ACA_Drivers_Module;

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

public class ACA_Drivers_Module 
{
	
	static WebDriver driver =  ACA_Web_Driver.ACA_Activate_Get_Driver.getdriver();
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	ACA_Drivers_Module_Path mp = new ACA_Drivers_Module_Path(driver);
	String Drivers_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Drivers_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Drivers_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
	
    public static String path = System.getProperty("user.dir");
    String sourcePath="";
    int DriversScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-caret-down mg-t-2 fs-11']")).size();
    
    
    public void Navigate_to_Drivers_Module(ExtentTest test, String folderName) throws Throwable
	{
  		try
  		{  		
	  		Thread.sleep(1000);
	  	  	List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
	  	  	for (int i= 0; i<listA.size(); i++)
	  	    {
	  	  		if(listA.get(i).getText().equalsIgnoreCase("Drivers")) 
	  	  		{
	  	  			System.out.println("\n" + "Module Name is : " + listA.get(i).getText());
	  	  			listA.get(i).click();
	  	  			Thread.sleep(500);
	  	  		}
	  	    }
	  	  	//WebDriverWait wait = new WebDriverWait(driver, 30);
	  	  	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
	  	  	WebDriverWait wait = new WebDriverWait(driver, 50);
	  	  	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
	  	  		
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	  	  	//TacticScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
	  	  	//int TacticScreenOpen = aca_TMP.get_TacticScreenOpen().size();
			if(DriversScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Drivers_Module"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Navigate_to_Drivers_Module - Drivers Module is Open");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Navigate_to_Drivers_Module - Drivers Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
			//ACA_Activate_Global_Functions.Take_Snap_Shot();
  			}
  		catch (Exception ex)
  			{
  				System.out.println("\n" + "Navigate_to_Drivers_Module : " + ex.getMessage());
  			}    	
	}
    
	//@SuppressWarnings("deprecation")
	public void Drivers_Filter_Scope_Select_DeSelect(ExtentTest test, String folderName) throws Throwable
	{
		try
		{		
			if (driver.findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
            {
				System.out.println("\n" + "Attempted Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(200);				
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(1, 3);
                Thread.sleep(200);
				String Tactic_Filter_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/ol/li/ol/li[";
				String Tactic_Filter_2 = "]/span/label/span/i";
                String Tactic_Filter_3 = Tactic_Filter_1+Random_Value+Tactic_Filter_2;
                Thread.sleep(200);
                driver.findElement(By.xpath(Tactic_Filter_3)).click();
                Thread.sleep(200);

                System.out.println("\n" + "Drivers_Filter_Scope_Select_DeSelect : Executed");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Drivers_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}		
		
	public void Drivers_DrillDown(ExtentTest test, String folderName) 
	{
		try 
		{			
            int Total_Drivers_DrillDown_Grid_Items = mp.getTotal_Drivers_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Drivers Module
            
            for (int i = 4; i < Total_Drivers_DrillDown_Grid_Items + 4; i++)
            {
                String Drivers_DrillDown_Item = (Drivers_DrillDown_Grid_Item_Path_1 + i + Drivers_DrillDown_Grid_Item_Path_2);
                WebElement Drivers_DrillDown_Item_Value = driver.findElement(By.xpath(Drivers_DrillDown_Item));
                String Drivers_DrillDown_Item_Name = Drivers_DrillDown_Item_Value.getText();
                driver.findElement(By.xpath(Drivers_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Drivers_DrillDown Grid Item : " + Drivers_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 5);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
                int DrillBackIcon = mp.getTotal_Drivers_DrillDown_Back_Items().size();
    			if(DrillBackIcon != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Drivers_DrillDown-" + Drivers_DrillDown_Item_Name +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Drivers_DrillDown - One Step DrillDown");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Drivers_DrillDown - Page is some issue<br>"+ path);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
               
                
                int Total_Dimension_Items = mp.getTotal_Dimension_Items().size();       //Count On Every Dimension from ButtonPanel
                
                if (Total_Dimension_Items != 0)
                {
                    String CountValue_1 = "//*[@class='btn-small btn-grey mg-b-5 '][";
                    String CountValue_2 = "]";

                    for (int ii = 1; ii <= Total_Dimension_Items; ii++)
                    {
                        String CountValue_3 = (CountValue_1 + ii + CountValue_2);
                        WebElement Dimension_Item_Value = driver.findElement(By.xpath(CountValue_3));
                        String Dimension_Item_Name = Dimension_Item_Value.getText();
                        driver.findElement(By.xpath(CountValue_3)).click();
                        //Thread.sleep(500);
                        
                        System.out.println("\n" + "Drivers_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                        
                        DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']")).size();
            			if(DrillBackIcon != 0)
            			{
            				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Drivers_DrillDown_Dimension_Item-" + Drivers_DrillDown_Item_Name + "-" + Dimension_Item_Name +".png";
            				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
            				Thread.sleep(2000);
            				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
            				test.log(Status.INFO, "Drivers_DrillDown - Dimension Item");
            				test.log(Status.PASS, "<br>"+ path);
            			}
            			else
            			{
            				test.fail("Drivers_DrillDown - Dimension Item - Page is some issue<br>"+ path);
            				//Assert.assertEquals(1, size);
            			}
//--------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

            			Thread.sleep(500);
                    }
                }
                
                int Total_Drivers_DrillDown_Back_Items = mp.getTotal_Drivers_DrillDown_Back_Items().size();		//Drivers_DrillDown_Back

                //Thread.sleep(500);
                String Drivers_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[";
                String Drivers_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Drivers_DrillDown_Back_Item_Path_3 = "]/div[1]/div";

                //Thread.sleep(500);
                String Drivers_DrillDown_Back_Item_1 = (Drivers_DrillDown_Back_Item_Path_1 + (Total_Drivers_DrillDown_Back_Items + 2) + Drivers_DrillDown_Back_Item_Path_3);
                WebElement Drivers_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_1));
                String Drivers_DrillDown_Back_Item_Name = Drivers_DrillDown_Back_Item_Value.getText();
                //Thread.sleep(500);
                
                String Drivers_DrillDown_Back_Item_3 = (Drivers_DrillDown_Back_Item_Path_1 + (Total_Drivers_DrillDown_Back_Items + 2) + Drivers_DrillDown_Back_Item_Path_2);
                
                //Thread.sleep(500);
                driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_3)).click();
                Thread.sleep(500);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Drivers_DrillDown Back Item : " + Drivers_DrillDown_Back_Item_Name);
            }			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Drivers_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Drivers_Export(ExtentTest test, String folderName)
	{
		try
		{
			int Drivers_Export_Path_Count = mp.getDrivers_Export_Path_Count().size();
			
			if(Drivers_Export_Path_Count != 0)
			{
				WebElement export = mp.getexport();
				export.click();
				//Thread.sleep(200);
				
				WebElement excel = mp.getexcel();
				excel.click();
				Thread.sleep(1000);
				
				//WebDriverWait wait = new WebDriverWait(driver, 10);
                //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
    			if(Drivers_Export_Path_Count != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Drivers_Export_Excel" +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Drivers_Export - Excel");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Drivers_Export - Excel is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//--------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

				
				
				System.out.println("\n" + "Drivers_Export : Excel Executed");
                
//-----------------------------------------------------------------------------------------------------------------------------------------//
                                
                export.click();				//For CSV
				Thread.sleep(200);
				
				WebElement csv = mp.getcsv();
				csv.click();
				Thread.sleep(1000);
				
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
    			if(Drivers_Export_Path_Count != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Drivers_Export_CSV" +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Drivers_Export - CSV");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Drivers_Export - CSV is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//--------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

				
				System.out.println("\n" + "Drivers_Export : CSV Executed");
				
                //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //System.out.println("\n" + "Drivers_Export : CSV Executed");
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Drivers_Export : " + ex.getMessage());
        }		
	}
	
	public void Drivers_Add_Column(ExtentTest test, String folderName)
	{
		try 
		{
//			WebElement a = driver.findElement(By.xpath("//*[@class='selected']"));
//            String b = a.getText();
//            System.out.println("\n" + "Selected Module : " + b);
//            Thread.sleep(5000);
			
			
			int Drivers_Add_Column_Path_Count = mp.getDrivers_Add_Column_Path_Count().size();
			
			if (Drivers_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = mp.getAdd_Column();
				Add_Column.click();
				Thread.sleep(200);
				
				int Total_Add_Column_Items = mp.getTotal_Add_Column_Items().size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[4]/div/div/div[2]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(1000);
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
    			if(Total_Add_Column_Items != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Drivers_Add_Column" +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Drivers_Add_Column");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Drivers_Add_Column is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//--------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

                
                System.out.println("\n" + "Drivers_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Drivers_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = mp.getTotal_Grid_Name_Path_List();
                
                for (int i=0; i< Total_Grid_Name_Path_List.size(); i++ )
                {
                	if(!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name))
                	{                		
                		System.out.println("\n" + "Drivers_Add_Column : Add Column and Grid verify successful");
                		break;
                	}
                }
			}			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Drivers_Add_Column : " + ex.getMessage());
        }
	}
	
	
}
