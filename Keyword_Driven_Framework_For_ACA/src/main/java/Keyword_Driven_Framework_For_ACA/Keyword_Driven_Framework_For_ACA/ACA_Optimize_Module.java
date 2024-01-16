package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACA_Optimize_Module {
	
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	String Optimize_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Optimize_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div[1]";
    String Optimize_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
    
    ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();
	
    
    public void Create_A_New_Scenario() throws Throwable
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
    		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
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
            int Total_Optimize_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text']")).size();              //Count On Every Grid Items from Optimize Module
            
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
//			  WebElement a = driver.findElement(By.xpath("//*[@class='selected']"));
//            String b = a.getText();
//            System.out.println("\n" + "Selected Module : " + b);
//            Thread.sleep(5000);
			
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
            driver.findElement(By.xpath("//*[@class='hide-input fs-11']")).clear();
            driver.findElement(By.xpath("//*[@class='hide-input fs-11']")).sendKeys(New_Scenario_Name);		//Typing On New Name
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

            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, 500);
            Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='material-icons rotate running-status ']")));
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
			Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='batchwindow_321']/ul/li[1]/div/div/span[1]")).click();       //Click On Opt Job View Result from notification icon
            Thread.sleep(1000);

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
	
	public void Optimize_Job_Adapt_These_Changes()
	{
		try
		{
			Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='btn-small btn-blue-selected']")).click();       //Click On Opt Job Adapt these changes
            Thread.sleep(1000);

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
	
	
}
