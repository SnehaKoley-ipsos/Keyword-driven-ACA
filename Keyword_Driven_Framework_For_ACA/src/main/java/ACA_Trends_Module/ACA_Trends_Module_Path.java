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
	By listB = By.xpath("//*[@id='main']/div/div[3]/div[2]/div/div/div/div/div/div[4]/div[1]/div");  //*[@id='main']/div/div/div/div/div/div/div/div/div/div/div");
	By Total_Trends_DrillDown_Grid_Items = By.xpath("//*[@class='row-t-text']");
	By listC = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div");
	By Total_Dimension_Items = By.xpath("(//div[contains(text(), 'Daily')])[2]");
	By day_Dimension = By.xpath("(//div[@class='btn-small btn-grey '])[2]");
	By Total_Trends_DrillDown_Back_Items = By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']");
	By Trends_Export_Path_Count = By.xpath("//*[@class='  btn-group']");
	By export = By.xpath("//div[@class='btn-small btn-grey']//button[@class='dropdown-item d-flex btn btn-secondary']"); ////*[contains(text(), 'Export')]");//#main > div > div.hydro-body > div.hydro-extension.fit > div > div > div > div > div > div.row.pd-t-5.pd-b-5 > div.col-xl-7.col-lg-7.col-md-7.col-sm-7.col-12.pd-0.text-right > div.btn-small.btn-grey > div > div > button:nth-child(1)");
	By excel = By.xpath("//button[@class='dd-item fs-11 dropdown-item'][text()='Excel']"); ////div[5]/div[2]/div[1]/div/div/button[1]"); //*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]
	By csv = By.xpath("//button[@class='dd-item fs-11 dropdown-item'][text()='CSV']"); ////div[5]/div[2]/div[1]/div/div/button[2]");    //*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]")//(//button)[12]
	By Trends_Add_Column_Path_Count = By.xpath("//*[@class='display-inline-block']");
	By Add_Column = By.xpath("//*[@class='display-inline-block']");
	By Total_Add_Column_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/div[3]/div/div"); // //div[@class='position-absolute bo-c-lighter-grey bck-c-white pd-l-5 pd-r-5 cursor-pointer ht-150 ln-ht-25 ov-auto']

	By Total_Grid_Name_Path_List  = By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']");//div[@class='v-center fs-11 txt-left']/div[@class='white-sp-nowrap ov-hidden text-ov-ellipsis']

	
	
	
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
