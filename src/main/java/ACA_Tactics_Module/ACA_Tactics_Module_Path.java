package ACA_Tactics_Module;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

  public class ACA_Tactics_Module_Path 
  {
	 
	static WebDriver driver;
//	By Tactics_DrillDown_Grid_Item_Path_1 = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[");
//  By Tactics_DrillDown_Grid_Item_Path_2 = By.xpath("]/div/div[1]/div/div");
//  By Tactics_DrillDown_Grid_Item_Path_3 = By.xpath("]/div/div[2]/div[2]/div[1]");
    By Tactics_Filter_Scope_Select_DeSelect = By.xpath("//*[@id='rct-3F_bptMTnNbSoGroxmSsY']/ol/li/span/label/span[1]/i");  //.size() == 1	
//  By Tactic_Filter_1 = By.xpath("/html/body/div/div/div/div/div/div/div[4]/div/div/div/ol/li/ol/li[");
//	By Tactic_Filter_2 = By.xpath("]/span/label/span/i");
    By Version_Name = By.xpath("//*[@id='appversion']");
	By Total_KPI_Name = By.xpath("//div[@class='fs-10 pd-r-5 pd-b-5 white-sp-nowrap' and @title='Spend']");
	By Total_KPI_Value = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div[2]");
	By gridList = By.xpath("//*[@id='worldmap']/div/div/div/div/div[2]/div[2]/div[1]");
	By Total_Tactics_DrillDown_Grid_Items = By.xpath("//*[@class='row-t-text white-sp-nowrap ov-hidden text-ov-ellipsis']");
//	By invisibilityOfElementLocated = By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div");
	By Total_Dimension_Items = By.xpath("//*[@class='btn-small btn-grey mg-b-5 ']");
	By DrillBackIcon = By.xpath("//*[@class='fas fa-level-up-alt fs-17 mg-r-10']");
//	By CountValue_1 = By.xpath("//*[@class='btn-small btn-grey mg-b-5 '][");
//  By CountValue_2 = By.xpath("]");
//  By invisibilityOfElementLocated2 = By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div");
    By Total_Tactics_DrillDown_Back_Items = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div/div/i");
//  By Tactics_DrillDown_Back_Item_Path_1 = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[");
//  By Tactics_DrillDown_Back_Item_Path_2 = By.xpath("]/div/i");
//  By Tactics_DrillDown_Back_Item_Path_3 = By.xpath("]/div[1]/div");
//  By invisibilityOfElementLocated3 = By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div");
    By Tactics_Export_Path_Count = By.xpath("//*[@class=' wd-60 btn-group']");
    By export = By.xpath("//div[text()='Export']"); ////button[@class='dd-item fs-11 dropdown-item'][text()='Excel']"); ////*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[1]/div[5]/div[2]/div/div[1]/div/button/div");  //div[@class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8 wd-pct-75']"); //"(//button[@class='dd-item fs-11 dropdown-item'])[2]");
    By excel = By.xpath("//button[@class='dd-item fs-11 dropdown-item'][text()='Excel']"); ////*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[1]/div[5]/div[2]/div/div[1]/div/div/button[1]"); //div[5]/div[2]/div/div[1]/div/div/button[1]");
//  By invisibilityOfElementLocated4 = By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div");
    By csv = By.xpath("//button[@class='dd-item fs-11 dropdown-item'][text()='CSV']"); ////*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[1]/div[5]/div[2]/div/div[1]/div/div/button[2]");  //div[5]/div[2]/div/div[1]/div/div/button[2]");
//  By invisibilityOfElementLocated5 = By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div");
    By Tactics_Add_Column_Path_Count = By.xpath("//*[@class='display-inline-block']");
    By Add_Column = By.xpath("//*[@class='display-inline-block']");
    By Total_Add_Column_Items = By.xpath("//div[@class='v-center fs-11 txt-left']/div[@class='white-sp-nowrap ov-hidden text-ov-ellipsis']"); ////*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div/div[2]/div/div"); //TRX 
//  By Add_Column_Item_Path_1 = By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div/div[5]/div/div/div[2]/div/div[");
//	By Add_Column_Item_Path_2 = By.xpath("]");
	By Total_Grid_Name_Path_List = By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']");
	By TacticScreenOpen = By.xpath("//*[@class='fas fa-sliders-h mg-r-8 mg-t-1']");
	
	public ACA_Tactics_Module_Path(WebDriver driver) 
	{
		ACA_Tactics_Module_Path.driver = driver;
    }
  /*  public WebElement getTactics_DrillDown_Grid_Item_Path_1() 
    {
        return driver.findElement(Tactics_DrillDown_Grid_Item_Path_1);
    }
    public WebElement getTactics_DrillDown_Grid_Item_Path_2()
    {
        return driver.findElement(Tactics_DrillDown_Grid_Item_Path_2);
    }
    public WebElement getTactics_DrillDown_Grid_Item_Path_3()
    {
        return driver.findElement(Tactics_DrillDown_Grid_Item_Path_3);
    }*/
    public WebElement getTactics_Filter_Scope_Select_DeSelect()
    {
    	return driver.findElement(Tactics_Filter_Scope_Select_DeSelect);
    }
    /*public WebElement getTactic_Filter_1()
    {
    	return driver.findElement(Tactic_Filter_1);
    }
    public WebElement getTactic_Filter_2()
    {
    	return driver.findElement(Tactic_Filter_2);
    }*/
    public WebElement getVersion_Name()
    {
    	return driver.findElement(Version_Name);
    }
    public WebElement getTotal_KPI_Name()
    {
    	return driver.findElement(Total_KPI_Name);
    }
    public WebElement getTotal_KPI_Value()
    {
    	return driver.findElement(Total_KPI_Value);
    }
    public List<WebElement> getgridList()
    {
    	return driver.findElements(gridList);
    }
    public List<WebElement> getTotal_Tactics_DrillDown_Grid_Items()
    {
    	return driver.findElements(Total_Tactics_DrillDown_Grid_Items);
    }
   /* public List<WebElement> getinvisibilityOfElementLocated()
    {
    	return driver.findElements(invisibilityOfElementLocated);
    }*/
    public List<WebElement> getTotal_Dimension_Items()
    {
    	return driver.findElements(Total_Dimension_Items );
    }
   /* public WebElement getCountValue_1()
    {
    	return driver.findElement(CountValue_1);
    }
    public WebElement getCountValue_2()
    {
    	return driver.findElement(CountValue_2);
    }*/
//    public List<WebElement> getinvisibilityOfElementLocated2()
//    {
//    	return driver.findElements(invisibilityOfElementLocated2);
//    }
    public List<WebElement> getTotal_Tactics_DrillDown_Back_Items()
    {
    	return driver.findElements(Total_Tactics_DrillDown_Back_Items );
    }
   /* public WebElement getTactics_DrillDown_Back_Item_Path_1()
    {
    	return driver.findElement(Tactics_DrillDown_Back_Item_Path_1);
    }
    public WebElement getTactics_DrillDown_Back_Item_Path_2()
    {
    	return driver.findElement(Tactics_DrillDown_Back_Item_Path_2);
    }
    public WebElement getTactics_DrillDown_Back_Item_Path_3()
    {
    	return driver.findElement(Tactics_DrillDown_Back_Item_Path_3);
    }*/
//    public List<WebElement> getinvisibilityOfElementLocated3()
//    {
//    	return driver.findElements(invisibilityOfElementLocated3);
//    }
    public List<WebElement> getTactics_Export_Path_Count()
    {
    	return driver.findElements(Tactics_Export_Path_Count);
    }
    public WebElement getexport()
    {
    	return driver.findElement(export);
    }
    public WebElement getexcel()
    {
    	return driver.findElement(excel);
    }
   /* public List<WebElement>getinvisibilityOfElementLocated4()
    {
    	return driver.findElements(invisibilityOfElementLocated4);
    }*/
    public WebElement getcsv()
    {
    	return driver.findElement(csv);
    }
   /* public List<WebElement> getinvisibilityOfElementLocated5()
    {
    	return driver.findElements(invisibilityOfElementLocated5);
    }*/
    public List<WebElement> getTactics_Add_Column_Path_Count()
    {
    	return driver.findElements(Tactics_Add_Column_Path_Count);
    }
    public WebElement getAdd_Column()
    {
    	return driver.findElement(Add_Column);
    }
    public List<WebElement> getTotal_Add_Column_Items()
    {
    	return driver.findElements(Total_Add_Column_Items );
    }
    /*public WebElement getAdd_Column_Item_Path_1()
    {
    	return driver.findElement( Add_Column_Item_Path_1);
    }
    public WebElement getAdd_Column_Item_Path_2()
    {
    	return driver.findElement( Add_Column_Item_Path_1);
    }*/
    public List<WebElement> getTotal_Grid_Name_Path_List()
    {
    	return driver.findElements(Total_Grid_Name_Path_List);
    }
    public List<WebElement> get_TacticScreenOpen()
    {
    	return driver.findElements(TacticScreenOpen);
    }
    public List<WebElement> get_DrillBackIcon()
    {
    	return driver.findElements(DrillBackIcon);
    }
   
    
  }
