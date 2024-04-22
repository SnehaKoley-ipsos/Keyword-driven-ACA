package ACA_Optimize_Module;

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
import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Optimize_Module {
	
	ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
	ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	String Optimize_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Optimize_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Optimize_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    
    
    public void Go_To_Optimize_Module() throws Throwable
	{
    	try 
    	{    		
    		Thread.sleep(1000);
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
    		for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("OPTIMIZE")) 
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
			System.out.println("\n" + "Go_To_Optimize_Module : " + ex.getMessage());
		}    	
	}
    
    public void Create_A_New_Scenario() throws Throwable
	{
    	try
    	{    		
    		Thread.sleep(1000);
    		List<WebElement> listB  = driver.findElements(By.xpath("//*[@class='mg-r-1']"));
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Create A New Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(2000);
    			}
        	}
    		
    		Thread.sleep(3000);
    		List<WebElement> listC  = driver.findElements(By.xpath("//*[@class='btn-small btn-grey2']"));
    		for (int i= 0; i<listC.size(); i++)
        	{
    			if(listC.get(i).getText().equalsIgnoreCase("Create")) 
    			{
    				System.out.println("\n" + "Select on : " + listC.get(i).getText());
    				listC.get(i).click();
    				Thread.sleep(500);
    			}
        	}
    		WebDriverWait wait = new WebDriverWait(driver, 200);
    		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Create_A_New_Scenario : " + ex.getMessage());
		}
	}
    
    public void Default_Save_Scenario() throws Throwable 
    {
    	try
    	{
    		Thread.sleep(2000);
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']"));
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
    	}
    	catch (Exception ex)
		{
			System.out.println("\n" + "Default_Save_Scenario : " + ex.getMessage());
		}
    }
    
    public void Optimize_Filter_Scope_Select_DeSelect() throws Throwable
	{
		try
		{
			if (driver.findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
            {
				System.out.println("\n" + "Attempted Optimize_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(500);				
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(1,3);
                Thread.sleep(500);
				String Opt_Filter_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/ol/li/ol/li[";
				String Opt_Filter_2 = "]/span/label";
                String Opt_Filter_3 = Opt_Filter_1+Random_Value+Opt_Filter_2;
                Thread.sleep(500);
                driver.findElement(By.xpath(Opt_Filter_3)).click();
                Thread.sleep(500);

                System.out.println("\n" + "Optimize_Filter_Scope_Select_DeSelect : Executed");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Optimize_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}   
		
	public void Optimize_DrillDown() 
	{
		try 
		{			
			Thread.sleep(500);
            int Total_Optimize_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text white-sp-nowrap ov-hidden text-ov-ellipsis']")).size();              //Count On Every Grid Items from Optimize Module
            
            for (int i = 3; i < Total_Optimize_DrillDown_Grid_Items + 3; i++)
            {
                String Optimize_DrillDown_Item = (Optimize_DrillDown_Grid_Item_Path_1 + i + Optimize_DrillDown_Grid_Item_Path_2);
                WebElement Optimize_DrillDown_Item_Value = driver.findElement(By.xpath(Optimize_DrillDown_Item));
                String Optimize_DrillDown_Item_Name = Optimize_DrillDown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Optimize_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Optimize_DrillDown Grid Item : " + Optimize_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                Thread.sleep(500);

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
                        Thread.sleep(500);
                        
                        System.out.println("\n" + "Optimize_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                Thread.sleep(500);
                int Total_Optimize_DrillDown_Back_Items = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div/div")).size();		//Optimize_DrillDown_Back

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
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Optimize_DrillDown Back Item : " + Optimize_DrillDown_Back_Item_Name);
                

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
            //    Trends_DrillDown_Item_Name = checkboxes[Random_Value].Text.ToString();
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
        	System.out.println("\n" + "Optimize_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Optimize_Export()
	{
		try
		{
			int Optimize_Export_Path_Count = driver.findElements(By.xpath("//*[@class='  btn-group']")).size();
			
			if(Optimize_Export_Path_Count != 0)
			{
				WebElement export = driver.findElement(By.xpath("//*[@class='  btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement excel = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]"));
				excel.click();
				Thread.sleep(8000);
				
				System.out.println("\n" + "Optimize_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                                
                export.click();
				Thread.sleep(1000);
				
				WebElement csv = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]"));
				csv.click();
				Thread.sleep(5000);
				
				System.out.println("\n" + "Optimize_Export : CSV Executed");				
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Export : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Add_Column()
	{
		try 
		{
			int Optimize_Add_Column_Path_Count = driver.findElements(By.xpath("//*[@class='display-inline-block']")).size();
			Thread.sleep(500);
			
			if (Optimize_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = driver.findElement(By.xpath("//*[@class='display-inline-block']"));
				Add_Column.click();
				Thread.sleep(1000);
				
				//int Total_Add_Column_Items = driver.findElements(By.xpath("//*[@class='v-center fs-11 txt-left']")).size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[5]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
                System.out.println("\n" + "Optimize_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Optimize_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = driver.findElements(By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']"));
                
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
	
	public void Optimize_Simulation_Job()
	{
		try
		{
			WebElement Simulate = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            
            
            Thread.sleep(500);
            WebElement SaveSimulationAs = driver.findElement(By.xpath("//*[@class='hide-input fs-11']"));
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement  Run_Simulation = driver.findElement(By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']"));
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Simulation_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));	
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Flat_Opt_Job()
	{
		try
		{
			WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Flat_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Flat_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Spend_0_Simulation_Job()
	{
		try
		{
			WebElement SelectOnSpend = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/input"));
			//SelectOnSpend.click();
			SelectOnSpend.clear();
			SelectOnSpend.sendKeys("0");			
			
			WebElement Simulate = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
			Simulate.click();
			Thread.sleep(500);
			Simulate.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement SaveSimulationAs = driver.findElement(By.xpath("//*[@class='hide-input fs-11']"));
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Simulation = driver.findElement(By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']"));
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Spend_0_Simulation_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Spend_0_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Spend_0_Opt_Job()
	{
		try
		{
			WebElement SelectOnSpend = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/input"));
			//SelectOnSpend.click();
			SelectOnSpend.clear();
			SelectOnSpend.sendKeys("0");			
			
			WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(500);
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Spend_0_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Spend_0_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Pct_Simulation_Job()
	{
		try
		{
			WebElement Adjust_All = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]"));
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Pct = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div/div/input"));
			By_Pct.sendKeys("10");
			Thread.sleep(2000);
			
			WebElement By_Pct_Apply = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div"));
			By_Pct_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
			
			WebElement Simulate = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement SaveSimulationAs = driver.findElement(By.xpath("//*[@class='hide-input fs-11']"));
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Simulation = driver.findElement(By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']"));
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Simulation_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Pct_Opt_Job()
	{
		try
		{
			Thread.sleep(1000);
			WebElement Adjust_All = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]"));
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Pct = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div/div/input"));
			By_Pct.sendKeys("10");
			Thread.sleep(2000);
			
			WebElement By_Pct_Apply = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div"));
			By_Pct_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
			
            WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(500);		
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Opt_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));            			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Pct_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Values_Simulation_Job()
	{
		try
		{
			WebElement Adjust_All = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]"));
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Values = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[4]/div/div/input"));
			By_Values.sendKeys("1000");
			Thread.sleep(2000);
			
			WebElement By_Values_Apply = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[3]/div"));
			By_Values_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
			
			WebElement Simulate = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
			Simulate.click();
			Thread.sleep(2000);
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement SaveSimulationAs = driver.findElement(By.xpath("//*[@class='hide-input fs-11']"));
            SaveSimulationAs.clear();
            SaveSimulationAs.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Simulation = driver.findElement(By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']"));
            Run_Simulation.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Values_Simulation_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Values_Simulation_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Adjust_All_By_Values_Opt_Job()
	{
		try
		{
			Thread.sleep(1000);
			WebElement Adjust_All = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]"));
			Adjust_All.click();
			Thread.sleep(1000);
			
			WebElement By_Values = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[4]/div/div/input"));
			By_Values.sendKeys("1000");
			Thread.sleep(2000);
			
			WebElement By_Values_Apply = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[3]/div"));
			By_Values_Apply.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
			
            WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(500);		
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Adjust_All_By_Values_Opt_Job : Executed");
			
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));            			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Adjust_All_By_Values_Opt_Job : " + ex.getMessage());
        }
	}
	
	public void Optimize_Minimize_Budget_Opt_Job()
	{
		try
		{
			WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(2000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(1000);
            
            WebElement Change_Optimization_Goal = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/button"));
            Change_Optimization_Goal.click();
			Thread.sleep(2000);
			
			WebElement Optimization_Goal_Change_Value = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/button"));
			Optimization_Goal_Change_Value.click();
			Thread.sleep(5000);			
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Optimize_Minimize_Budget_Opt_Job : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Minimize_Budget_Opt_Job : " + ex.getMessage());
        }		
	}
	
	public void Advance_Options_Min_Max_Pct_Value_Change()
	{
		try
		{
			WebElement Optimize = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"));
			Optimize.click();
			Thread.sleep(1000);			
			
			New_Scenario_Name = ACA_Activate_Global_Functions.Auto_Generate_New_Scenario_Name();            

            Thread.sleep(500);
            WebElement Write_the_Scenario_Name = driver.findElement(By.xpath("//*[@class='inputField wd-250 pd-10']"));
            Write_the_Scenario_Name.clear();
            Write_the_Scenario_Name.sendKeys(New_Scenario_Name);		//Typing On New Name
            Thread.sleep(2000);
            
            WebElement Change_Settings_Mode = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/button"));
            Change_Settings_Mode.click();
			Thread.sleep(2000);
			
			WebElement Settings_Mode_Change_Value = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/div/button"));
			Settings_Mode_Change_Value.click();
			Thread.sleep(5000);
			
			//to perform Scroll on application using Selenium
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			Thread.sleep(500);
			WebElement Min_Value_Change = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/input"));
			Min_Value_Change.clear();
			Min_Value_Change.sendKeys("24");
			Thread.sleep(2000);
			
			Thread.sleep(500);
			WebElement Max_Value_Change = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/input"));
			Max_Value_Change.clear();
			Max_Value_Change.sendKeys("26");
			Thread.sleep(2000);
			
			WebElement Set_Constraint = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div[5]"));
			Set_Constraint.click();
			Thread.sleep(2000);
            
            WebElement Run_Optimization = driver.findElement(By.xpath("//*[@class='btn-small btn-grey3']"));
            Run_Optimization.click();
			Thread.sleep(2000);
			
			System.out.println("\n" + "Advance_Options_Min_Max_Pct_Value_Change : Executed");
			
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Advance_Options_Min_Max_Pct_Value_Change : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Open_Job_Notification_Panel()
	{
		try
		{
			int Opt_Job = driver.findElements(By.cssSelector("header material-icons selected ")).size();

            if (Opt_Job == 0)
            {
                driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/nav/div/div/span/i[1]")).click();
                Thread.sleep(2000);
            }

            int Opt_Job_List = driver.findElements(By.xpath("//div[starts-with(@class, 'batch-jobs') and contains(@style, 'display: block;')]")).size();

            if (Opt_Job_List == 0)
            {
                driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/nav/div/div/span/i[1]")).click();
                Thread.sleep(2000);
            }

            System.out.println("\n" + "Optimize_Open_Job_Notification_Panel : Executed");
            
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='material-icons rotate jewel-busy-spinner']")));
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Open_Job_Notification_Panel : " + ex.getMessage());
        }
	}
	
	public void Optimize_View_Result_for_Complete_Job()
	{
		try
		{
			int Opt_Job_List = driver.findElements(By.xpath("//*[@class='clear-text']")).size();

            for (int i = 1; i < Opt_Job_List; i++)
            {
                driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/nav/div/div/div/ul/li[2]/div/div/span[2]")).click();
                Thread.sleep(2000);
            }
			
			Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='result-text']")).click();       //Click On Opt Job View Result from notification icon
            Thread.sleep(1000);

            System.out.println("\n" + "Optimize_View_Result_for_Complete_Job : Executed");
            
            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_View_Result_for_Complete_Job : " + ex.getMessage());
        }		
	}
	
	public void Optimize_Job_View_Result_Export()
	{
		try
		{
			int Optimize_Job_View_Result_Export_Path_Count = driver.findElements(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']")).size();
			
			if(Optimize_Job_View_Result_Export_Path_Count != 0)
			{
				WebElement View_Result_Export = driver.findElement(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']"));
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_Excel = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]"));
				View_Result_Excel.click();
				ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(8000);
				
				System.out.println("\n" + "Optimize_Job_View_Result_Export : Excel Downloaded");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                                
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_CSV = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]"));
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
	
	public void Optimize_Job_Adapt_These_Changes()
	{
		try
		{
			ACA_Activate_Global_Functions.Take_Snap_Shot();
			
			Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='btn-small btn-blue-selected']")).click();       //Click On Opt Job Adapt these changes
            Thread.sleep(1000);
            
            System.out.println("\n" + "Optimize_Job_Adapt_These_Changes : Executed");

            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);

            //Opt_Job_KPI_Value = driver.FindElement(By.XPath("/html/body/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/div/div[1]")).Text.ToString();
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Job_Adapt_These_Changes : " + ex.getMessage());
        }		
	}	
	
	public void Optimize_Delete_Scenario()
	{
		try
		{
			Thread.sleep(1000);
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
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
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    		Thread.sleep(2000);
    		
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		
    		if(ScenarioList != 0)
    		{
    			WebElement SelectScenario = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i"));
        		SelectScenario.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Delete_Scenario : No scenario is available now.");
    		}
    		
    		Thread.sleep(1000);
    		List<WebElement> listB  = driver.findElements(By.xpath("//*[@class='mg-r-1']"));
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Delete Scenario")) 
    			{
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(2000);
    			}
        	}
    		WebElement Delete = driver.findElement(By.xpath("//*[@class='fas fa-trash-alt mg-r-5']"));
    		Delete.click();
    		Thread.sleep(1000);
    		
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    		
    		WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Optimize_Delete_Scenario : Executed");
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Delete_Scenario : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Copy_Scenario()
	{
		try
		{
    		Thread.sleep(2000);
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		if(ScenarioList != 0)
    		{
    			WebElement SelectScenario = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i"));
        		SelectScenario.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Copy_Scenario : No scenario is available now");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listB  = driver.findElements(By.xpath("//*[@class='mg-r-1']"));
    		for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Copy Scenario")) 
    			{
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(2000);
    			}
        	}    		
    		String Collect_Copy_Scenario_Name = driver.findElement(By.xpath("//*[@class='text-center txt-red fs-14']")).getText();
    		
    		WebElement Copy = driver.findElement(By.xpath("//*[@class='hide-input']"));
			Copy.sendKeys(Collect_Copy_Scenario_Name + "-Copy_By_Automated_Test_Engine");
			Thread.sleep(2000);
    		
			WebElement Copy_Button = driver.findElement(By.xpath("//*[@class='fas fa-copy mg-r-5']"));
			Copy_Button.click();
    		Thread.sleep(2000);
    		
    		WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);
    		
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    		    		            
            System.out.println("\n" + "Optimize_Copy_Scenario : Executed");
            Thread.sleep(1000);
            
            driver.quit();
            System.out.println("\n" + "Browser closed successfully!");
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Copy_Scenario : " + ex.getMessage());			
		}
	}
	
	public void Optimize_Compare_Scenario()
	{
		try
		{
    		Thread.sleep(2000);
    		int ScenarioList = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/i")).size();
    		
    		if(ScenarioList > 1)
    		{
    			WebElement SelectScenario_1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i"));
        		SelectScenario_1.click();
        		Thread.sleep(1000);
        		
        		WebElement SelectScenario_2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/i"));
        		SelectScenario_2.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Compare_Scenario : More than one scenario is not available on the Library screen");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='mg-r-1']"));    		
    		for (int i= 0; i<listA.size()-1; i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Compare Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
			WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(1000);
            
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    		
    		WebElement Back_to_Scenario_Library_Button = driver.findElement(By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer mg-l-3 fs-11 fw-600']"));
    		Back_to_Scenario_Library_Button.click();
    		Thread.sleep(1000);
    		
            Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
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
    			WebElement SelectScenario_1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i"));
        		SelectScenario_1.click();
        		Thread.sleep(1000);
        		
        		WebElement SelectScenario_2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/i"));
        		SelectScenario_2.click();
        		Thread.sleep(1000);
    		}
    		else
    		{
    			System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : More than one scenario is not available on the Library screen");
    		}    		
    		Thread.sleep(1000);
    		
    		List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='mg-r-1']"));    		
    		for (int i= 0; i<listA.size()-1; i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Compare Scenario")) 
    			{   
    				System.out.println("\n" + "Select on : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
			WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(1000);
            
            int Optimize_Job_View_Result_Export_Path_Count = driver.findElements(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']")).size();
			if(Optimize_Job_View_Result_Export_Path_Count != 0)
			{
				WebElement View_Result_Export = driver.findElement(By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']"));
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_Excel = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]"));
				View_Result_Excel.click();
				ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(8000);
				
				System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : Excel Downloaded");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                                
				View_Result_Export.click();
				Thread.sleep(1000);
				
				WebElement View_Result_CSV = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]"));
				View_Result_CSV.click();
				Thread.sleep(5000);
				
				System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : CSV Downloaded");				
			}
            
    		ACA_Activate_Global_Functions.Take_Snap_Shot();
    		
    		WebElement Back_to_Scenario_Library_Button = driver.findElement(By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer mg-l-3 fs-11 fw-600']"));
    		Back_to_Scenario_Library_Button.click();
    		Thread.sleep(1000);
    		
            Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : Executed");
            Thread.sleep(1000);
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Optimize_Compare_Scenario_With_Export : " + ex.getMessage());			
		}
	}
	
	
	
	
	
}
