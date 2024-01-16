package ACA_Drivers_Module;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

  public class ACA_Drivers_Module_Path 
  {
	 
	static WebDriver driver;
	By Drivers_Filter_Scope_Select_DeSelect = By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]");
	By Drivers_DrillDown = By.xpath("//*[@class='outer']");
	By Total_Drivers_DrillDown_Grid_Items = By.xpath("//*[@class='row-t-text white-sp-nowrap ov-hidden text-ov-ellipsis']");
	By Total_Dimension_Items = By.xpath("//*[@class='btn-small btn-grey mg-b-5 ']");
	By Total_Drivers_DrillDown_Back_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/i");
	By Drivers_Export_Path_Count = By.xpath("//*[@class=' wd-60 btn-group']");
	By export = By.xpath("//*[@class=' wd-60 btn-group']");
	By excel = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]");
	By csv = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]");
	By Drivers_Add_Column_Path_Count = By.xpath("//*[@class='display-inline-block']");
	By Add_Column = By.xpath("//*[@class='display-inline-block']");
	By Total_Add_Column_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div[4]/div/div/div[2]/div/div");
	By Total_Grid_Name_Path_List = By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']");
	
	public ACA_Drivers_Module_Path(WebDriver driver) 
	{
		ACA_Drivers_Module_Path.driver = driver;
    }
    public List<WebElement> getDrivers_Filter_Scope_Select_DeSelect() 
    {
        return driver.findElements(Drivers_Filter_Scope_Select_DeSelect);
    }
    public List<WebElement>  getDrivers_DrillDown ()
    {
        return driver.findElements(Drivers_DrillDown);
    }
    public List<WebElement> getTotal_Drivers_DrillDown_Grid_Items ()
    {
        return driver.findElements(Total_Drivers_DrillDown_Grid_Items );
    }
    public List<WebElement> getTotal_Dimension_Items()
    {
    	return driver.findElements(Total_Dimension_Items);
    }
    public List<WebElement> getTotal_Drivers_DrillDown_Back_Items()
    {
    	return driver.findElements(Total_Drivers_DrillDown_Back_Items);
    }
    public List<WebElement> getDrivers_Export_Path_Count()
    {
    	return driver.findElements(Drivers_Export_Path_Count);
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
    public List<WebElement> getDrivers_Add_Column_Path_Count()
    {
    	return driver.findElements(Drivers_Add_Column_Path_Count);
    }
    public WebElement getAdd_Column ()
    {
    	return driver.findElement(Add_Column);
    }
    public List<WebElement> getTotal_Add_Column_Items ()
    {
    	return driver.findElements(Total_Add_Column_Items );
    }
    public List<WebElement> getTotal_Grid_Name_Path_List()
    {
    	return driver.findElements(Total_Grid_Name_Path_List);
    }    
  }
