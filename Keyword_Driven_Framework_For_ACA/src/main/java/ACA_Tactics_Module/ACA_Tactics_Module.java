package ACA_Tactics_Module;
 
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ACA_Global_Functions.ACA_Activate_Global_Functions;

import org.openqa.selenium.JavascriptExecutor;


public class ACA_Tactics_Module {

    static WebDriver driver = ACA_Web_Driver.ACA_Activate_Get_Driver.getdriver();
    ACA_Activate_Global_Functions ACA_Activate_Global_Functions = new ACA_Activate_Global_Functions();
    private Object String;
    ACA_Tactics_Module_Path mp = new ACA_Tactics_Module_Path(driver);
    
    String Tactics_DrillDown_Grid_Item_Path_1 = "/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[";
    String Tactics_DrillDown_Grid_Item_Path_2 = "]/div/div[1]/div/div";
    String Tactics_DrillDown_Grid_Item_Path_3 = "]/div/div[2]/div[2]/div[1]";

//    String Tactics_DrillDown_Grid_Item_Path_1 = mp.getTactics_DrillDown_Grid_Item_Path_1().toString();
//
//    String Tactics_DrillDown_Grid_Item_Path_2 = mp.getTactics_DrillDown_Grid_Item_Path_2().toString();
//
//    String Tactics_DrillDown_Grid_Item_Path_3 = mp.getTactics_DrillDown_Grid_Item_Path_3().toString();
  
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
   /* public void Tactics_Filter_Scope_Select_DeSelect() throws Throwable {
        try {
            WebElement filterScopeCheckbox = mp.getTactics_Filter_Scope_Select_DeSelect();
     
            if (!filterScopeCheckbox.isDisplayed()) {
                System.out.println("\n" + "Attempted Tactics_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            } else {
                Thread.sleep(500);
                Random rnd = new Random();
                int Random_Value = rnd.nextInt(3);
                Thread.sleep(500);
                String Tactic_Filter_1 = mp.getTactic_Filter_1().toString();
                String Tactic_Filter_2 = mp.getTactic_Filter_2().toString();
                String Tactic_Filter_3 = Tactic_Filter_1 + Random_Value + Tactic_Filter_2;
                Thread.sleep(500);
                driver.findElement(By.xpath(Tactic_Filter_3)).click();
                Thread.sleep(500);
     
                System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : Executed");
            }
        } catch (Exception ex) {
            System.out.println("\n" + "Tactics_Filter_Scope_Select_DeSelect : " + ex.getMessage());
        }
    } */
  	public void Navigate_to_Tactics_Module() throws Throwable
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
  		WebDriverWait wait_1 = new WebDriverWait(driver, 200);
  		wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
  		
  		ACA_Activate_Global_Functions.Take_Snap_Shot();
  	}
  	catch (Exception ex)
		{
			System.out.println("\n" + "Navigate_to_Tactics_Module : " + ex.getMessage());
		}    	
	} 
  
  
    public void KPI_and_Grid_Data_Verify() {

        try {

            String Total_KPI_Name = mp.getTotal_KPI_Name().getAttribute("title");

            double Total_KPI_Value = Double.parseDouble(mp.getTotal_KPI_Value().getAttribute("title").replaceAll("[^\\d.]", ""));

            System.out.println("\n" + "KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value);

            List<WebElement> gridList = mp.getgridList();

            double sum = 0;

            for (int i = 0; i < gridList.size(); i++) {

                double gridSpendValue = Double.parseDouble(gridList.get(i).getAttribute("title").replaceAll("[^\\d.]", ""));

                sum += gridSpendValue;

            }

            System.out.println("\n" + "Total Grid Spend Value : " + sum);

            if (Total_KPI_Value == sum) {

                System.out.println("\n" + "The Total KPI values are matched to the Grid values");

            } else {

                System.out.println("\n" + "The Total KPI values does not match the Grid values");

            }

        } catch (Exception ex) {

            System.out.println("\n" + "Tactics_DrillDown_Data_Verify : " + ex.getMessage());

        }

    }
    
    public void Tactics_DrillDown() 
	{
		try 
		{
            Thread.sleep(500);
            int Total_Tactics_DrillDown_Grid_Items = mp.getTotal_Tactics_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Tactics Module
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
                        
                        System.out.println("\n" + "Tactics_DrillDown Dimension Item : " + Dimension_Item_Name);

                       // WebDriverWait wait = new WebDriverWait(driver, 10000);
                        //Boolean element_1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                        
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                               

                        
                        //Thread.sleep(500);
                

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                 
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(500);
                int Total_Tactics_DrillDown_Back_Items = mp.getTotal_Tactics_DrillDown_Back_Items().size();		//Tactics_DrillDown_Back
                
                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";

                //Thread.sleep(500);

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
                
                //Thread.sleep(500);
                
                System.out.println("\n" + "Tactics_DrillDown Back Item : " + Tactics_DrillDown_Back_Item_Name);    
            }
			
		}
		catch (Exception ex)
        {
        	System.out.println("\n" + "Tactics_DrillDown : " + ex.getMessage());
        }
	}
    /*public void Tactics_DrillDown() {

        try {

            Thread.sleep(500);

            int Total_Tactics_DrillDown_Grid_Items = mp.getTotal_Tactics_DrillDown_Grid_Items().size();
 
            for (int i = 3; i < Total_Tactics_DrillDown_Grid_Items + 3; i++) {

                String Tactics_DrillDown_Item = (Tactics_DrillDown_Grid_Item_Path_1 + i + Tactics_DrillDown_Grid_Item_Path_2);

                WebElement Tactics_DrillDown_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Item));

                String Tactics_DrillDown_Item_Name = Tactics_DrillDown_Item_Value.getText();

                driver.findElement(By.xpath(Tactics_DrillDown_Item)).click();

                System.out.println("\n" + "Tactics_DrillDown Grid Item : " + Tactics_DrillDown_Item_Name);
 
                WebDriverWait wait = new WebDriverWait(driver, 500);

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
 
                int Total_Dimension_Items = mp.getTotal_Dimension_Items().size();

                if (Total_Dimension_Items != 0) {
                	
                	String CountValue_1 = "//*[@class='btn-small btn-grey mg-b-5 '][";
                    String CountValue_2 = "]";

//                    String CountValue_1 = mp.getCountValue_1().toString();
//
//                    String CountValue_2 = mp.getCountValue_2().toString();
// 
                    for (int ii = 1; ii <= Total_Dimension_Items; ii++) {

                        String CountValue_3 = (CountValue_1 + ii + CountValue_2);

                        WebElement Dimension_Item_Value = driver.findElement(By.xpath(CountValue_3));

                        String Dimension_Item_Name = Dimension_Item_Value.getText();

                        driver.findElement(By.xpath(CountValue_3)).click();

                        System.out.println("\n" + "Tactics_DrillDown Dimension Item : " + Dimension_Item_Name);
 
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                    }
                }

                Thread.sleep(500);

                int Total_Tactics_DrillDown_Back_Items = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i")).size();
                
                String Tactics_DrillDown_Back_Item_Path_1 = "//*[@id='main']/div/div/div/div/div/div/div/div/div[";
                String Tactics_DrillDown_Back_Item_Path_2 = "]/div/i";
                String Tactics_DrillDown_Back_Item_Path_3 = "]/div[1]/div";
 
//                String Tactics_DrillDown_Back_Item_Path_1 = mp.getTactics_DrillDown_Back_Item_Path_1().toString();
//
//                String Tactics_DrillDown_Back_Item_Path_2 = mp.getTactics_DrillDown_Back_Item_Path_2().toString();
//
//                String Tactics_DrillDown_Back_Item_Path_3 = mp.getTactics_DrillDown_Back_Item_Path_3().toString();
 
                String Tactics_DrillDown_Back_Item_1 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_3);

                WebElement Tactics_DrillDown_Back_Item_Value = driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_1));

                String Tactics_DrillDown_Back_Item_Name = Tactics_DrillDown_Back_Item_Value.getText();
 
                String Tactics_DrillDown_Back_Item_3 = (Tactics_DrillDown_Back_Item_Path_1 + (Total_Tactics_DrillDown_Back_Items + 2) + Tactics_DrillDown_Back_Item_Path_2);

                driver.findElement(By.xpath(Tactics_DrillDown_Back_Item_3)).click();
                Thread.sleep(500);
                
                System.out.println("\n" + "Tactics_DrillDown Back Item : " + Tactics_DrillDown_Back_Item_Name);
                
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            }

        } catch (Exception ex) {

            System.out.println("\n" + "Tactics_DrillDown : " + ex.getMessage());
        }
    }*/
    
    public void Tactics_Export() {

        try {

            int Tactics_Export_Path_Count = mp.getTactics_Export_Path_Count().size();

            if (Tactics_Export_Path_Count != 0)
            {
                WebElement export = mp.getexport();
                export.click();
                Thread.sleep(1000);


                WebElement excel = mp.getexcel();
                excel.click();
                Thread.sleep(5000);
                WebDriverWait wait = new WebDriverWait(driver, 5);

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                System.out.println("\n" + "Tactics_Export : Excel Executed");

                export.click();
                Thread.sleep(1000);

                WebElement csv = mp.getcsv();
                csv.click();
                Thread.sleep(5000);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
               
                System.out.println("\n" + "Tactics_Export : CSV Executed");
            }

        } catch (Exception ex) {

            System.out.println("\n" + "Tactics_Export : " + ex.getMessage());

        }

    }
    
    public void Tactics_Add_Column() {

        try {

            int Tactics_Add_Column_Path_Count = mp.getTactics_Add_Column_Path_Count().size();

            if (Tactics_Add_Column_Path_Count != 0) {

                WebElement Add_Column = mp.getAdd_Column();

                Add_Column.click();

                Thread.sleep(1000);

                int Total_Add_Column_Items = mp.getTotal_Add_Column_Items().size();
                
                String Add_Column_Item_Path_1 = "//*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[1]/div[5]/div[2]/div/div[3]/div[2]/div[";
				String Add_Column_Item_Path_2 = "]";

//                String Add_Column_Item_Path_1 = mp.getAdd_Column_Item_Path_1().toString();
//
//                String Add_Column_Item_Path_2 = mp.getAdd_Column_Item_Path_2().toString();

                String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);

                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));

                Add_Column_Item_Main_Path.click();

                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();

                Thread.sleep(5000);

                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name_1);

                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();

                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name);

                List<WebElement> Total_Grid_Name_Path_List = mp.getTotal_Grid_Name_Path_List();

                for (int i = 0; i < Total_Grid_Name_Path_List.size(); i++) {

                    if (!Total_Grid_Name_Path_List.get(i).getText().equals(Add_Column_Item_Name)) {

                        System.out.println("\n" + "Tactics_Add_Column : Add Column and Grid verify successful");

                        break;

                    }

                }

            }

        } catch (Exception ex) {

            System.out.println("\n" + "Tactics_Add_Column : " + ex.getMessage());
        }
    }
    
    public void Tactics_Thresholds()
	{
		try
		{
			Thread.sleep(2000);
			int Tactics_Thresholds_Path_Count = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]")).size();
			Thread.sleep(500);
			
			if (Tactics_Thresholds_Path_Count != 0)
			{
				WebElement Thresholds = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"));
				Thresholds.click();
				Thread.sleep(5000);
				
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
				Thread.sleep(5000);
									
				ACA_Activate_Global_Functions.Take_Snap_Shot();
				Thread.sleep(1000);
				
				System.out.println("\n" + "Tactics_Thresholds : Clicked on Set All Button");
				
				WebElement Thresholds_Apply = driver.findElement(By.xpath("//*[@class='fas fa-check mg-r-5']"));
				Thresholds_Apply.click();
				Thread.sleep(3000);
				
				ACA_Activate_Global_Functions.Take_Snap_Shot();
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
	
	ACA_Tactics_Module_Path  mp= new ACA_Tactics_Module_Path (driver);
			
	String Tactics_DrillDown_Grid_Item_Path_1 = mp.getTactics_DrillDown_Grid_Item_Path_1().toString();
    String Tactics_DrillDown_Grid_Item_Path_2 = mp.getTactics_DrillDown_Grid_Item_Path_2().toString();
    String Tactics_DrillDown_Grid_Item_Path_3 = mp.getTactics_DrillDown_Grid_Item_Path_3().toString();
   
	public void Tactics_Filter_Scope_Select_DeSelect() throws Throwable
	{
		try
		{
			if (mp.getTactics_Filter_Scope_Select_DeSelect().size() == 1)
            {
				System.out.println("\n" + "Attempted Tactics_Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(500);				
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(3);
                Thread.sleep(500);
				String Tactic_Filter_1 = mp.getTactic_Filter_1().toString();
				String Tactic_Filter_2 = mp.getTactic_Filter_2().toString();
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
            
			String Total_KPI_Name = mp.getTotal_KPI_Name().getAttribute("title");
			double Total_KPI_Value = Double.parseDouble(mp.getTotal_KPI_Value()).getAttribute("title").replaceAll("[^\\d.]", ""));
			
			System.out.println("\n" + "KPI Name : " + Total_KPI_Name + " = " + Total_KPI_Value);
			
            List<WebElement> gridList = mp.getgridList();
            
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
            int Total_Tactics_DrillDown_Grid_Items = mp.getTotal_Tactics_DrillDown_Grid_Items().size();              //Count On Every Grid Items from Tactics Module
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
                wait.until(ExpectedConditions.invisibilityOfElementLocated(mp.getinvisibilityOfElementLocated1());
                //Thread.sleep(500);

                //Take_Snap_Shot(driver);

                //Thread.sleep(500);
                int Total_Dimension_Items = mp.getTotal_Dimension_Items().size();       //Count On Every Dimension from ButtonPanel
                
                if (Total_Dimension_Items != 0)
                {
                    //Thread.sleep(500);
                    String CountValue_1 = mp.getCountValue_1().toString();
                    String CountValue_2 = mp.getCountValue_2().toString();

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
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(mp.getinvisibilityOfElementLocated2());
                        //Thread.sleep(500);

                        //Take_Snap_Shot(driver);
                        //Thread.sleep(500);
                    }
                }
                
                Thread.sleep(500);
                int Total_Tactics_DrillDown_Back_Items = mp.getTotal_Tactics_DrillDown_Back_Items.size();		//Tactics_DrillDown_Back

                //Thread.sleep(500);
                String Tactics_DrillDown_Back_Item_Path_1 = mp.getTactics_DrillDown_Back_Item_Path_1().toString();
                String Tactics_DrillDown_Back_Item_Path_2 = mp.getTactics_DrillDown_Back_Item_Path_2().toString();
                String Tactics_DrillDown_Back_Item_Path_3 = mp.getTactics_DrillDown_Back_Item_Path_3().toString();

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
                wait.until(ExpectedConditions.invisibilityOfElementLocated(mp.getinvisibilityOfElementLocated3()));
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
			int Tactics_Export_Path_Count = mp.getTactics_Export_Path_Count().size();
			
			if(Tactics_Export_Path_Count != 0)
			{
				WebElement export = mp.getexport();
				export.click();
				Thread.sleep(1000);
				
				WebElement excel = mp.getexcel();
				excel.click();
				
				WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(mp.getinvisibilityOfElementLocated4()));
                System.out.println("\n" + "Tactics_Export : Excel Executed");
                
         //-----------------------------------------------------------------------------------------------------------------------------------------//
                
                //WebElement exportAgain = driver.findElement(By.xpath("//*[@class=' wd-60 btn-group']"));
				export.click();
				Thread.sleep(1000);
				
				WebElement csv = mp.getcsv();
				csv.click();
				
                wait.until(ExpectedConditions.invisibilityOfElementLocated(mp.getinvisibilityOfElementLocated5()));
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
			int Tactics_Add_Column_Path_Count = mp.getTactics_Add_Column_Path_Count().size();
			
			if (Tactics_Add_Column_Path_Count != 0)
			{
				WebElement Add_Column = mp.getAdd_Column();
				Add_Column.click();
				Thread.sleep(1000);
				
				int Total_Add_Column_Items = mp.getTotal_Add_Column_Items().size();
				
				String Add_Column_Item_Path_1 = mp.getAdd_Column_Item_Path_1().toString();
				String Add_Column_Item_Path_2 = mp.getAdd_Column_Item_Path_2().toString();
				
				String Add_Column_Item_Path = (Add_Column_Item_Path_1 + 1 + Add_Column_Item_Path_2);
                WebElement Add_Column_Item_Main_Path = driver.findElement(By.xpath(Add_Column_Item_Path));
                Add_Column_Item_Main_Path.click();
                String Add_Column_Item_Name_1 = Add_Column_Item_Main_Path.getText();
                Thread.sleep(5000);
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name_1);
                
                String Add_Column_Item_Name = Add_Column_Item_Name_1.toUpperCase();
                
                System.out.println("\n" + "Tactics_Add_Column : " + Add_Column_Item_Name);
                
                List<WebElement> Total_Grid_Name_Path_List = mp.getTotal_Grid_Name_Path_List();
                
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