package ACA_Common_Test_Cases;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ACA_Global_Functions.ACA_Activate_Global_Functions;
import ACA_Input_Section.ACA_Activate_Input_Data;
import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Common_Test_Cases {

	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	
	public String New_Scenario_Name;
	
	String Drilldown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Drilldown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Drilldown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    String sourcePath="";
    public static String path = System.getProperty("user.dir");
    
    String Selected_Module = driver.findElement(By.xpath("//*[@class='selected']")).getText();
    int PopUpOpen = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
	
		
	public void Filter_Apply_Button(ExtentTest test, String folderName) throws Throwable
    {
        try
        {
        	List<WebElement> listA = driver.findElements(By.xpath("//*[contains(text(), 'Apply ')]"));
        	for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Apply")) 
    			{   
    				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
    				listA.get(i).click();
    			}
        	}
            Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[1]/div")));
            Thread.sleep(500);
            
            //--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			if(listA.size() != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Filter_Apply_Button"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Filter_Apply_Button - Applied Successfully");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Filter_Apply_Button - Applied was not Successfully<br>"+ path);
				//Assert.assertEquals(1, size);
			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Apply_Button : " + ex.getMessage());
        }
    }
	
	
	String Module_Name = "OPTIMIZE";
	
	public void Filter_Save_Icon(ExtentTest test, String folderName)
    {
        try
        {
        	if (Selected_Module.equals(Module_Name))
            {
        		driver.findElement(By.xpath("//*[@class='far fa-save fs-16 mg-l-7 mg-t-7']")).click();		//For OPTIMIZE Tab
            }
        	else
            {
        		driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).click();		//For Others Tab
            }
        	
        	//driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).click();		//For TACTICS & DRIVERS Tab
            Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(500);
            
            System.out.println("\n" + "Filter_Save_Icon : Executed");
            
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			if( driver.findElements(By.xpath("//*[@class='far fa-save fs-16 mg-l-7 mg-t-7']")).size() != 0 )
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Filter_Save_Icon_for_Opt"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Filter_Save_Icon - Clicked on Filter Save Icon");
				test.log(Status.PASS, "<br>"+ path);
			}
			else if( driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).size() != 0 )
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Filter_Save_Icon"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Filter_Save_Icon - Clicked on Filter Save Icon");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Filter_Save_Icon - Filter Save Icon was not Clicked<br>"+ path);
				//Assert.assertEquals(1, size);
			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Save_Icon : " + ex.getMessage());
        }
    }
	
	public String Filter_Scope_Typing_New_Name_and_Description(ExtentTest test, String folderName)
    {
        try
        {
            //Thread.sleep(500);
            New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/input")).sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(500);

            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/textarea")).sendKeys(New_Scenario_Name);		//Typing On Description
            Thread.sleep(500);
            
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
            if( driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/textarea")).size() != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Filter_Scope_Typing_New_Name_and_Description"+".png";
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Filter_Scope_Typing_New_Name_and_Description - New Name and Description writing complete");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Filter_Scope_Typing_New_Name_and_Description - New Name and Description are not complete<br>"+ path);
				//Assert.assertEquals(1, size);
			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : " + New_Scenario_Name);
            
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : " + ex.getMessage());
        }
		return New_Scenario_Name;
    }
	
	public void Filter_Scope_Save_And_Delete_This_Scope(ExtentTest test, String folderName)
    {
        try
        {
        	List<WebElement> listA = driver.findElements(By.xpath("/html/body/div[4]/div/div/div/div/div/div[3]/div"));
        	for (int i= 0; i<listA.size(); i++) {
        		
    			if(listA.get(i).getText().equalsIgnoreCase("Save"))
    			{   
    				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
    				listA.get(i).click();
    			}
        	}
        	//Thread.sleep(500);
        	WebDriverWait wait = new WebDriverWait(driver, 100);
        	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            //Thread.sleep(500);
            
//            if (FrameworkConstants.moduleName == "OPTIMIZE")
//            {
//            	driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div[1]/i[1]")).click();	//Click For the Edit button for OPTIMIZE Tab
//            }
//            else
//            {
//            	driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div[1]/i[1]")).click();		//Click For the Edit button fFor Others Tab
//            }
            
            //driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div[1]/i[1]")).click();		//Click For the Edit button for Others Tab
        	driver.findElement(By.xpath("//*[@class='fas fa-edit fs-14 mg-l-7 mg-t-7']")).click();			//Click For the Edit button for all Module
        	Thread.sleep(500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            //Thread.sleep(500);

            //New_Scenario_Name = Filter_Scope_Typing_New_Name_and_Description();

            List<WebElement> listB = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div[3]/div[1]/div"));
            
            if (listB.size() != 0)
            {
            	for (int i= 0; i<listB.size(); i++)
            	{
            		if(listB.get(i).getText().equalsIgnoreCase(New_Scenario_Name))
        			{   
        				System.out.println("\n" + "Filter_Save_Button : " + listB.get(i).getText());
        				listB.get(i).click();
        				//Thread.sleep(500);
        			}
            	}
            	
            	List<WebElement> listC = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div/div"));
            	for (int i= 0; i<listC.size(); i++)
            	{	
        			if(listC.get(i).getText().equalsIgnoreCase("Delete"))
        			{
        				System.out.println("\n" + "Filter_Save_Popup : " + listC.get(i).getText());
        				listC.get(i).click();
        				//Thread.sleep(500);
        			}
            	}
            	//Thread.sleep(500);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);                
                
//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                if( driver.findElements(By.xpath("//*[@class='fas fa-times mg-r-5']")).size() != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Filter_Scope_Save_And_Delete_This_Scope"+".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Filter_Scope_Save_And_Delete_This_Scope - Created Filter Deleted Successfully");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Filter_Scope_Save_And_Delete_This_Scope - Created Filter is not Deleted<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
               
                
                //driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[4]/div[1]")).click();    // Edit PopUp > Close Button
                driver.findElement(By.xpath("//*[@class='fas fa-times mg-r-5']")).click();    // Edit PopUp > Close Button
                Thread.sleep(500);
                
                System.out.println("\n" + "Filter_Save_Popup : Delete and Close");
            }
            else
            {
            	System.out.println("\n" + "Filter_Scope_Save_And_Delete_This_Scope : No such element");
            }
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Scope_Save_And_Delete_This_Scope : " + ex.getMessage());
        }
    }
	
	public String Scenario_New_Name_Typing()
    {
        try
        {
            //Thread.sleep(500);
            New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(2000);
            
            //Filter_Name = New_Scenario_Name;

            System.out.println("\n" + "Scenario_New_Name_Typing : " + New_Scenario_Name);
            
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Scenario_New_Name_Typing : " + ex.getMessage());
        }
		return New_Scenario_Name;
    }
	
	public void New_Scenario_Save()
	{
		try
		{
			Thread.sleep(2000);
			List<WebElement> listA = driver.findElements(By.xpath("//*[@class='btn-small btn-grey2']"));
	    	for (int i= 0; i<listA.size(); i++) {
	    		
				if(listA.get(i).getText().equalsIgnoreCase("Save As")) 
				{   
					System.out.println("\n" + "New_Scenario_Save : " + listA.get(i).getText());
					listA.get(i).click();
					Thread.sleep(2000);
				}
	    	}
	    	WebDriverWait wait_1 = new WebDriverWait(driver, 100);
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "New_Scenario_Save : " + ex.getMessage());
        }
	}
		
	public void DrillDown() 
	{
		try 
		{
            Thread.sleep(500);
            int Total_Tactics_Drilldown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text']")).size();              //Count On Every Grid Items from Tactics Module
            int Total_Drivers_Drilldown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text white-sp-nowrap ov-hidden text-ov-ellipsis']")).size();              //Count On Every Grid Items from Drivers Module
            //String Drilldown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
            //String Drilldown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
            //Thread.sleep(500);

            for (int i = 3; i < Total_Tactics_Drilldown_Grid_Items + 3; i++)
            {
                //Thread.sleep(500);
                String Drilldown_Item = (Drilldown_Grid_Item_Path_1 + i + Drilldown_Grid_Item_Path_2);
                WebElement Drilldown_Item_Value = driver.findElement(By.xpath(Drilldown_Item));
                String Drilldown_Item_Name = Drilldown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Drilldown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "DrillDown Grid Item : " + Drilldown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);

                //Take_Snap_Shot(driver);

                //Thread.sleep(500);
                int Total_Dimension_Items = driver.findElements(By.xpath("//*[@class='btn-small btn-grey mg-b-5 ']")).size();       //Count On Every Dimension from ButtonPanel
                
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
                        //Thread.sleep(500);
                        driver.findElement(By.xpath(CountValue_3)).click();
                        //Thread.sleep(500);
                        
                        System.out.println("\n" + "DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                Thread.sleep(500);
                int Total_Drilldown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).size();		//DrillDown_Back

                //Thread.sleep(500);
                String Drilldown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Drilldown_Back_Item_Path_2 = "]/div/i";
                String Drilldown_Back_Item_Path_3 = "]/div[1]/div";

                //Thread.sleep(500);
                String Drilldown_Back_Item_1 = (Drilldown_Back_Item_Path_1 + (Total_Drilldown_Back_Items + 2) + Drilldown_Back_Item_Path_3);
                WebElement Drilldown_Back_Item_Value = driver.findElement(By.xpath(Drilldown_Back_Item_1));
                String Drilldown_Back_Item_Name = Drilldown_Back_Item_Value.getText();
                //Thread.sleep(500);
                
                String Drilldown_Back_Item_3 = (Drilldown_Back_Item_Path_1 + (Total_Drilldown_Back_Items + 2) + Drilldown_Back_Item_Path_2);
                
                //Thread.sleep(500);
                driver.findElement(By.xpath(Drilldown_Back_Item_3)).click();
                //Thread.sleep(500);

                //WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "DrillDown Back Item : " + Drilldown_Back_Item_Name);
                                
            }			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "DrillDown : " + ex.getMessage());
        }
	}
	
	public void Thresholds(ExtentTest test, String folderName) throws Throwable
	{
		try
		{
			Thread.sleep(2000);
			int Thresholds_Path_Count = driver.findElements(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']")).size();
			Thread.sleep(500);
			
			if (Thresholds_Path_Count != 0)
			{
				WebElement Thresholds = driver.findElement(By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']"));
				Thresholds.click();
				Thread.sleep(3000);
				
				System.out.println("\n" + "Thresholds : PopUp is Open");
				
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
				
				if(PopUpOpen != 0)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Thresholds"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Thresholds - Clicked on Set All Button");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					test.fail("Thresholds <br>"+ path);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Thresholds : Clicked on Set All Button");
				
				WebElement Thresholds_Apply = driver.findElement(By.xpath("//*[@class='fas fa-check mg-r-5']"));
				Thresholds_Apply.click();
				Thread.sleep(2000);
				
				
				//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	    		Thread.sleep(2000);
	    		
				if(PopUpOpen != 0)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Tactics_Thresholds_Applied"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Thresholds - Thresholds is Applied");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
					test.fail("Thresholds - Thresholds is not Applied<br>"+ path1);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
								
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Thresholds : Clicked on Apply Button");
			}
            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Thresholds : " + ex.getMessage());
        }		
	}
}
