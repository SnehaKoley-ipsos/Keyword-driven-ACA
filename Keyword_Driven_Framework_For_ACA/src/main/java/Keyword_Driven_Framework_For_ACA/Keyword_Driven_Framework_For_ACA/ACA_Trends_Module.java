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

public class ACA_Trends_Module {
	
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	public String New_Scenario_Name;
	public String FilterScopeNewName;
	private Object String;
	
	String Trends_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Trends_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Trends_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
	
	@SuppressWarnings("deprecation")
	public void Trends_Filter_Scope_Select_DeSelect() throws Throwable
	{
		try
		{		
			if (driver.findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
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
		
	public void Trends_DrillDown() 
	{
		try 
		{
			Thread.sleep(1000);
			List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
			for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("TRENDS")) 
    			{   
    				System.out.println("\n" + "Module is : " + listA.get(i).getText());
    				listA.get(i).click();
    				Thread.sleep(500);
    			}
        	}
			WebDriverWait wait_1 = new WebDriverWait(driver, 200);
			wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
			
			
			List<WebElement> listB  = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div"));
			for (int i= 0; i<listB.size(); i++)
        	{
    			if(listB.get(i).getText().equalsIgnoreCase("Month")) 
    			{   
    				System.out.println("\n" + "Select on : " + listB.get(i).getText());
    				listB.get(i).click();
    				Thread.sleep(500);
    				WebDriverWait wait = new WebDriverWait(driver, 200);
    				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
    			}
        	}
			
			Thread.sleep(500);
			int Total_Trends_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text']")).size();              //Count On Every Month Items from Trends Module
            			
            for (int j = 3; j < Total_Trends_DrillDown_Grid_Items + 3; j++)
            {
            	if(j > 3) 
            	{
            		List<WebElement> listC  = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div"));
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

                //Take_Snap_Shot(driver);

                int Total_Dimension_Items = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[5]/div[1]/div[2]")).size();       //Select On Month & Day Dimension
                
                if (Total_Dimension_Items == 1)
                {
                	WebElement day_Dimension = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[5]/div[1]/div[2]"));
                	day_Dimension.click();
                	Thread.sleep(1000);
                    
                    System.out.println("\n" + "Trends_DrillDown Dimension Item : " + day_Dimension.getText());
                    
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                	Thread.sleep(2000);
                }
                
                Thread.sleep(500);
                int Total_Trends_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).size();		//Trends_DrillDown_Back

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
                //Thread.sleep(500);

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //Thread.sleep(500);
                
                System.out.println("\n" + "Trends_DrillDown Back Item : " + Trends_DrillDown_Back_Item_Name);
                

//                if (Selected_Tab == "DRIVERS")              //Trends_DrillDown_Back
//                {
//                    Thread.sleep(500);
//                    Total_Trends_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[";
//                    Trends_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Trends_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_1 = String.Concat(Trends_DrillDown_Back_Item_Path_1, Total_Trends_DrillDown_Back_Items + 2, Trends_DrillDown_Back_Item_Path_3);
//                    Trends_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Trends_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_3 = String.Concat(Trends_DrillDown_Back_Item_Path_1, Total_Trends_DrillDown_Back_Items + 2, Trends_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Trends_DrillDown_Back_Item_3)).click();
//                }
//                else if (Selected_Tab == "OPTIMIZE")
//                {
//                    Thread.sleep(500);
//                    Total_Trends_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@class='main-left-panel world-map p-0 ht-47 d-flex']")).Count();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_Path_1 = "//*[@class='main-left-panel world-map p-0 ht-47 d-flex'][";
//                    Trends_DrillDown_Back_Item_Path_2 = "]";
//                    String Trends_DrillDown_Back_Item_Path_10 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[";
//                    Trends_DrillDown_Back_Item_Path_3 = "]/div/div[1]/div/div";
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_1 = String.Concat(Trends_DrillDown_Back_Item_Path_10, Total_Trends_DrillDown_Back_Items + 2, Trends_DrillDown_Back_Item_Path_3);
//                    Trends_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Trends_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_3 = String.Concat(Trends_DrillDown_Back_Item_Path_1, Total_Trends_DrillDown_Back_Items, Trends_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Trends_DrillDown_Back_Item_3)).click();
//                }
//                else
//                {
//                    Thread.sleep(500);
//                    Total_Trends_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
//                    Trends_DrillDown_Back_Item_Path_2 = "]/div/i";
//                    Trends_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_1 = String.Concat(Trends_DrillDown_Back_Item_Path_1, Total_Trends_DrillDown_Back_Items + 2, Trends_DrillDown_Back_Item_Path_3);
//                    Trends_DrillDown_Back_Item_2 = driver.findElement(By.xpath(Trends_DrillDown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Trends_DrillDown_Back_Item_3 = String.Concat(Trends_DrillDown_Back_Item_Path_1, Total_Trends_DrillDown_Back_Items + 2, Trends_DrillDown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Trends_DrillDown_Back_Item_3)).click();
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
        	System.out.println("\n" + "Trends_DrillDown : " + ex.getMessage());
        }
	}
	
	public void Trends_Export()
	{
		try
		{
			int Trends_Export_Path_Count = driver.findElements(By.xpath("//*[@class='  btn-group']")).size();
			
			if(Trends_Export_Path_Count != 0)
			{
				WebElement export = driver.findElement(By.xpath("//*[@class='  btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement excel = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]"));
				excel.click();
				Thread.sleep(8000);
				
				//WebDriverWait wait = new WebDriverWait(driver, 10);
                //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                System.out.println("\n" + "Trends_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                
                //WebElement exportAgain = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				//export.click();
				//Thread.sleep(1000);
                
                export.click();
				Thread.sleep(1000);
				
				WebElement csv = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]"));
				csv.click();
				Thread.sleep(5000);
				
				System.out.println("\n" + "Trends_Export : CSV Executed");
				
                //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                //System.out.println("\n" + "Trends_Export : CSV Executed");
			}
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Trends_Export : " + ex.getMessage());
        }		
	}
	
	public void Trends_Add_Column()
	{
		try 
		{
//			WebElement a = driver.findElement(By.xpath("//*[@class='selected']"));
//            String b = a.getText();
//            System.out.println("\n" + "Selected Module : " + b);
//            Thread.sleep(5000);			
			
			int Trends_Add_Column_Path_Count = driver.findElements(By.xpath("//*[@class='display-inline-block']")).size();
			Thread.sleep(500);
			
			if (Trends_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = driver.findElement(By.xpath("//*[@class='display-inline-block']"));
				Add_Column.click();
				Thread.sleep(1000);
				
				int Total_Add_Column_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div[2]/div/div")).size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div[2]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
                System.out.println("\n" + "Trends_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Trends_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = driver.findElements(By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']"));
                
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
