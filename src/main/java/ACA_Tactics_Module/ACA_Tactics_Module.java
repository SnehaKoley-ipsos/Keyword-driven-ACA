package ACA_Tactics_Module;
 
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ACA_Global_Functions.ACA_Activate_Global_Functions;

import org.openqa.selenium.JavascriptExecutor;


public class ACA_Tactics_Module {

    static WebDriver driver = ACA_Web_Driver.ACA_Activate_Get_Driver.getdriver();
    ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
    private Object String;
    ACA_Tactics_Module_Path aca_TMP = new ACA_Tactics_Module_Path(driver);
    String Tactics_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Tactics_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Tactics_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    
    public static String path = System.getProperty("user.dir");
    String sourcePath="";
    //int TacticScreenOpen;
    int DrillBackIcon;
    int TacticScreenOpen = aca_TMP.get_TacticScreenOpen().size();
    

    //String Tactics_DrillDown_Grid_Item_Path_1 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_1().toString();
	//String Tactics_DrillDown_Grid_Item_Path_2 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_2().toString();
    //String Tactics_DrillDown_Grid_Item_Path_3 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_3().toString();
  
    public void Navigate_to_Tactics_Module(ExtentTest test, String folderName) throws Throwable
	{
  		try 
  		{    		
	  		Thread.sleep(1000);
	  	  	List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
	  	  	for (int i= 0; i<listA.size(); i++)
	  	    {
	  	  		if(listA.get(i).getText().equalsIgnoreCase("Tactics")) 
	  	  		{   
	  	  			System.out.println("\n" + "Module Name is : " + listA.get(i).getText());
	  	  			listA.get(i).click();
	  	  			Thread.sleep(500);
	  	  		}
	  	    }
	  	  	WebDriverWait wait_1 = new WebDriverWait(driver, 50);
	  	  	wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
	  	  		
	  	  	//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	  	  	//TacticScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
	  	  	//int TacticScreenOpen = aca_TMP.get_TacticScreenOpen().size();
			if(TacticScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Tactics_Module"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Navigate_to_Tactics_Module - Tactic Module is Open");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Navigate_to_Tactics_Module - Tactic Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
			//ACA_Activate_Global_Functions.Take_Snap_Shot();
  			}
  		catch (Exception ex)
  			{
  				System.out.println("\n" + "Navigate_to_Tactics_Module : " + ex.getMessage());
  			}    	
	}
    
    public void ACA_AppVersion_Verify(ExtentTest test, String folderName) throws Throwable
	{
  		try 
  		{    		
	  		Thread.sleep(1000);
	  	  	//WebElement version = driver.findElement(By.id("appversion"));
	        //String appVersion = version.getText();
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        String appVersion = (String) js.executeScript("return document.getElementById('appversion').innerText;");
	        
	  	  	System.out.println("\n" + "ACA_AppVersion_Verify : " + appVersion);
	  	  	
	  	  	WebDriverWait wait_1 = new WebDriverWait(driver, 5);
	  	  	wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
	  	  		
	  	  	//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	  	  	
			if(TacticScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"ACA_AppVersion_Verify"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "ACA_AppVersion_Verify - " + appVersion);
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("ACA_AppVersion_Verify - Tactic Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
			//ACA_Activate_Global_Functions.Take_Snap_Shot();
  			}
  		catch (Exception ex)
  			{
  				System.out.println("\n" + "ACA_AppVersion_Verify : " + ex.getMessage());
  			}    	
	}
    
    public void Tactics_KPI_and_Grid_Data_Verify(ExtentTest test, String folderName)
    {
        try
        {	
        	String Total_KPI_Name = aca_TMP.getTotal_KPI_Name().getAttribute("title");
            double Total_KPI_Value = Double.parseDouble(aca_TMP.getTotal_KPI_Value().getAttribute("title").replaceAll("[^\\d.]", ""));
            System.out.println("\n" + "KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value);

            List<WebElement> gridList = aca_TMP.getgridList();
            double sum = 0;
            for (int i = 0; i < gridList.size(); i++)
            {
                double gridSpendValue = Double.parseDouble(gridList.get(i).getAttribute("title").replaceAll("[^\\d.]", ""));
                sum += gridSpendValue;
            }
            System.out.println("\n" + "Grid Total Spend Value = " + sum);
            
            if (Total_KPI_Value == sum)
            {
//-------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	    		Thread.sleep(2000);
	    		sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_KPI_and_Grid_Data_Verify"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Tactics_KPI_and_Grid_Data_Verify -" + "<br>" + " KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value + "<br>" + "Grid Total Spend Value = " + sum);
				test.log(Status.PASS, "<br>"+ path);
//-------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//				
                
				System.out.println("\n" + "Tactics_KPI_and_Grid_Data_Verify - Total KPI values are matched to the Grid values");
            }
            else
            {
//-------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
            	Thread.sleep(2000);
	    		sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_KPI_and_Grid_Data_Verify"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Tactics_KPI_and_Grid_Data_Verify -" + "<br>" + " KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value + "<br>" + "Grid Total Spend Value = " + sum);
				test.log(Status.FAIL, "Tactics_KPI_and_Grid_Data_Verify - Total KPI values does not match the Grid values<br>"+ path);
            	
            	//String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				//String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				//test.fail("Tactics_KPI_and_Grid_Data_Verify - The Total KPI values does not match the Grid values<br>"+ path1);
				//Assert.assertEquals(1, size);
//-------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//            	
                
				System.out.println("\n" + "Tactics_KPI_and_Grid_Data_Verify - Total KPI values does not match the Grid values");
            }
        }
        catch (Exception ex)
        {
            System.out.println("\n" + "Tactics_KPI_and_Grid_Data_Verify : " + ex.getMessage());
        }
    }
    
    public void Tactics_Filter_Scope_Select_DeSelect(ExtentTest test, String folderName) throws Throwable
	{
		try
		{
			if (driver.findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
			{
				System.out.println("\n" + "Attempted Tactics_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
			}
			else
			{
				Thread.sleep(500);				
				Random rnd = new Random();
				int Random_Value = rnd.nextInt(3);
				Thread.sleep(500);
				String Tactic_Filter_1 = "/html/body/div/div/div/div/div/div/div[4]/div/div/div/ol/li/ol/li[";
				String Tactic_Filter_2 = "]/span/label/span/i";
				String Tactic_Filter_3 = Tactic_Filter_1+Random_Value+Tactic_Filter_2;
				Thread.sleep(500);
				driver.findElement(By.xpath(Tactic_Filter_3)).click();
				Thread.sleep(500);
				System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : Executed");
				
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
				if(TacticScreenOpen != 0)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Filter_Scope_Select_DeSelect"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Tactics_Filter_Scope_Select_DeSelect - Filter Scope DeSelected Successfully");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					test.fail("Tactics_Filter_Scope_Select_DeSelect - Filter Scope was not DeSelected Successfully<br>"+ path);
					//Assert.assertEquals(1, size);
				}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}    
    
    public void Tactics_DrillDown(ExtentTest test, String folderName) 
	{
		try 
		{
            Thread.sleep(500);
            int Total_Tactics_DrillDown_Grid_Items = aca_TMP.getTotal_Tactics_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Tactics Module
            for (int i = 3; i < Total_Tactics_DrillDown_Grid_Items + 3; i++)
            {
                String Tactics_DrillDown_Item = (Tactics_DrillDown_Grid_Item_Path_1 + i + Tactics_DrillDown_Grid_Item_Path_2);
                WebElement Tactics_DrillDown_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Item));
                String Tactics_DrillDown_Item_Name = Tactics_DrillDown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Tactics_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Tactics_DrillDown Grid Item : " + Tactics_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
                DrillBackIcon = aca_TMP.get_DrillBackIcon().size();
    			if(DrillBackIcon != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_DrillDown-" + Tactics_DrillDown_Item_Name +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Tactics_DrillDown - One Step DrillDown");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Tactics_DrillDown - Page is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
  
                Thread.sleep(500);
                int Total_Dimension_Items = aca_TMP.getTotal_Dimension_Items().size();       //Count On Every Dimension from ButtonPanel
                
                if (Total_Dimension_Items != 0)
                {
                    //Thread.sleep(500);
                    String CountValue_1 = "//*[@class='btn-small btn-grey mg-b-5 '][";
                    String CountValue_2 = "]";

                    for (int ii = 1; ii <= Total_Dimension_Items; ii++)
                    {
                        //Thread.sleep(500);
                        String CountValue_3 = (CountValue_1 + ii + CountValue_2);
                        WebElement Dimension_Item_Value = driver.findElement(By.xpath(CountValue_3));
                        String Dimension_Item_Name = Dimension_Item_Value.getText();
                        driver.findElement(By.xpath(CountValue_3)).click();
                        Thread.sleep(500);
                        
                        System.out.println("\n" + "Tactics_DrillDown Dimension Item : " + Dimension_Item_Name);

                        // WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));

//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                                                
                        DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']")).size();
            			if(DrillBackIcon != 0)
            			{
            				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_DrillDown_Dimension_Item-" + Tactics_DrillDown_Item_Name + "-" + Dimension_Item_Name +".png";
            				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
            				Thread.sleep(2000);
            				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
            				test.log(Status.INFO, "Tactics_DrillDown - Dimension Item");
            				test.log(Status.PASS, "<br>"+ path);
            			}
            			else
            			{
            				test.fail("Tactics_DrillDown - Dimension Item - Page is some issue<br>"+ path);
            				//Assert.assertEquals(1, size);
            			}
//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

            			Thread.sleep(500);
                    }
                }
                
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(500);
                int Total_Tactics_DrillDown_Back_Items = aca_TMP.getTotal_Tactics_DrillDown_Back_Items().size();		//Tactics_DrillDown_Back
                
                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";

                String Tactics_DrillDown_Back_Item_1 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_3);
                WebElement Tactics_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1));
                String Tactics_DrillDown_Back_Item_Name = Tactics_DrillDown_Back_Item_Value.getText();
                Thread.sleep(500);
                
                String Tactics_DrillDown_Back_Item_3 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_2);
                
                Thread.sleep(500);
                WebElement yourElement = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3));
                WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(yourElement));
                clickableElement.click();
                Thread.sleep(500);

                //WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                                
                System.out.println("\n" + "Tactics_DrillDown Back Item : " + Tactics_DrillDown_Back_Item_Name);    
            }
			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_DrillDown : " + ex.getMessage());
        }
	}
        
    public void Tactics_Export(ExtentTest test, String folderName)
    {
        try
        {
            int Tactics_Export_Path_Count = aca_TMP.getTactics_Export_Path_Count().size();
            if (Tactics_Export_Path_Count != 0)
            {
                WebElement export = aca_TMP.getexport();
                export.click();
                Thread.sleep(1000);

                WebElement excel = aca_TMP.getexcel();
                excel.click();
                Thread.sleep(5000);
                WebDriverWait wait = new WebDriverWait(driver, 5);

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                System.out.println("\n" + "Tactics_Export : Excel Executed");

                export.click();
                Thread.sleep(1000);

                WebElement csv = aca_TMP.getcsv();
                csv.click();
                Thread.sleep(5000);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                if( driver.findElements(By.xpath("//*[@class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8 wd-pct-75']")).size() != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Export"+".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Tactics_Export - Tactics Export Working Successful");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Tactics_Export - Tactics Export is not Working<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
  
                System.out.println("\n" + "Tactics_Export : CSV Executed");
            }

        }
        catch (Exception ex)
        {
            System.out.println("\n" + "Tactics_Export : " + ex.getMessage());
        }
    }
    
    public void Tactics_Add_Column(ExtentTest test, String folderName)
    {
        try
        {
            int Tactics_Add_Column_Path_Count = aca_TMP.getTactics_Add_Column_Path_Count().size();
            if (Tactics_Add_Column_Path_Count != 0)
            {
            	WebElement Add_Column = aca_TMP.getAdd_Column();
                Add_Column.click();
                Thread.sleep(1000);

                int Total_Add_Column_Items = aca_TMP.getTotal_Add_Column_Items().size();
                String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
				String Add_Column_Item_Path_2 = "]";

				//String Add_Column_Item_Path_1 = aca_TMP.getAdd_Column_Item_Path_1().toString();
				//String Add_Column_Item_Path_2 = aca_TMP.getAdd_Column_Item_Path_2().toString();

                String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                if( driver.findElements(By.xpath("//*[@class='btn-small btn-grey2 position-relative']")).size() != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Add_Column"+".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Tactics_Add_Column - Add Column Working Successful");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Tactics_Add_Column - Add Column is not Working <br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();      
                Thread.sleep(5000);

                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = aca_TMP.getTotal_Grid_Name_Path_List();
                for (int i = 0; i < Total_Grid_Name_Path_List.size(); i++) {
                	
                    if (!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name))
                    {
                    	System.out.println("\n" + "Tactics_Add_Column : Add Column and Grid verify successful");
                        break;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("\n" + "Tactics_Add_Column : " + ex.getMessage());
        }
    }
    
    public void Tactics_Thresholds(ExtentTest test, String folderName) throws Throwable
	{
		try
		{
			Thread.sleep(2000);
			int Tactics_Thresholds_Path_Count = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
			Thread.sleep(500);
			
			if (Tactics_Thresholds_Path_Count != 0)
			{
				WebElement Thresholds = driver.findElement(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']"));
				Thresholds.click();
				Thread.sleep(3000);
				
				System.out.println("\n" + "Tactics_Thresholds : PopUp is Open");
				
				WebElement Thresholds_Minimum_Pct = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/input"));
				WebElement Thresholds_Maximum_Pct = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/div[3]/div[3]/input"));
				//WebElement Thresholds_Orange_Colour = driver.findElement(By.xpath("//*[@class='t-cell  bo-r-c-lighter-grey bo-b-c-lighter-grey  cursor-default threshold-background-orange']"));
				//WebElement Thresholds_Green_Colour = driver.findElement(By.xpath("//*[@class='t-cell  bo-r-c-lighter-grey bo-b-c-lighter-grey  cursor-default threshold-background-green']"));
				
				Thresholds_Minimum_Pct.sendKeys("10");
				Thread.sleep(1000);
				
				Thresholds_Maximum_Pct.sendKeys("80");
				Thread.sleep(2000);
				
				WebElement Thresholds_Set_All = driver.findElement(By.xpath("//*[@class='btn-small btn-blue-selected ht-18 bo-radius-3']"));
				Thresholds_Set_All.click();
				Thread.sleep(3000);
				
				
				//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
				TacticScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-times mg-r-20 cursor-pointer']")).size();
				if(TacticScreenOpen != 0)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Thresholds"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Tactics_Thresholds - PopUp is not open");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					test.fail("Navigate_to_Tactics_Module - Tactic Module is not open<br>"+ path);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Tactics_Thresholds : Clicked on Set All Button");
				
				WebElement Thresholds_Apply = driver.findElement(By.xpath("//*[@class='fas fa-check mg-r-5']"));
				Thresholds_Apply.click();
				Thread.sleep(2000);
				
				
				//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	    		Thread.sleep(2000);
	    		TacticScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
				if(TacticScreenOpen != 0)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Thresholds_Applied"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Tactics_Thresholds - Thresholds is Applied");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
					test.fail("Tactics_Thresholds - Thresholds is not Applied<br>"+ path1);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
								
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Tactics_Thresholds : Clicked on Apply Button");
			}
            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_Thresholds : " + ex.getMessage());
        }		
	}

}






/*package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA.ACA_Tactics_Module;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ACA_Tactics_Module {
	
	static WebDriver driver = Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA.ACA_Activate_Get_Driver.getdriver();
	
	private Object String;
	
	ACA_Tactics_Module_Path  aca_TMP= new ACA_Tactics_Module_Path (driver);
			
	String Tactics_DrillDown_Grid_Item_Path_1 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_1().toString();
    String Tactics_DrillDown_Grid_Item_Path_2 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_2().toString();
    String Tactics_DrillDown_Grid_Item_Path_3 = aca_TMP.getTactics_DrillDown_Grid_Item_Path_3().toString();
   
	public void Tactics_Filter_Scope_Select_DeSelect() throws Throwable
	{
		try
		{
			if (aca_TMP.getTactics_Filter_Scope_Select_DeSelect().size() == 1)
            {
				System.out.println("\n" + "Attempted Tactics_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(500);				
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(3);
                Thread.sleep(500);
				String Tactic_Filter_1 = aca_TMP.getTactic_Filter_1().toString();
				String Tactic_Filter_2 = aca_TMP.getTactic_Filter_2().toString();
                String Tactic_Filter_3 = Tactic_Filter_1+Random_Value+Tactic_Filter_2;
                Thread.sleep(500);
                driver.findElement(By.xpath(Tactic_Filter_3)).click();
                Thread.sleep(500);

                System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : Executed");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}
	
	
	
	
	public void Tactics_KPI_and_Grid_Data_Verify()
	{
		try 
		{
//			int Total_Tactics_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text']")).size();              //Count On Every Grid Items from Tactics Module
//			Random rnd = new Random();
//	        int RamdomValues = rnd.nextInt(Total_Tactics_DrillDown_Grid_Items);
	        
//	        String Tactics_DrillDown_Item_On_Grid_1 = (Tactics_DrillDown_Grid_Item_Path_1 + (2+RamdomValues) + Tactics_DrillDown_Grid_Item_Path_2);
//          WebElement Tactics_DrillDown_Item_Value_On_Grid_1 = driver.findElement(By.xpath(Tactics_DrillDown_Item_On_Grid_1));
//          String Tactics_DrillDown_Item_Name_On_Grid_1 = Tactics_DrillDown_Item_Value_On_Grid_1.getText();
//          driver.findElement(By.xpath(Tactics_DrillDown_Item_On_Grid_1)).click();
//          Thread.sleep(500);
            
//            String Tactics_DrillDown_Item_On_Grid_2 = (Tactics_DrillDown_Grid_Item_Path_1 + (2+RamdomValues) + Tactics_DrillDown_Grid_Item_Path_3);
//            WebElement Tactics_DrillDown_Item_Value_On_Grid_2 = driver.findElement(By.xpath(Tactics_DrillDown_Item_On_Grid_2));
//            String Tactics_DrillDown_Item_Name_On_Grid_2 = Tactics_DrillDown_Item_Value_On_Grid_2.getText();
            
			String Total_KPI_Name = aca_TMP.getTotal_KPI_Name().getAttribute("title");
			double Total_KPI_Value = Double.parseDouble(aca_TMP.getTotal_KPI_Value()).getAttribute("title").replaceAll("[^\\d.]", ""));
			
			System.out.println("\n" + "KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value);
			
            List<WebElement> gridList = aca_TMP.getgridList();
            
            double sum = 0;
            for (int i=0; i< gridList.size(); i++ )
            {
            	double gridSpendValue = Double.parseDouble(gridList.get(i).getAttribute("title").replaceAll("[^\\d.]", ""));
            	sum += gridSpendValue;
            	
            }
            
            System.out.println("\n" + "Total Grid Spend Value : " + sum);
            
            if(Total_KPI_Value == sum)
            {
            	System.out.println("\n" + "The Total KPI values are matched to the Grid values");
            }
            else
            {
            	System.out.println("\n" + "The Total KPI values does not match the Grid values");
            }
            
	        
	        
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_DrillDown_Data_Verify : " + ex.getMessage());
        }
	}
	
	
	public void Tactics_DrillDown() 
	{
		try 
		{
            Thread.sleep(500);
            int Total_Tactics_DrillDown_Grid_Items = aca_TMP.getTotal_Tactics_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Tactics Module
            //String Tactics_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
            //String Tactics_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
            //Thread.sleep(500);

            for (int i = 3; i < Total_Tactics_DrillDown_Grid_Items + 3; i++)
            {
                //Thread.sleep(500);
                String Tactics_DrillDown_Item = (Tactics_DrillDown_Grid_Item_Path_1 + i + Tactics_DrillDown_Grid_Item_Path_2);
                WebElement Tactics_DrillDown_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Item));
                String Tactics_DrillDown_Item_Name = Tactics_DrillDown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Tactics_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Tactics_DrillDown Grid Item : " + Tactics_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(aca_TMP.getinvisibilityOfElementLocated1());
                //Thread.sleep(500);

                //Take_Snap_Shot(driver);

                //Thread.sleep(500);
                int Total_Dimension_Items = aca_TMP.getTotal_Dimension_Items().size();       //Count On Every Dimension from ButtonPanel
                
                if (Total_Dimension_Items != 0)
                {
                    //Thread.sleep(500);
                    String CountValue_1 = aca_TMP.getCountValue_1().toString();
                    String CountValue_2 = aca_TMP.getCountValue_2().toString();

                    for (int ii = 1; ii <= Total_Dimension_Items; ii++)
                    {
                        //Thread.sleep(500);
                        String CountValue_3 = (CountValue_1 + ii + CountValue_2);
                        WebElement Dimension_Item_Value = driver.findElement(By.xpath(CountValue_3));
                        String Dimension_Item_Name = Dimension_Item_Value.getText();
                        //Thread.sleep(500);
                        driver.findElement(By.xpath(CountValue_3)).click();
                        //Thread.sleep(500);
                        
                        System.out.println("\n" + "Tactics_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(aca_TMP.getinvisibilityOfElementLocated2());
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                Thread.sleep(500);
                int Total_Tactics_DrillDown_Back_Items = aca_TMP.getTotal_Tactics_DrillDown_Back_Items.size();		//Tactics_DrillDown_Back

                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_Path_1 = aca_TMP.getTactics_DrillDown_Back_Item_Path_1().toString();
                String Tactics_DrillDown_Back_Item_Path_2 = aca_TMP.getTactics_DrillDown_Back_Item_Path_2().toString();
                String Tactics_DrillDown_Back_Item_Path_3 = aca_TMP.getTactics_DrillDown_Back_Item_Path_3().toString();

                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_1 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_3);
                WebElement Tactics_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1));
                String Tactics_DrillDown_Back_Item_Name = Tactics_DrillDown_Back_Item_Value.getText();
                //Thread.sleep(500);
                
                String Tactics_DrillDown_Back_Item_3 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_2);
                
                //Thread.sleep(500);
                driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3)).click();
                //Thread.sleep(500);

                //WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(aca_TMP.getinvisibilityOfElementLocated3()));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Tactics_DrillDown Back Item : " + Tactics_DrillDown_Back_Item_Name);
                

//                if (Selected_Tab == "DRIVERS")              //Tactics_DrillDown_Back
//                {
//                    Thread.sleep(500);
//                    Total_Tactics_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[";
//                    Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_1 = String.Concat(Tactics_DrillDown_Back_Item_Path_1, Total_Tactics_DrillDown_Back_Items + 2, Tactics_DrillDown_Back_Item_Path_3);
//                    Tactics_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_3 = String.Concat(Tactics_DrillDown_Back_Item_Path_1, Total_Tactics_DrillDown_Back_Items + 2, Tactics_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3)).click();
//                }
//                else if (Selected_Tab == "OPTIMIZE")
//                {
//                    Thread.sleep(500);
//                    Total_Tactics_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@class='main-left-panel world-map p-0 ht-47 d-flex']")).Count();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_Path_1 = "//*[@class='main-left-panel world-map p-0 ht-47 d-flex'][";
//                    Tactics_DrillDown_Back_Item_Path_2 = "]";
//                    String Tactics_DrillDown_Back_Item_Path_10 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[";
//                    Tactics_DrillDown_Back_Item_Path_3 = "]/div/div[1]/div/div";
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_1 = String.Concat(Tactics_DrillDown_Back_Item_Path_10, Total_Tactics_DrillDown_Back_Items + 2, Tactics_DrillDown_Back_Item_Path_3);
//                    Tactics_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_3 = String.Concat(Tactics_DrillDown_Back_Item_Path_1, Total_Tactics_DrillDown_Back_Items, Tactics_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3)).click();
//                }
//                else
//                {
//                    Thread.sleep(500);
//                    Total_Tactics_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
//                    Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_1 = String.Concat(Tactics_DrillDown_Back_Item_Path_1, Total_Tactics_DrillDown_Back_Items + 2, Tactics_DrillDown_Back_Item_Path_3);
//                    Tactics_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Tactics_DrillDown_Back_Item_3 = String.Concat(Tactics_DrillDown_Back_Item_Path_1, Total_Tactics_DrillDown_Back_Items + 2, Tactics_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3)).click();
//                }
                
                
            }

            //Thread.sleep(500);
            //List<IWebElement> checkboxes = driver.findElements(By.xpath("//*[@class='row-t-text']")).ToList();
            //Thread.sleep(500);
            //Random rnd = new Random();
            //int Random_Value = rnd.Next(0, checkboxes.Count() - 1);
            //Thread.sleep(1000);

            //if (!checkboxes[Random_Value].Selected)
            //{
            //    Thread.sleep(1000);
            //    Tactics_DrillDown_Item_Name = checkboxes[Random_Value].Text.ToString();
            //    Thread.sleep(1000);
            //    checkboxes[Random_Value].click();
            //    Thread.sleep(1000);

            //    WebDriverWait wait = new WebDriverWait(driver, timeSpan_1);
            //    bool element = wait.Until(ExpectedConditions.InvisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            //    Thread.sleep(1000);
            //}
			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Tactics_Export()
	{
		try
		{
			int Tactics_Export_Path_Count = aca_TMP.getTactics_Export_Path_Count().size();
			
			if(Tactics_Export_Path_Count != 0)
			{
				WebElement export = aca_TMP.getexport();
				export.click();
				Thread.sleep(1000);
				
				WebElement excel = aca_TMP.getexcel();
				excel.click();
				
				WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(aca_TMP.getinvisibilityOfElementLocated4()));
                System.out.println("\n" + "Tactics_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                
                //WebElement exportAgain = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement csv = aca_TMP.getcsv();
				csv.click();
				
                wait.until(ExpectedConditions.invisibilityOfElementLocated(aca_TMP.getinvisibilityOfElementLocated5()));
                System.out.println("\n" + "Tactics_Export : CSV Executed");
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_Export : " + ex.getMessage());
        }		
	}
	
	public void Tactics_Add_Column()
	{
		try 
		{
			int Tactics_Add_Column_Path_Count = aca_TMP.getTactics_Add_Column_Path_Count().size();
			
			if (Tactics_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = aca_TMP.getAdd_Column();
				Add_Column.click();
				Thread.sleep(1000);
				
				int Total_Add_Column_Items = aca_TMP.getTotal_Add_Column_Items().size();
				
				String Add_Column_Item_Path_1 = aca_TMP.getAdd_Column_Item_Path_1().toString();
				String Add_Column_Item_Path_2 = aca_TMP.getAdd_Column_Item_Path_2().toString();
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = aca_TMP.getTotal_Grid_Name_Path_List();
                
                for (int i=0; i< Total_Grid_Name_Path_List.size(); i++ )
                {
                	if(!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name))
                	{                		
                		System.out.println("\n" + "Tactics_Add_Column : Add Column and Grid verify successful");
                		break;
                	}
                }
			}			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_Add_Column : " + ex.getMessage());
        }
	}
	
	
}
*/