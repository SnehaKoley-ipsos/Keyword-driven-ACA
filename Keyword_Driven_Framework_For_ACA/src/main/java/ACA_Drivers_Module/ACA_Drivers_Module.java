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

import ACA_Tactics_Module.ACA_Tactics_Module_Path;

public class ACA_Drivers_Module 
{
	
	static WebDriver driver =  ACA_Web_Driver.ACA_Activate_Get_Driver.getdriver();
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	ACA_Drivers_Module_Path mp = new ACA_Drivers_Module_Path(driver);
	String Drivers_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Drivers_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Drivers_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
	
	//@SuppressWarnings("deprecation")
	public void Drivers_Filter_Scope_Select_DeSelect() throws Throwable
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
		
	public void Drivers_DrillDown() 
	{
		try 
		{
			Thread.sleep(2000);
			List<WebElement> listA  = mp.getDrivers_DrillDown();
			for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("DRIVERS")) 
    			{   
    				System.out.println("\n" + "Module is : " + listA.get(i).getText());
    				listA.get(i).click();
    				//Thread.sleep(1000);
    			}
        	}		    
			WebDriverWait wait_1 = new WebDriverWait(driver, 500);
			wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            //Thread.sleep(500);
			
           // Thread.sleep(200);
            int Total_Drivers_DrillDown_Grid_Items = mp.getTotal_Drivers_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Drivers Module
            
            for (int i = 4; i < Total_Drivers_DrillDown_Grid_Items + 4; i++)
            {
                //Thread.sleep(500);
                String Drivers_DrillDown_Item = (Drivers_DrillDown_Grid_Item_Path_1 + i + Drivers_DrillDown_Grid_Item_Path_2);
                WebElement Drivers_DrillDown_Item_Value = driver.findElement(By.xpath(Drivers_DrillDown_Item));
                String Drivers_DrillDown_Item_Name = Drivers_DrillDown_Item_Value.getText();
                //Thread.sleep(500);
                driver.findElement(By.xpath(Drivers_DrillDown_Item)).click();
                //Thread.sleep(500);
                
                System.out.println("\n" + "Drivers_DrillDown Grid Item : " + Drivers_DrillDown_Item_Name);

                WebDriverWait wait = new WebDriverWait(driver, 500);
                //Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);

                //Take_Snap_Shot(driver);

                //Thread.sleep(500);
                int Total_Dimension_Items = mp.getTotal_Dimension_Items().size();       //Count On Every Dimension from ButtonPanel
                
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
                        
                        System.out.println("\n" + "Drivers_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
               // Thread.sleep(200);
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
                //Thread.sleep(500);

                //WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
                //Boolean element_2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Drivers_DrillDown Back Item : " + Drivers_DrillDown_Back_Item_Name);
                

//                if (Selected_Tab == "DRIVERS")              //Drivers_DrillDown_Back
//                {
//                    Thread.sleep(500);
//                    Total_Drivers_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[";
//                    Drivers_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Drivers_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_1 = String.Concat(Drivers_DrillDown_Back_Item_Path_1, Total_Drivers_DrillDown_Back_Items + 2, Drivers_DrillDown_Back_Item_Path_3);
//                    Drivers_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_3 = String.Concat(Drivers_DrillDown_Back_Item_Path_1, Total_Drivers_DrillDown_Back_Items + 2, Drivers_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_3)).click();
//                }
//                else if (Selected_Tab == "OPTIMIZE")
//                {
//                    Thread.sleep(500);
//                    Total_Drivers_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@class='main-left-panel world-map p-0 ht-47 d-flex']")).Count();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_Path_1 = "//*[@class='main-left-panel world-map p-0 ht-47 d-flex'][";
//                    Drivers_DrillDown_Back_Item_Path_2 = "]";
//                    String Drivers_DrillDown_Back_Item_Path_10 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[";
//                    Drivers_DrillDown_Back_Item_Path_3 = "]/div/div[1]/div/div";
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_1 = String.Concat(Drivers_DrillDown_Back_Item_Path_10, Total_Drivers_DrillDown_Back_Items + 2, Drivers_DrillDown_Back_Item_Path_3);
//                    Drivers_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_3 = String.Concat(Drivers_DrillDown_Back_Item_Path_1, Total_Drivers_DrillDown_Back_Items, Drivers_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_3)).click();
//                }
//                else
//                {
//                    Thread.sleep(500);
//                    Total_Drivers_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
//                    Drivers_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Drivers_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_1 = String.Concat(Drivers_DrillDown_Back_Item_Path_1, Total_Drivers_DrillDown_Back_Items + 2, Drivers_DrillDown_Back_Item_Path_3);
//                    Drivers_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drivers_DrillDown_Back_Item_3 = String.Concat(Drivers_DrillDown_Back_Item_Path_1, Total_Drivers_DrillDown_Back_Items + 2, Drivers_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drivers_DrillDown_Back_Item_3)).click();
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
            //    Drivers_DrillDown_Item_Name = checkboxes[Random_Value].Text.ToString();
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
        	System.out.println("\n" + "Drivers_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Drivers_Export()
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
                System.out.println("\n" + "Drivers_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                
                //WebElement exportAgain = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				//export.click();
				//Thread.sleep(1000);
                
                export.click();
				Thread.sleep(200);
				
				WebElement csv = mp.getcsv();
				csv.click();
				Thread.sleep(1000);
				
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
	
	public void Drivers_Add_Column()
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
