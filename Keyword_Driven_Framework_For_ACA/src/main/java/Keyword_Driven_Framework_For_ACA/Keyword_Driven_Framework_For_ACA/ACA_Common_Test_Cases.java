package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACA_Common_Test_Cases {

	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	public String New_Scenario_Name;
	
	String Drilldown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Drilldown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Drilldown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
	
	
	public void Navigate_To_Tab() throws Throwable
	{
		try 
		{            
//            if (moduleName == "")
//            {
//                int moduleCount = driver.FindElements(By.XPath("//*[@class='outer']")).Count();
//                var Module_Part_1 = "//*[@id='main']/div/div/div/div/div/nav/a[";
//                var Module_Part_2 = "]/div";
//
//                for (int i = 1; i <= moduleCount; i++)
//                {
//                    Thread.Sleep(1000);
//                    var Module = string.Concat(Module_Part_1, i, Module_Part_2);
//                    driver.FindElement(By.XPath(Module)).Click();
//                    Thread.Sleep(500);
//                    WebDriverWait wait_2 = new WebDriverWait(driver, timeSpan_1);
//                    bool element_2 = wait.Until(ExpectedConditions.InvisibilityOfElementLocated(By.XPath("//*[@id='main']/div/div[2]/div[1]/div/div")));
//                    Thread.Sleep(1000);
//
//                    Take_Snap_Shot(driver);
//                    Thread.Sleep(500);
//                }
//            }
//            else
//            {
//                Thread.Sleep(1000);
//                var a = driver.FindElements(By.XPath("//*[@class='header-nav-link']")).ToList();
//                List<IWebElement> c = new List<IWebElement>();
//                a.ForEach(x =>
//                {
//                    c.AddRange(x.FindElements(By.XPath("//*[@class='outer']")).ToList().Where(b => b.Text == moduleName));
//                });
//                if (c.Any())
//                    c.First().Click();
//                Thread.Sleep(500);
//                WebDriverWait wait_1 = new WebDriverWait(driver, timeSpan_1);
//                bool element_1 = wait.Until(ExpectedConditions.InvisibilityOfElementLocated(By.XPath("//*[@id='main']/div/div[2]/div[1]/div/div")));
//                Thread.Sleep(500);
//            }			
			
			if (ACA_Activate_Input_Data.moduleName_2 == "Drivers")
			{
				Thread.sleep(1000);
				List<WebElement> listA  = driver.findElements(By.xpath("//*[@class='outer']"));
				for (int i= 0; i<listA.size(); i++)
	        	{
	    			if(listA.get(i).getText().equalsIgnoreCase(ACA_Activate_Input_Data.moduleName_2)) 
	    			{   
	    				System.out.println("\n" + "Module is : " + listA.get(i).getText());
	    				listA.get(i).click();
	    				Thread.sleep(1000);
	    			}
	        	}
			}			
			WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Navigate_To_Tab : " + ex.getMessage());
		}
	}
	
	public void Filter_Apply_Button() throws Throwable
    {
        try
        {
//            if (FrameworkConstants.moduleName == "OPTIMIZE")
//            {
//            	List<WebElement> listA = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div/div/div"));
//            	for (int i= 0; i<listA.size(); i++)
//            	{
//            		if(listA.get(i).getText().equalsIgnoreCase("Apply")) 
//        			{   
//        				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
//        				listA.get(i).click();
//        			}
//            	}
//            }
//            else
//            {
//            	//
//            }
        	
        	List<WebElement> listA = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div/div"));
        	for (int i= 0; i<listA.size(); i++)
        	{
    			if(listA.get(i).getText().equalsIgnoreCase("Apply")) 
    			{   
    				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
    				listA.get(i).click();
    			}
        	}
            Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[1]/div")));
            Thread.sleep(500);
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Apply_Button : " + ex.getMessage());
        }
    }
	
	public void Filter_Save_Icon()
    {
        try
        {
//        	if (FrameworkConstants.moduleName == "OPTIMIZE")
//            {
//        		driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/i[2]")).click();		//For OPTIMIZE Tab
//            }
//        	else
//            {
//        		driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).click();		//For TACTICS Tab
//            }
        	
        	driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).click();		//For TACTICS & DRIVERS Tab
            Thread.sleep(500);
            WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(500);
            
            System.out.println("\n" + "Filter_Save_Icon : Executed");
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Save_Icon : " + ex.getMessage());
        }
    }
	
	public String Filter_Scope_Typing_New_Name_and_Description()
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
            
            //Filter_Name = New_Scenario_Name;

            System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : " + New_Scenario_Name);
            
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : " + ex.getMessage());
        }
		return New_Scenario_Name;
    }
	
	public void Filter_Scope_Save_And_Delete_This_Scope()
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
        	WebDriverWait wait = new WebDriverWait(driver, 500);
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
            
            driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div[1]/i[1]")).click();		//Click For the Edit button for Others Tab
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

                driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[4]/div[1]")).click();    // Edit PopUp > Close Button
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
	    	WebDriverWait wait_1 = new WebDriverWait(driver, 200);
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
                

//                if (Selected_Tab == "DRIVERS")              //DrillDown_Back
//                {
//                    Thread.sleep(500);
//                    Total_Drilldown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div[";
//                    Drilldown_Back_Item_Path_2 = "]/div/i";
//                    Drilldown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_1 = String.Concat(Drilldown_Back_Item_Path_1, Total_Drilldown_Back_Items + 2, Drilldown_Back_Item_Path_3);
//                    Drilldown_Back_Item_2 = driver.findElement(By.xpath(Drilldown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_3 = String.Concat(Drilldown_Back_Item_Path_1, Total_Drilldown_Back_Items + 2, Drilldown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drilldown_Back_Item_3)).click();
//                }
//                else if (Selected_Tab == "OPTIMIZE")
//                {
//                    Thread.sleep(500);
//                    Total_Drilldown_Back_Items = driver.findElements(By.xpath("//*[@class='main-left-panel world-map p-0 ht-47 d-flex']")).Count();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_Path_1 = "//*[@class='main-left-panel world-map p-0 ht-47 d-flex'][";
//                    Drilldown_Back_Item_Path_2 = "]";
//                    String Drilldown_Back_Item_Path_10 = "//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[";
//                    Drilldown_Back_Item_Path_3 = "]/div/div[1]/div/div";
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_1 = String.Concat(Drilldown_Back_Item_Path_10, Total_Drilldown_Back_Items + 2, Drilldown_Back_Item_Path_3);
//                    Drilldown_Back_Item_2 = driver.findElement(By.xpath(Drilldown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_3 = String.Concat(Drilldown_Back_Item_Path_1, Total_Drilldown_Back_Items, Drilldown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drilldown_Back_Item_3)).click();
//                }
//                else
//                {
//                    Thread.sleep(500);
//                    Total_Drilldown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).Count();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
//                    Drilldown_Back_Item_Path_2 = "]/div/i";
//                    Drilldown_Back_Item_Path_3 = "]/div[1]/div";
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_1 = String.Concat(Drilldown_Back_Item_Path_1, Total_Drilldown_Back_Items + 2, Drilldown_Back_Item_Path_3);
//                    Drilldown_Back_Item_2 = driver.findElement(By.xpath(Drilldown_Back_Item_1)).Text.ToString();
//
//                    Thread.sleep(500);
//                    Drilldown_Back_Item_3 = String.Concat(Drilldown_Back_Item_Path_1, Total_Drilldown_Back_Items + 2, Drilldown_Back_Item_Path_2);
//
//                    //driver.findElement(By.xpath(Drilldown_Back_Item_3)).click();
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
            //    Drilldown_Item_Name = checkboxes[Random_Value].Text.ToString();
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
        	System.out.println("\n" + "DrillDown : " + ex.getMessage());
        }
	}
	
	
	
	
}
