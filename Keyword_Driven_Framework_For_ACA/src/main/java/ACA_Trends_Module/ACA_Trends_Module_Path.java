package ACA_Trends_Module;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

  public class ACA_Trends_Module_Path 
  {
	 
	static WebDriver driver;
	By Trends_Filter_Scope_Select_DeSelect = By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]");
	By listA = By.xpath("//*[@class='outer']");
	By listB = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div");
	By Total_Trends_DrillDown_Grid_Items = By.xpath("//*[@class='row-t-text']");
	By listC = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div");
	By Total_Dimension_Items = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[5]/div[1]/div[2]");
	By day_Dimension = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[5]/div[1]/div[2]");
	By Total_Trends_DrillDown_Back_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i");
	By Trends_Export_Path_Count = By.xpath("//*[@class='  btn-group']");
	By  export = By.xpath("//*[@class='  btn-group']");
	By excel = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]");
	By csv = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]");
	By Trends_Add_Column_Path_Count = By.xpath("//*[@class='display-inline-block']");
	By Add_Column = By.xpath("//*[@class='display-inline-block']");
	By Total_Add_Column_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div[2]/div/div");
	By Total_Grid_Name_Path_List  = By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']");
	
	
	
	public ACA_Trends_Module_Path(WebDriver driver) 
	{
		ACA_Trends_Module_Path.driver = driver;
    }
    public List<WebElement> getTrends_Filter_Scope_Select_DeSelect() 
    {
        return driver.findElements(Trends_Filter_Scope_Select_DeSelect);
    }
    public List<WebElement> getlistA()
    {
        return driver.findElements(listA );
    }
    public List<WebElement> getlistB()
    {
        return driver.findElements(listB);
    }
    public List<WebElement> getTotal_Trends_DrillDown_Grid_Items()
    {
    	return driver.findElements(Total_Trends_DrillDown_Grid_Items);
    }
    public List<WebElement> getlistC()
    {
    	return driver.findElements(listC);
    }
    public List<WebElement> getTotal_Dimension_Items()
    {
    	return driver.findElements(Total_Dimension_Items );
    }
    public WebElement getday_Dimension()
    {
    	return driver.findElement(day_Dimension);
    }
    public List<WebElement> getTotal_Trends_DrillDown_Back_Items()
    {
    	return driver.findElements(Total_Trends_DrillDown_Back_Items);
    }
    public List<WebElement> getTrends_Export_Path_Count()
    {
    	return driver.findElements(Trends_Export_Path_Count );
    }
    public WebElement getexport()
    {
    	return driver.findElement(export);
    }
    public WebElement getexcel()
    {
    	return driver.findElement(excel);
    }
    public WebElement getcsv()
    {
    	return driver.findElement(csv);
    }
    public List<WebElement> getTrends_Add_Column_Path_Count()
    {
    	return driver.findElements(Trends_Add_Column_Path_Count);
    }
    public WebElement getAdd_Column()
    {
    	return driver.findElement(Add_Column);
    }
    public List<WebElement> getTotal_Add_Column_Items()
    {
    	return driver.findElements(Total_Add_Column_Items);
    }
    public List<WebElement> getTotal_Grid_Name_Path_List()
    {
    	return driver.findElements(Total_Grid_Name_Path_List );
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
