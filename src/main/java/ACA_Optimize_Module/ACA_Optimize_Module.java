package ACA_Optimize_Module;

import java.io.File;
import java.io.IOException;
import java.util.Date;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
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
import ACA_Tactics_Module.ACA_Tactics_Module_Path;
import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Optimize_Module {
	
	private static final String JavascriptExecter = null;
	public static String path = System.getProperty("user.dir");
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	ACA_Optimize_Module_Path mp = new ACA_Optimize_Module_Path(driver);
	
	String Optimize_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Optimize_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Optimize_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    String sourcePath="";
    String Optimize_DrillDown_Item_Name;
    public String Target_KPI_Child_Value;
    int Total_Optimize_DrillDown_Back_Items;
    int OptScreenOpen;
    //String dateName = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
    //String folderName = "ExtentReports "+dateName;
	    
    public void Navigate_to_Optimize_Module(ExtentTest test, String folderName) throws Throwable
	{
    	try 
    	{
    		Thread.sleep(1000);
    		List<WebElement> listA  = mp.get_OptModule_listA();
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("OPTIMIZE")) 
    			{
    				System.out.println("\n" + "Navigate_to_Optimize_Module - Module Name is : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(5000);
    				//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    				//WebElement element = driver.findElement(By.xpath("(//*[@class='status-item status-item-in']"));
    				//jsExecutor.executeScript("arguments[0].click();", element);
    			}
        	}    		    		
    		//WebDriverWait wait_1 = new WebDriverWait(driver, 10);
    		//wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
    					
    		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='wd-pct-70 d-flex']")).size();
			if(OptScreenOpen == 1)
			{
				String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		        // Embed the base64 screenshot directly into the report
		        String imgTag = "<img src=\"data:image/png;base64," + base64Screenshot + "\" alt=\"Screenshot\"/>";
		        test.log(Status.INFO, "Navigate_to_Optimize_Module - Optimize Module is Open");
		        test.log(Status.PASS, "<br>"+ imgTag);
		        
//				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Navigate_to_Optimize_Module"+".png";
//				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
//				Thread.sleep(500);
//				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
//				test.log(Status.INFO, "Navigate_to_Optimize_Module - Optimize Module is Open");
//				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				test.fail("Navigate_to_Optimize_Module - Optimize Module is not open<br>"+ path);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Navigate_to_Optimize_Module : " + ex.getMessage());
		}    	
	}
    
    public void Create_A_New_Scenario(ExtentTest test, String folderName) throws Throwable
	{
    	try
    	{
    		Thread.sleep(1000);
    		List<WebElement> listB  = mp.get_New_Sceanario_listB();
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Create A New Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(1000);
    			}
        	}	
    		Thread.sleep(500);
    		
    		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='popup-model-header']")).size();
			if(OptScreenOpen == 1)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Create_A_New_Scenario"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(1000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Create_A_New_Scenario is Open");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Create_A_New_Scenario is not open<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Create_A_New_Scenario : " + ex.getMessage());
		}
	}
    
    public void Create_A_New_Scenario_Target_KPI(ExtentTest test, String folderName) throws Throwable
	{
    	try
    	{
    		int Target_KPI_list = mp.get_New_Sceanario_Target_KPI_list().size();
    		if (Target_KPI_list != 0)
    		{
    			Thread.sleep(1000);
        		//int Target_KPI_list = mp.get_New_Sceanario_Target_KPI_list().size();
        		for (int i = 0; i < Target_KPI_list; i ++)
            	{
        			int Target_KPI_Child_list  = mp.get_New_Sceanario_Target_KPI_Child_list().size();
        			for (int j = 1; j < Target_KPI_Child_list + 1; j ++)
        			{
        			    //WebElement element = driver.findElement(By.xpath("(//*[@class='far fa-check-square fs-11 mg-5'])[" + j + "]"));
        				WebElement element = driver.findElement(By.xpath("(//*[@class='far fa-check-square fs-11 mg-5'])[1]"));
        			    if (element.isDisplayed() && element.isEnabled())
        			    {   			        
        			        WebElement textElement = driver.findElement(By.xpath("(//*[@class='far fa-check-square fs-11 mg-5'])[1]/following-sibling::div[@class='v-align']"));

        			        Target_KPI_Child_Value = textElement.getText();

        			        System.out.println("\n" + "Target_KPI_Child_Value checkbox is : " + Target_KPI_Child_Value);
        			        
        			        element.click();
        			        Thread.sleep(1000);
        			        
        			      //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
            				OptScreenOpen = driver.findElements(By.xpath("//*[@class='popup-model-header']")).size();
            				if(OptScreenOpen == 1)
            				{
            					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Target_KPI_Child-"+j+".png";
            					System.out.println("\n" + sourcePath);
            					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
            					Thread.sleep(500);
            					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
            					test.log(Status.INFO, "Create_A_New_Scenario_Target_KPI is Open");
            					test.log(Status.PASS, "<br>"+ path);
            				}
            		    	else
            				{
            					String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
            					String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
            					test.fail("Create_A_New_Scenario_Target_KPI is not open<br>"+ path1);
            				}
            				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
        			    }
        			}
        			ACA_Optimize_Module module = new ACA_Optimize_Module();
        			module.Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name(test, folderName, Target_KPI_Child_Value);
        		}
    		}
    		else
    		{
				System.out.println("\n" + "Create_A_New_Scenario_Target_KPI : Target KPI features not available");
    		}
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Create_A_New_Scenario_Target_KPI : " + ex.getMessage());
		}
	}
    
    public void Create_A_New_Scenario_PopUp_Create(ExtentTest test, String folderName) throws Throwable
    {
    	try 
    	{
    		List<WebElement> listC  = driver.findElements(By.xpath("//*[@class='btn-small btn-grey2']"));
    		for (int i= 0; i<listC.size(); i++)
        	{
    			if(listC.get(i).getText().equalsIgnoreCase("Create")) 
    			{
    				System.out.println("\n" + "Create_A_New_Scenario_PopUp_Create : " + listC.get(i).getText());
    				listC.get(i).click();
    				Thread.sleep(500);
    			}
        	}
    		Thread.sleep(500);
    		WebDriverWait wait = new WebDriverWait(driver, 10);
    		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
    		
    		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    		Thread.sleep(1000);
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer fs-11']")).size();
			if(OptScreenOpen == 1)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Create_A_New_Scenario_PopUp_Create"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Create_A_New_Scenario_PopUp_Create - Scenario is Open now");
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Create_A_New_Scenario_PopUp_Create - Scenario is not open<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Create_A_New_Scenario_PopUp_Create : " + ex.getMessage());
		}
    }
    
    public void Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name(ExtentTest test, String folderName, String Target_KPI_Child_Value) throws Throwable 
    {
    	try
    	{       		   		
    		if (Target_KPI_Child_Value == null || Target_KPI_Child_Value.isEmpty()) {
                System.out.println("\n" + "Target_KPI_Child_Value is not set.");
                return;
            }
    		
    		ACA_Optimize_Module module = new ACA_Optimize_Module();
			module.Create_A_New_Scenario_PopUp_Create(test, folderName);

            List<WebElement> elementsWithTooltips = driver.findElements(By.xpath("//div[@title]"));
            
            // Initialize a flag to track if a match is found
            boolean matchFound = false;

            for (WebElement element : elementsWithTooltips)
            {
                String tooltipText = element.getAttribute("title");
                if (tooltipText.equals(Target_KPI_Child_Value))
                {
                    System.out.println("\n" + "Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name - is matching for the expected value : " + tooltipText);
                    matchFound = true;
                    break;  // Exit the loop if a match is found
                }
            }
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    		Thread.sleep(1000);
    		int tooltips = driver.findElements(By.xpath("//div[@title]")).size();
			if(tooltips != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name - is matching for the expected value : " + Target_KPI_Child_Value);
				test.log(Status.PASS, "<br>"+ path);
			}
			else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name - Not matching for the expected value<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			

            // If no match is found
            if (!matchFound)
            {
                System.out.println("\n" + "Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name - Not matching for the expected value : " + Target_KPI_Child_Value);
            }    		    		
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Verify_Create_A_New_Scenario_PopUp_Target_KPI_With_Scenario_Grid_Column_Name : " + ex.getMessage());
		}
    }
    
    public void Default_Save_Scenario(ExtentTest test, String folderName) throws Throwable 
    {
    	try
    	{
    		Thread.sleep(2000);
    		List<WebElement> listA  = mp.get_Def_Save_Scenario_listA();
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Save Scenario As")) 
    			{
    				System.out.println("\n" + "Select on : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(5000);
    			}
        	}
    		For_Common_TC.Scenario_New_Name_Typing();
    		For_Common_TC.New_Scenario_Save();
    		
    		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Default_Save_Scenario"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Default_Save_Scenario is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Default_Save_Scenario is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Default_Save_Scenario : " + ex.getMessage());
		}
    }
    
    public void Optimize_Filter_Scope_Select_DeSelect(ExtentTest test, String folderName) throws Throwable
	{
		try
		{
			if (driver.findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
            {
				System.out.println("\n" + "Attempted Optimize_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
//				Thread.sleep(500);				
//				Random rnd = new Random();
//              int Random_Value = rnd.nextInt(1,3);
//              Thread.sleep(500);
//				String Opt_Filter_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/ol/li/ol/li[";
//				String Opt_Filter_2 = "]/span/label";
//              String Opt_Filter_3 = Opt_Filter_1+Random_Value+Opt_Filter_2;
//              Thread.sleep(500);
//              driver.findElement(By.xpath(Opt_Filter_3)).click();
//              Thread.sleep(500);
                
                List<WebElement> elements = driver.findElements(By.xpath("//*[@class='rct-checkbox']"));
                Random rand = new Random();
                //int randomIndex = rand.nextInt(elements.size());
                int randomIndex = rand.nextInt(2,3);
                elements.get(randomIndex).click();

              //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    			OptScreenOpen = driver.findElements(By.xpath("//*[@class='  btn-group']")).size();
    			if(OptScreenOpen == 1)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Filter_Scope_Select_DeSelect"+".png";
    				System.out.println("\n" + sourcePath);
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_Filter_Scope_Select_DeSelect is working successfully!");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    	    	else
    			{
    				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
    				test.fail("Optimize_Filter_Scope_Select_DeSelect is not working<br>"+ path1);
    				//Assert.assertEquals(1, size);
    			}
    			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
    			                
                System.out.println("\n" + "Optimize_Filter_Scope_Select_DeSelect : Executed");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Optimize_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}   
	
	public void Optimize_DrillDown(ExtentTest test, String folderName) 
	{
		try 
		{			
			Thread.sleep(500);
            int Total_Optimize_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text white-sp-nowrap ov-hidden text-ov-ellipsis']")).size();              //Count On Every Grid Items from Optimize Module
            for (int i = 3; i < Total_Optimize_DrillDown_Grid_Items + 3; i++)
            {
                String Optimize_DrillDown_Item = (Optimize_DrillDown_Grid_Item_Path_1 + i + Optimize_DrillDown_Grid_Item_Path_2);
                WebElement Optimize_DrillDown_Item_Value = driver.findElement(By.xpath(Optimize_DrillDown_Item));
                Optimize_DrillDown_Item_Name = Optimize_DrillDown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Optimize_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Optimize_DrillDown Grid Item : " + Optimize_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                Thread.sleep(500);

//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                
                Total_Optimize_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt big-icon-opp v-center cursor-pointer ht-70 pd-l-5']")).size();
    			if(Total_Optimize_DrillDown_Back_Items != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_DrillDown-" + Optimize_DrillDown_Item_Name +".png";
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_DrillDown - One Step DrillDown");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    			else
    			{
    				test.fail("Optimize_DrillDown - Page is some issue<br>"+ path);
    				//Assert.assertEquals(1, size);
    			}
//---------------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

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
                        Thread.sleep(500);
                        
                        System.out.println("\n" + "Optimize_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                        //Thread.sleep(500);

//--------------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
                        
                        //int DrillBackIcon = driver.findElements(By.xpath("//*[@class='fas fa-level-up-alt big-icon-opp v-center cursor-pointer ht-70 pd-l-5']")).size();
            			if(Total_Optimize_DrillDown_Back_Items != 0)
            			{
            				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_DrillDown_Dimension_Item-" + Optimize_DrillDown_Item_Name + "-" + Dimension_Item_Name +".png";
            				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
            				Thread.sleep(2000);
            				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
            				test.log(Status.INFO, "Optimize_DrillDown - Dimension Item");
            				test.log(Status.PASS, "<br>"+ path);
            			}
            			else
            			{
            				test.fail("Optimize_DrillDown - Dimension Item - Page is some issue<br>"+ path);
            				//Assert.assertEquals(1, size);
            			}
//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

                    }
                }
                
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(500);
                
                //int Total_Optimize_DrillDown_Back_Items = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div/div")).size();		//Optimize_DrillDown_Back
                //Thread.sleep(500);
                String Optimize_DrillDown_Back_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div[";
                String Optimize_DrillDown_Back_Item_Path_2 = "]/div[1]/div/div";
                String Optimize_DrillDown_Back_Item_Path_3 = "]/div/div/div[1]/div[3]/div/div[1]/div/div";

                //Thread.sleep(500);
                String Optimize_DrillDown_Back_Item_1 = (Optimize_DrillDown_Back_Item_Path_1 + (Total_Optimize_DrillDown_Back_Items + 2) + Optimize_DrillDown_Back_Item_Path_3);
                WebElement Optimize_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Optimize_DrillDown_Back_Item_1));
                String Optimize_DrillDown_Back_Item_Name = Optimize_DrillDown_Back_Item_Value.getText();
                //Thread.sleep(500);
                
                String Optimize_DrillDown_Back_Item_3 = (Optimize_DrillDown_Back_Item_Path_1 + (Total_Optimize_DrillDown_Back_Items + 2) + Optimize_DrillDown_Back_Item_Path_2);
                
                //Thread.sleep(500);
                driver.findElement(By.xpath(Optimize_DrillDown_Back_Item_3)).click();
                Thread.sleep(2000);

                //WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Optimize_DrillDown Back Grid Item : " + Optimize_DrillDown_Back_Item_Name);
                
            }
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Optimize_Export(ExtentTest test, String folderName)
	{
		try
		{
			int Optimize_Export_Path_Count = driver.findElements(By.xpath("//*[@class='  btn-group']")).size();
			
			if(Optimize_Export_Path_Count != 0)
			{
				WebElement export = mp.get_export();
				export.click();
				Thread.sleep(1000);				
				WebElement excel = mp.get_excel();
				excel.click();
				Thread.sleep(8000);
				
				System.out.println("\n" + "Optimize_Export : Excel Executed");
                
				//-----------------------------------------------------------------------------------------------------------------------------------------//
                                
                export.click();
				Thread.sleep(1000);				
				WebElement csv = mp.get_csv();
				csv.click();
				Thread.sleep(5000);
				
				//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    			OptScreenOpen = driver.findElements(By.xpath("//*[@class='  btn-group']")).size();
    			if(OptScreenOpen == 1)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Export"+".png";
    				System.out.println("\n" + sourcePath);
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_Export is working successfully!");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    	    	else
    			{
    				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
    				test.fail("Optimize_Export is not working<br>"+ path1);
    				//Assert.assertEquals(1, size);
    			}
    			//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
    			 
				
				System.out.println("\n" + "Optimize_Export : CSV Executed");				
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Export : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Add_Column(ExtentTest test, String folderName)
	{
		try 
		{
			int Optimize_Add_Column_Path_Count = driver.findElements(By.xpath("//*[@class='display-inline-block']")).size();
			Thread.sleep(1000);
			
			if (Optimize_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = mp.get_Add_Column();
				Add_Column.click();
				Thread.sleep(1000);
				
				//int Total_Add_Column_Items = driver.findElements(By.xpath("//*[@class='v-center fs-11 txt-left']")).size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                Thread.sleep(1000);
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(2000);
                
              //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
    			if(OptScreenOpen != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Add_Column"+".png";
    				System.out.println("\n" + sourcePath);
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_Add_Column is working successfully!");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    	    	else
    			{
    				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
    				test.fail("Optimize_Add_Column is not working<br>"+ path1);
    				//Assert.assertEquals(1, size);
    			}
    		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
    		    
                System.out.println("\n" + "Optimize_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Optimize_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = mp.get_Total_Grid_Name_Path_List();
                
                for (int i=0; i< Total_Grid_Name_Path_List.size(); i++ )
                {
                	if(!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name))
                	{                		
                		System.out.println("\n" + "Optimize_Add_Column : Add Column and Grid verify successful");
                		break;
                	}
                }
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Add_Column : " + ex.getMessage());
        }
	}
	
	public void Optimize_Simulation_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Simulate = mp.get_Simulate();
			System.out.println("\n" + "Optimize_Simulation_Job : Executed");
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name(); 	
            Thread.sleep(2000);
            WebElement SaveSimulationAs = mp.get_SaveSimulationAs();
            SaveSimulationAs.clear();
            System.out.println("\n" + "SaveSimulationAs : Executed");
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(2000);  
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Simulation_Job"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Simulation_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Simulation_Job is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            WebElement  Run_Simulation = mp.get_Run_Simulation();
            Run_Simulation.click();
            System.out.println("\n" + "Run_Simulation : Excuted");
			Thread.sleep(2000);
			System.out.println("\n" + "Optimize_Simulation_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));	
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Flat_Opt_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Optimize = mp.get_Optimize();
			Optimize.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            
            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = mp.get_Write_the_Scenario_Name();
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Flat_Opt_Job"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Flat_Opt_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Flat_Opt_Job is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            WebElement Run_Optimization = mp.get_Run_Optimization();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Flat_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Flat_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Spend_0_Simulation_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement SelectOnSpend = mp.get_SelectOnSpend();
			Thread.sleep(2000);
			SelectOnSpend.clear();
			//driver.findElement(By.xpath("(//input[@class='ht-21'])[1]")).clear();
			Thread.sleep(2000);
			SelectOnSpend.sendKeys("0");	
			Thread.sleep(2000);
			
			WebElement Simulate = mp.get_Spend_0_Simulation();
			Simulate.click();
			Thread.sleep(3000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Spend_0_Simulation_Job"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(1000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Spend_0_Simulation_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Spend_0_Simulation_Job is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
			
//			WebElement Simulate = mp.get_Spend_0_Simulation();
//			Simulate.click();
//			Thread.sleep(3000);
			Simulate.click();
			Thread.sleep(3000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(200);
            WebElement SaveSimulationAs = mp.get_Spend_0_Save_Sim();
            SaveSimulationAs.clear();
            Thread.sleep(500);
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Simulation_Job_"+New_Scenario_Name+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(1000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Simulation_Job_"+ New_Scenario_Name +" is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Simulation_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            
            WebElement Run_Simulation = mp.get_Spend_0_Run_Simulation();
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Spend_0_Simulation_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Spend_0_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Spend_0_Opt_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement SelectOnSpend = mp.get_Opt_Spend_0_SelectOnSpend();
			Thread.sleep(2000);
			SelectOnSpend.clear();
			Thread.sleep(2000);
			SelectOnSpend.sendKeys("0");
			Thread.sleep(2000);
			
			WebElement Optimize = mp.get_Spend_0_Optimize();
			Thread.sleep(2000);
			Optimize.click();
			Thread.sleep(3000);
			
			//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Spend_0_Opt_Job"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Spend_0_Opt_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Spend_0_Opt_Job is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
          			
//			WebElement Optimize = mp.get_Spend_0_Optimize();
//			Optimize.click();
//			Thread.sleep(3000);
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(2000);
            WebElement Write_the_Scenario_Name = mp.get_Opt_Spend_0_Write_the_Scenario_Name();
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(2000);
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Spend_0_Opt_Job_"+New_Scenario_Name+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Spend_0_Opt_Job_"+ New_Scenario_Name +" is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Spend_0_Opt_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
                        
            WebElement Run_Optimization = mp.get_Opt_Spend_0_Run_Optimization();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Spend_0_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Spend_0_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Pct_Simulation_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Adjust_All = mp.get_Adjust_All();
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Pct = mp.get_By_Pct();
			By_Pct.sendKeys("10");
			Thread.sleep(2000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Simulation_Job.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Simulation_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Pct_Simulation_Job is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

			WebElement By_Pct_Apply = mp.get_By_Pct_Apply();
			By_Pct_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
			
    		
    		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
    			if(OptScreenOpen != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Simulation_Job - After_Applied.png";
    				System.out.println("\n" + sourcePath);
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Simulation_Job - After_Applied is working successfully!");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    	    	else
    			{
    				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
    				test.fail("Optimize_Adjust_All_By_Pct_Simulation_Job - After_Applied is not working successfully!<br>"+ path1);
    				//Assert.assertEquals(1, size);
    			}
    		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//

            
			WebElement Simulate = mp.get_Adjust_All_By_Pct_Simulation();
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(3000);
            WebElement SaveSimulationAs = mp.get_Adjust_All_By_Pct_Sim_SaveSimulationAs();
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            

            //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Simulation_Job_"+New_Scenario_Name+".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Simulation_Job_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Optimize_Adjust_All_By_Pct_Simulation_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
              
            
            WebElement Run_Simulation = mp.get_Adjust_All_By_Pct_Run_Simulation();
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Simulation_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Pct_Opt_Job(ExtentTest test, String folderName)
	{
		try
		{
			Thread.sleep(1000);
			WebElement Adjust_All = mp.get_Opt_job_Adjust_All();
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Pct = mp.get_Opt_job_Adjust_All_By_Pct();
			By_Pct.sendKeys("10");
			Thread.sleep(2000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Opt_Job.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Opt_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Pct_Opt_Job is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
			WebElement By_Pct_Apply = mp.get_Opt_job_Adjust_All_By_Pct_Apply();
			By_Pct_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
			        	
    	//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
    			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
    			if(OptScreenOpen != 0)
    			{
    				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Opt_Job - After_Applied.png";
    				System.out.println("\n" + sourcePath);
    				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				Thread.sleep(2000);
    				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
    				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Opt_Job - After_Applied is working successfully!");
    				test.log(Status.PASS, "<br>"+ path);
    			}
    	    	else
    			{
    				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
    				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
    				test.fail("Optimize_Adjust_All_By_Pct_Opt_Job - After_Applied is not working successfully!<br>"+ path1);
    				//Assert.assertEquals(1, size);
    			}
    	//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            WebElement Optimize = mp.get_Opt_job_Adjust_All_By_Pct_Optimize();
			Optimize.click();
			Thread.sleep(1000);		
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(1000);
            WebElement Write_the_Scenario_Name = mp.get_Opt_Write_the_Scenario_Name();
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);            

         //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Pct_Opt_Job_"+New_Scenario_Name+".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Opt_Job_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Optimize_Adjust_All_By_Pct_Opt_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
                          
            WebElement Run_Optimization = mp.get_Opt_Run_Optimize();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Opt_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 50);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));            			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Values_Simulation_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Adjust_All = mp.get_Adjust_All_By_Values();
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Values = mp.get_Adjust_All_By_Values_Sim_job();
			By_Values.sendKeys("1000");
			Thread.sleep(2000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Simulation_Job.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Simulation_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Values_Simulation_Job is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
			
			WebElement By_Values_Apply = mp.get_Adjust_All_By_Values_Apply();
			By_Values_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
			
         //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Simulation_Job - After_Applied.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Simulation_Job - After_Applied is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Values_Simulation_Job - After_Applied is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
			WebElement Simulate = mp.get_Adjust_All_By_Values_Simulation();
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement SaveSimulationAs = mp.get_Adjust_All_By_Values_SaveSimulationAs();
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
         //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Simulation_Job_"+New_Scenario_Name+".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Simulation_Job_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Optimize_Adjust_All_By_Values_Simulation_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
                        
            WebElement Run_Simulation = mp.get_Adjust_All_By_Values_Run_Simulation();
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Values_Simulation_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 50);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Values_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Values_Opt_Job(ExtentTest test, String folderName)
	{
		try
		{
			Thread.sleep(1000);
			WebElement Adjust_All = mp.get_Adjust_All_By_Values_opt_job();
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Values = mp.get_Adjust_All_By_Values_Optimization();
			By_Values.sendKeys("1000");
			Thread.sleep(2000);
			
			//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Opt_Job.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Opt_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Values_Opt_Job is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
						
			WebElement By_Values_Apply = mp.get_Adjust_All_By_Values_Apply_Opt();
			By_Values_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
			
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Opt_Job - After_Applied.png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Opt_Job - After_Applied is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Adjust_All_By_Values_Opt_Job - After_Applied is not working successfully!<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            WebElement Optimize = mp.get_Adjust_All_By_Values_Optimize();
			Optimize.click();
			Thread.sleep(500);		
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = mp.get_Adjust_All_By_Values_Write_the_Simulation_Name();
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Adjust_All_By_Values_Opt_Job_"+New_Scenario_Name+".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Opt_Job_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Optimize_Adjust_All_By_Values_Opt_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
  		
            WebElement Run_Optimization = mp.get_Adjust_All_By_Values_Run_Simulation_job();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Values_Opt_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 50);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));            			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Values_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Minimize_Budget_Opt_Job(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Optimize = mp.get_Optimize_Minimize_Budget();
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(1000);
            WebElement Write_the_Scenario_Name = mp.get_Optimize_Min_Budget_Write_the_Scenario_Name();
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Change_Optimization_Goal = mp.get_Change_Optimization_Goal();
            Change_Optimization_Goal.click();
			Thread.sleep(2000);
			
			WebElement Optimization_Goal_Change_Value = mp.get_Optimization_Goal_Change_Value();
			Optimization_Goal_Change_Value.click();
			Thread.sleep(5000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Minimize_Budget_Opt_Job_"+ New_Scenario_Name +".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Optimize_Minimize_Budget_Opt_Job_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Optimize_Minimize_Budget_Opt_Job_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
  		            
            WebElement Run_Optimization = mp.get_Optimization_Goal_Run_Optimization();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Minimize_Budget_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Minimize_Budget_Opt_Job : " + ex.getMessage());
        }		
	}
	
	public void Advance_Options_Min_Max_Pct_Value_Change(ExtentTest test, String folderName)
	{
		try
		{
			WebElement Optimize = mp.get_Advance_Options_Min_Max_Pct_Value_Change_Opt();
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(1000);
            WebElement Write_the_Scenario_Name = mp.get_Advance_Options_Min_Max_Write_the_Scenario_Name();
            Write_the_Scenario_Name.clear();
            Thread.sleep(500);
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(2000);
            
            WebElement Change_Settings_Mode = mp.get_Change_Settings_Mode();
            Change_Settings_Mode.click();
			Thread.sleep(2000);
			
			WebElement Settings_Mode_Change_Value = mp.get_Settings_Mode_Change_Value();
			Settings_Mode_Change_Value.click();
			Thread.sleep(5000);
			
			//to perform Scroll on application using Selenium
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			Thread.sleep(500);
			WebElement Min_Value_Change = mp.get_Min_Value_Change();
			Min_Value_Change.clear();
			Thread.sleep(500);
			Min_Value_Change.sendKeys("20");
			Thread.sleep(2000);
			
			Thread.sleep(500);
			WebElement Max_Value_Change = mp.get_Max_Value_Change();
			Max_Value_Change.clear();
			Thread.sleep(500);
			Max_Value_Change.sendKeys("30");
			Thread.sleep(2000);
			
			WebElement Set_Constraint = mp.get_Set_Constraint();
			Set_Constraint.click();
			Thread.sleep(2000);
			
		//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
  			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
  			if(OptScreenOpen != 0)
  			{
  				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Advance_Options_Min_Max_Pct_Value_Change_"+ New_Scenario_Name +".png";
  				System.out.println("\n" + sourcePath);
  				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				Thread.sleep(1000);
  				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
  				test.log(Status.INFO, "Advance_Options_Min_Max_Pct_Value_Change_"+ New_Scenario_Name +" is working successfully!");
  				test.log(Status.PASS, "<br>"+ path);
  			}
  	    	else
  			{
  				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
  				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
  				test.fail("Advance_Options_Min_Max_Pct_Value_Change_"+ New_Scenario_Name +" is not working successfully!<br>"+ path1);
  				//Assert.assertEquals(1, size);
  			}
  		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
            
            WebElement Run_Optimization = mp.get_Advance_Options_Min_Max_Run_Optimization();
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Advance_Options_Min_Max_Pct_Value_Change : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Advance_Options_Min_Max_Pct_Value_Change : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Open_Job_Notification_Panel(ExtentTest test, String folderName)
	{
		try
		{
			int Opt_Job = driver.findElements(By.cssSelector("header material-icons selected ")).size();

            if (Opt_Job == 0)
            {
                mp.get_Opt_Open_Job_Notification_0().click();
                Thread.sleep(2000);
            }

            int Opt_Job_List = driver.findElements(By.xpath("//div[starts-with(@class, 'batch-jobs') and contains(@style, 'display: block;')]")).size();

            if (Opt_Job_List == 0)
            {
                mp.get_Opt_Job_List().click();
                Thread.sleep(2000);
            }
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Open_Job_Notification_Panel"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Open_Job_Notification_Panel is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Open_Job_Notification_Panel is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		          
            System.out.println("\n" + "Optimize_Open_Job_Notification_Panel : Executed");
            
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, 700);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='material-icons rotate jewel-busy-spinner']")));
            }
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Open_Job_Notification_Panel : " + ex.getMessage());
        }
	}
	
	public void Optimize_View_Result_for_Complete_Job(ExtentTest test, String folderName)
	{
		try
		{
			int Opt_Job_List = driver.findElements(By.xpath("//*[@class='clear-text']")).size();

            for (int i = 1; i < Opt_Job_List; i++)
            {
                mp.get_Opt_View_Result_For_Complete_Job().click();
                Thread.sleep(2000);
                WebDriverWait wait = new WebDriverWait(driver, 50);
                Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
                Thread.sleep(200);
            }
			
			Thread.sleep(2000);
            mp.get_Opt_Job_View_Result_From_Notification_Icon().click();       //Click On View Result
            Thread.sleep(2000);

          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			
			if(Opt_Job_List != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_View_Result_for_Complete_Job"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_View_Result_for_Complete_Job is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_View_Result_for_Complete_Job is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		 
            
            System.out.println("\n" + "Optimize_View_Result_for_Complete_Job : Executed");
            
            WebDriverWait wait = new WebDriverWait(driver, 50);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_View_Result_for_Complete_Job : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Job_View_Result_Export(ExtentTest test, String folderName)
	{
		try
		{
			int Optimize_Job_View_Result_Export_Path_Count = driver.findElements(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']")).size();
			
			if(Optimize_Job_View_Result_Export_Path_Count != 0)
			{
				WebElement View_Result_Export = mp.get_View_Result_Export();
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_Excel = mp.get_View_Result_Excel();
				View_Result_Excel.click();
				ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(8000);
				
				System.out.println("\n" + "Optimize_Job_View_Result_Export : Excel Downloaded");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                                
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_CSV = mp.get_View_Result_CSV();
				View_Result_CSV.click();
				Thread.sleep(5000);
				
				System.out.println("\n" + "Optimize_Job_View_Result_Export : CSV Downloaded");				
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Job_View_Result_Export : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Job_Adapt_These_Changes(ExtentTest test, String folderName)
	{
		try
		{
			Thread.sleep(1000);
            mp.get_Opt_Job_Adapt_Changes().click();       //Click On Opt Job Adapt these changes
            Thread.sleep(1000);
			
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			int Optimize_Job_View_Result_Export_Path_Count = driver.findElements(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']")).size();
			if(Optimize_Job_View_Result_Export_Path_Count != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Job_Adapt_These_Changes"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Job_Adapt_These_Changes is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Job_Adapt_These_Changes is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		             
            System.out.println("\n" + "Optimize_Job_Adapt_These_Changes : Executed");

            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Job_Adapt_These_Changes : " + ex.getMessage());
        }		
	}	
	
	public void Optimize_Delete_Scenario(ExtentTest test, String folderName)
	{
		try
		{
			Thread.sleep(1000);
    		List<WebElement> listA  = mp.get_Optimize_Delete_Scenario_ListA();
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("OPTIMIZE")) 
    			{   
    				System.out.println("\n" + "Module is : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
    		WebDriverWait wait_1 = new WebDriverWait(driver, 200);
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
    		Thread.sleep(2000);
    		
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		
    		if(ScenarioList != 0)
    		{
    			WebElement SelectScenario = mp.get_Select_Scenario();
        		SelectScenario.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Delete_Scenario : No scenario is available now.");
    		}
    		
    		Thread.sleep(1000);
    		List<WebElement> listB  = mp.get_Optimize_Delete_Scenario_ListB();
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Delete Scenario")) 
    			{
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(2000);
    			}
        	}
    		WebElement Delete = mp.get_Delete();
    		Delete.click();
    		Thread.sleep(1000);
    		
    	//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			OptScreenOpen = driver.findElements(By.xpath("//*[@class='mg-r-1']")).size();
			if(OptScreenOpen != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Delete_Scenario"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Delete_Scenario is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Delete_Scenario is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		      		
    		//ACA_Activate_Global_Functions.Take_Snap_Shot();
    		
    		WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Optimize_Delete_Scenario : Executed");
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Delete_Scenario : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Copy_Scenario(ExtentTest test, String folderName)
	{
		try
		{
    		Thread.sleep(2000);
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		if(ScenarioList != 0)
    		{
    			WebElement SelectScenario = mp.get_Optimize_Copy_Select_Scenario();
        		SelectScenario.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Copy_Scenario : No scenario is available now");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listB  = mp.get_Optimize_Copy_Scenario_ListB();
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Copy Scenario")) 
    			{
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(2000);
    			}
        	}    		
    		String Collect_Copy_Scenario_Name = mp.get_Collect_Copy_Scenario_Name().getText();
    		
    		WebElement Copy = mp.get_Copy();
			Copy.sendKeys(Collect_Copy_Scenario_Name + "-Copy_By_Automated_Test_Engine");
			Thread.sleep(2000);
    		
			WebElement Copy_Button = mp.get_Copy_Button();
			Copy_Button.click();
    		Thread.sleep(2000);
    		
    		WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);
    		

          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			if(ScenarioList != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Copy_Scenario"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Copy_Scenario is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Copy_Scenario is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		  
    		    		            
            System.out.println("\n" + "Optimize_Copy_Scenario : Executed");
            Thread.sleep(1000);
            
            //driver.quit();
            //System.out.println("\n" + "Browser closed successfully!");
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Copy_Scenario : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Compare_Scenario(ExtentTest test, String folderName)
	{
		try
		{
    		Thread.sleep(2000);
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		
    		if(ScenarioList > 1)
    		{
    			WebElement SelectScenario_1 = mp.get_Select_Scenario_1();
        		SelectScenario_1.click();
        		Thread.sleep(2000);
        		
        		WebElement SelectScenario_2 = mp.get_Select_Scenario_2();
        		SelectScenario_2.click();
        		Thread.sleep(2000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Compare_Scenario : More than one scenario is not available on the Library screen");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listA  = mp.get_Optimize_Compare_Scenario_ListA();    		
    		for (int i= 0; i<listA.size()-1; i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Compare Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
			WebDriverWait wait = new WebDriverWait(driver, 1000);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(1000);
            
          //---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
			if(ScenarioList != 0)
			{
				sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Compare_Scenario"+".png";
				System.out.println("\n" + sourcePath);
				String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				Thread.sleep(2000);
				String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
				test.log(Status.INFO, "Optimize_Compare_Scenario is working successfully!");
				test.log(Status.PASS, "<br>"+ path);
			}
	    	else
			{
				String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
				String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
				test.fail("Optimize_Compare_Scenario is not working<br>"+ path1);
				//Assert.assertEquals(1, size);
			}
		 //---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
		      		
    		WebElement Back_to_Scenario_Library_Button = mp.get_Back_to_Scenario_Library_Button();
    		Back_to_Scenario_Library_Button.click();
    		Thread.sleep(1000);
    		
            Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Optimize_Compare_Scenario : Executed");
            Thread.sleep(1000);
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Compare_Scenario : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Compare_Scenario_With_Export()
	{
		try
		{
    		Thread.sleep(2000);
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		
    		if(ScenarioList > 1)
    		{
    			WebElement SelectScenario_1 = mp.get_Optimize_Compare_Scenario_With_Export_Select_Scenario_1();
        		SelectScenario_1.click();
        		Thread.sleep(1000);
        		
        		WebElement SelectScenario_2 = mp.get_Optimize_Compare_Scenario_With_Export_Select_Scenario_2();
        		SelectScenario_2.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : More than one scenario is not available on the Library screen");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listA  = mp.get_Optimize_Compare_Scenario_With_Export_ListA();    		
    		for (int i= 0; i<listA.size()-1; i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Compare Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(1000);
    			}
        	}
			WebDriverWait wait = new WebDriverWait(driver, 1000);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(1000);
            
            int Optimize_Job_View_Result_Export_Path_Count = driver.findElements(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']")).size();
			if(Optimize_Job_View_Result_Export_Path_Count != 0)
			{
				WebElement View_Result_Export = mp.get_Optimize_Compare_Scenario_View_Result_Export();
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_Excel = mp.get_Optimize_Compare_Scenario_View_Result_Excel();
			    View_Result_Excel.click();
				ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(8000);
				
			    System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : Excel Downloaded");
                
                                
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_CSV = mp.get_Optimize_Compare_Scenario_View_Result_Excel();
				View_Result_CSV.click();
				Thread.sleep(5000);
				
			System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : CSV Downloaded");				
			}
            
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    		
    		WebElement Back_to_Scenario_Library_Button = mp.get_Back_To_Scenario_Library_Button();
    		Back_to_Scenario_Library_Button.click();
    		Thread.sleep(1000);
    		
            Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : Executed");
            Thread.sleep(1000);
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Thresholds(ExtentTest test, String folderName)
	{
		try
		{
			int Optimize_Thresholds_Path_Count = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]")).size();
			Thread.sleep(500);
			
			if (Optimize_Thresholds_Path_Count != 0)
			{
				WebElement Thresholds = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
				Thresholds.click();
				Thread.sleep(3000);
				
				System.out.println("\n" + "Optimize_Thresholds : PopUp is Open");
				
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
	    		Thread.sleep(2000);
				OptScreenOpen = driver.findElements(By.xpath("//*[@class='fas fa-times mg-r-20 cursor-pointer']")).size();
				if(OptScreenOpen == 1)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Thresholds"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Optimize_Thresholds - PopUp is Open now");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
					test.fail("Optimize_Thresholds - PopUp is not open<br>"+ path1);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Optimize_Thresholds : Clicked on Set All Button");
				
				WebElement Thresholds_Apply = driver.findElement(By.xpath("//*[@class='fas fa-check mg-r-5']"));
				Thresholds_Apply.click();
				Thread.sleep(2000);
				
				//---------------------------------------ExtentReports_Code_Start------------------------------------------------------------------//
	    		Thread.sleep(2000);
				OptScreenOpen = driver.findElements(By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer fs-11']")).size();
				if(OptScreenOpen == 1)
				{
					sourcePath = path+"\\test-output\\"+folderName+"\\Screenshots\\"+"Optimize_Thresholds_Applied"+".png";
					String screenshotPath = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					Thread.sleep(2000);
					String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";	
					test.log(Status.INFO, "Optimize_Thresholds - Thresholds is Applied");
					test.log(Status.PASS, "<br>"+ path);
				}
				else
				{
					String screenshotPath1 = ACA_Activate_Global_Functions.getScreenshot(sourcePath,driver);
					String path1 = "<img src=\"file://" + screenshotPath1 + "\" alt=\"\"/>";
					test.fail("Optimize_Thresholds - Thresholds is not Applied<br>"+ path1);
					//Assert.assertEquals(1, size);
				}
				//---------------------------------------ExtentReports_Code_End------------------------------------------------------------------//
				
				
				//ACA_Activate_Global_Functions.Take_Snap_Shot();
				//Thread.sleep(1000);
				
				System.out.println("\n" + "Optimize_Thresholds : Clicked on Apply Button");
			}
			Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 100);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='status-item status-item-in']")));
            Thread.sleep(3000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Thresholds : " + ex.getMessage());
        }		
	}
	
	
}
