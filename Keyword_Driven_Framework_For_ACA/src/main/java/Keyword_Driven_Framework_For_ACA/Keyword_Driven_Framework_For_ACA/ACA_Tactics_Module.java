package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACA_Tactics_Module {
	
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	private Object String;
	
	String Tactics_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Tactics_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Tactics_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";
	
	public void Tactics_Filter_Scope_Select_DeSelect() throws Throwable
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
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}	
	
	public void KPI_and_Grid_Data_Verify()
	{
		try
		{            
			//------------------------------Total KPI & Grid 1---------------------------------//
			
			String Total_KPI_Name_1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div[1]")).getAttribute("title");
			double Total_KPI_Value_1 = Double.parseDouble(driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div[2]")).getAttribute("title").replaceAll("[^\\d.]", ""));
			
			System.out.println("\n" + "KPI Name : " + Total_KPI_Name_1 + "; Value" + " = " + Total_KPI_Value_1);
			
//			String[] suffix_1 = new String[]{"K","M","B","T"};
//            int size_1 = (Total_KPI_Value_1 != 0) ? (int) Math.log10(Total_KPI_Value_1) : 0;
//            if (size_1 >= 3){
//                while (size_1 % 3 != 0) {
//                    size_1 = size_1 - 1;
//                }
//            }
//            double notation_1 = Math.pow(10, size_1);
//            String result_1 = (size_1 >= 3) ? + (Math.round((Total_KPI_Value_1 / notation_1) * 100) / 100.0d)+suffix_1[(size_1/3) - 1] : + Total_KPI_Value_1 + "";
//			
//            System.out.println("\n" + "Result_1 : " + result_1);
			
						
            List<WebElement> Grid_List_1 = driver.findElements(By.xpath("//*[@id='worldmap']/div/div/div/div/div[2]/div[2]/div[1]"));
            double Sum_Of_Grid_1 = 0;
            for (int i=0; i < Grid_List_1.size(); i++ )
            {
            	double Grid_Value_1 = Double.parseDouble(Grid_List_1.get(i).getAttribute("title").replaceAll("[^\\d.]", ""));
            	Sum_Of_Grid_1 += Grid_Value_1;
            }
            
            System.out.println("\n" + "Grid Name : " + Total_KPI_Name_1 + "; Total Value : " + Sum_Of_Grid_1);
            
            
            
            String[] suffix_2 = new String[]{"K","M","B","T"};
            int size_2 = (Sum_Of_Grid_1 != 0) ? (int) Math.log10(Sum_Of_Grid_1) : 0;
            if (size_2 >= 3){
                while (size_2 % 3 != 0) {
                    size_2 = size_2 - 1;
                }
            }
//            double notation_2 = Math.pow(10, size_2);
//            String result_2 = (size_2 >= 3) ? + (Math.round((Sum_Of_Grid_1 / notation_2) * 100) / 100.0d)+suffix_2[(size_2 / 3) - 1] : + Sum_Of_Grid_1 + "";
//            
//            System.out.println("\n" + "Result_2 : " + result_2);
            
            double difference_1 = (Total_KPI_Value_1 - Sum_Of_Grid_1);
            
            if(Total_KPI_Value_1 == Sum_Of_Grid_1)
            {
            	System.out.println("\n" + "The KPI value are matched to the Grid Total values");
            }
            else
            {
            	System.out.println("\n" + "The difference between the KPI values and the total Grid values = " + difference_1);
            }
            
          //------------------------------Total KPI & Grid 2---------------------------------//
            
            String Total_KPI_Name_2 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[1]")).getAttribute("title");
			double Total_KPI_Value_2 = Double.parseDouble(driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[2]")).getAttribute("title").replaceAll("[^\\d.]", ""));
			
			System.out.println("\n" + "KPI Name : " + Total_KPI_Name_2 + "; Value" + " = " + Total_KPI_Value_2);
			
//			String[] suffix_3 = new String[]{"K","M","B","T"};
//            int size_3 = (Total_KPI_Value_2 != 0) ? (int) Math.log10(Total_KPI_Value_2) : 0;
//            if (size_3 >= 3){
//                while (size_3 % 3 != 0) {
//                    size_3 = size_3 - 1;
//                }
//            }
//            double notation_3 = Math.pow(10, size_3);
//            String result_3 = (size_3 >= 3) ? + (Math.round((Total_KPI_Value_2 / notation_3) * 100) / 100.0d)+suffix_3[(size_3 / 3) - 1] : + Total_KPI_Value_2 + "";
//			
//            System.out.println("\n" + "Result_3 : " + result_3);
			
            List<WebElement> Grid_List_2 = driver.findElements(By.xpath("//*[@id='worldmap']/div/div/div/div/div[3]/div[2]/div[1]"));
            double Sum_Of_Grid_2 = 0;
            for (int i=0; i < Grid_List_2.size(); i++ )
            {
            	double Grid_Value_2 = Double.parseDouble(Grid_List_2.get(i).getAttribute("title").replaceAll("[^\\d.]", ""));
            	Sum_Of_Grid_2 += Grid_Value_2;
            }
            
            System.out.println("\n" + "Grid Name : " + Total_KPI_Name_2 + "; Total Value : " + Sum_Of_Grid_2);
            
//            String[] suffix_4 = new String[]{"K","M","B","T"};
//            int size_4 = (Sum_Of_Grid_2 != 0) ? (int) Math.log10(Sum_Of_Grid_2) : 0;
//            if (size_4 >= 3){
//                while (size_4 % 3 != 0) {
//                    size_4 = size_4 - 1;
//                }
//            }
//            double notation_4 = Math.pow(10, size_4);
//            String result_4 = (size_3 >= 3) ? + (Math.round((Sum_Of_Grid_2 / notation_4) * 100) / 100.0d)+suffix_4[(size_4 / 3) - 1] : + Sum_Of_Grid_2 + "";
//			
//            System.out.println("\n" + "Result_4 : " + result_4);
                        
            double difference_2 = (Total_KPI_Value_2 - Sum_Of_Grid_2);
            
            if(Total_KPI_Value_2 == Sum_Of_Grid_2)
            {
            	System.out.println("\n" + "The KPI value are matched to the Grid Total values");
            }
            else
            {
            	System.out.println("\n" + "The difference between the KPI values and the total Grid values = " + difference_2);
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
            int Total_Tactics_DrillDown_Grid_Items = driver.findElements(By.xpath("//*[@class='row-t-text']")).size();              //Count On Every Grid Items from Tactics Module
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
                        
                        System.out.println("\n" + "Tactics_DrillDown Dimension Item : " + Dimension_Item_Name);

                        //WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                Thread.sleep(500);
                int Total_Tactics_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).size();		//Tactics_DrillDown_Back

                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";

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
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
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
			int Tactics_Export_Path_Count = driver.findElements(By.xpath("//*[@class=' wd-60 btn-group']")).size();
			
			if(Tactics_Export_Path_Count != 0)
			{
				WebElement export = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement excel = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]"));
				excel.click();
				
				WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                System.out.println("\n" + "Tactics_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                
                //WebElement exportAgain = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement csv = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]"));
				csv.click();
				
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
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
			int Tactics_Add_Column_Path_Count = driver.findElements(By.xpath("//*[@class='display-inline-block']")).size();
			
			if (Tactics_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = driver.findElement(By.xpath("//*[@class='display-inline-block']"));
				Add_Column.click();
				Thread.sleep(1000);
				
				int Total_Add_Column_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div/div[2]/div/div")).size();
				
				String Add_Column_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div/div[2]/div/div[";
				String Add_Column_Item_Path_2 = "]";
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = driver.findElements(By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']"));
                
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
