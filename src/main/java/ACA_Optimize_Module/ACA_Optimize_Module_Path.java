package ACA_Optimize_Module;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

  public class ACA_Optimize_Module_Path 
  {
	 
	static WebDriver driver;
	By Opt_Module_listA = By.xpath("//*[@class='outer']");
	By New_Scenario_listB = By.xpath("//*[@class='mg-r-1']");
	By New_Sceanario_Target_KPI_list = By.xpath("//*[@class='far fa-dot-circle fs-11 mg-5']");
	By New_Sceanario_Target_KPI_Child_list = By.xpath("//*[@class='far fa-check-square fs-11 mg-5']");
	By New_Scenario_listC = By.xpath("//*[@class='btn-small btn-grey2']");
	By Def_Save_Scenario_listA = By.xpath("//*[@class='mg-r-1 mg-l-3 mg-t-neg-2']");
	By export = By.xpath("//div[contains(@class, 'ov-hidden') and contains(@class, 'text-ov-ellipsis') and contains(@class, 'white-sp-nowrap') and contains(@class, 'pd-r-8')]");
	// "div.btn-small.btn-grey2.cursor-pointer.mg-r-5 > div > button"); ////div[@class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']");
	By excel = By.xpath("//button[text()='Excel']");	//*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[4]/div/div/button[1]");
	By csv = By.xpath("//button[text()='CSV']"); 	//*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[4]/div/div/button[2]");
	By Add_Column = By.xpath("//*[@class='display-inline-block']");
	By Total_Grid_Name_Path_List = By.xpath("//*[@class='cursor-pointer ov-hidden white-sp-nowrap text-ov-ellipsis']");
	By Simulate = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=1]");		//*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[1]"); //div > div > div > div > div:nth-child(2) > div > div > div.row.pd-t-5.pd-b-5 div.col-xl-7.col-lg-7.col-md-7.col-sm-7.col-12.pd-0.text-right > div > div:nth-child(1)"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"); //div[@class =  'v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5'][1]");////*[@id='main']/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]"); //div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5'][1]");   ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]");
	By SaveSimulationAs = By.xpath("//*[@class='hide-input fs-11']");
	By Run_Simulation = By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']");
	By Optimize = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]");		///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]"); //div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5'][2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
	By Write_the_Scenario_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
	By Run_Optimization = By.xpath("//*[@class='btn-small btn-grey3']");
	By SelectOnSpend = By.xpath("(//input[contains(@class, 'ht-21')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/input");
	By SelectOnBlankScreen = By.xpath("//*[@class='wd-pct-32']");
	By Spend_0_Simulation = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=1]");///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]");
	By Spend_0_Save_Sim = By.xpath("//*[@class='hide-input fs-11']");
	By Spend_0_Run_Simulation = By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']");
	By Opt_Spend_0_SelectOnSpend = By.xpath("(//input[contains(@class, 'ht-21')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/input");
	By Spend_0_Optimize = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
	By Opt_Spend_0_Write_the_Scenario_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
	By Opt_Spend_0_Run_Optimization = By.xpath("//*[@class='btn-small btn-grey3']");
	By Adjust_All = By.xpath("(//div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5 position-relative'])[position()=2]");    ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]");
	By By_Pct = By.xpath("(//input[@style='border: 0px; width: 100%; padding-right: 7px; text-align: right;'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div/div/input");
	By By_Pct_Apply = By.xpath("(//div[@class='btn-grey2 bo-c-lite-grey ht-23 txt-center pd-t-2 pd-r-5 pd-l-5 fs-10'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div");
	By Adjust_All_By_Pct_Simulation = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]");
	By Adjust_All_By_Pct_Sim_SaveSimulationAs = By.xpath("//*[@class='hide-input fs-11']");
	By Adjust_All_By_Pct_Run_Simulation = By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']");
	By Opt_job_Adjust_All  = By.xpath("(//div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5 position-relative'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]");
	By Opt_job_Adjust_All_By_Pct = By.xpath("(//input[@style='border: 0px; width: 100%; padding-right: 7px; text-align: right;'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div/div/input");
	By Opt_job_Adjust_All_By_Pct_Apply = By.xpath("(//div[@class='btn-grey2 bo-c-lite-grey ht-23 txt-center pd-t-2 pd-r-5 pd-l-5 fs-10'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div");
	By Opt_job_Adjust_All_By_Pct_Optimize = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
	By Opt_Write_the_Scenario_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
	By Opt_Run_Optimize = By.xpath("//*[@class='btn-small btn-grey3']");
	By Adjust_All_By_Values = By.xpath("(//div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5 position-relative'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]");
	By Adjust_All_By_Values_Sim_job = By.xpath("(//input[@style='border: 0px; width: 100%; padding-right: 7px; text-align: right;'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[4]/div/div/input");
	By Adjust_All_By_Values_Apply = By.xpath("(//div[@class='btn-grey2 bo-c-lite-grey ht-23 txt-center pd-t-2 pd-r-5 pd-l-5 fs-10'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[3]/div");
	By Adjust_All_By_Values_Simulation = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]");
	By Adjust_All_By_Values_SaveSimulationAs = By.xpath("//*[@class='hide-input fs-11']");
	By Adjust_All_By_Values_Run_Simulation = By.xpath("//*[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer mg-r-5']");
	By Adjust_All_By_Values_opt_job = By.xpath("(//div[@class='v-center pd-t-1 btn-grey2 bo-c-lite-grey ht-25 pd-b-2 txt-center pd-r-5 pd-l-5 fs-11 cursor-pointer wd-90 mg-r-5 position-relative'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]");
	By Adjust_All_By_Values_Optimization = By.xpath("(//input[@style='border: 0px; width: 100%; padding-right: 7px; text-align: right;'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[4]/div/div/input");
	By Adjust_All_By_Values_Apply_Opt = By.xpath("(//div[@class='btn-grey2 bo-c-lite-grey ht-23 txt-center pd-t-2 pd-r-5 pd-l-5 fs-10'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[3]/div");
    By Adjust_All_By_Values_Optimize = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
    By Adjust_All_By_Values_Write_the_Simulation_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
	By Adjust_All_By_Values_Run_Simulation_job = By.xpath("//*[@class='btn-small btn-grey3']");
    By Optimize_Minimize_Budget = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
    By Optimize_Min_Budget_Write_the_Scenario_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
    By Change_Optimization_Goal = By.xpath("//div[@class='dd-text fs-11' and normalize-space(text())='Maximize Revenue By Target Budget']"); ////*[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/button");
    By Optimization_Goal_Change_Value = By.xpath("(//button[@type='button' and @aria-haspopup='true' and @aria-expanded='false' and contains(@class, 'dropdown-item') and contains(@class, 'btn-secondary') and .//div[@class='dd-text fs-11']])[3]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/button");
    By Optimization_Goal_Run_Optimization = By.xpath("//*[@class='btn-small btn-grey3']");
    By Advance_Options_Min_Max_Pct_Value_Change_Opt = By.xpath("(//div[@class = 'ht-12 wd-12 mg-r-7'])[position()=2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]");
    By Advance_Options_Min_Max_Write_the_Scenario_Name = By.xpath("//*[@class='inputField wd-250 pd-10']");
    By Change_Settings_Mode = By.xpath("(//button[@class='dropdown-item d-flex btn btn-secondary' and @aria-expanded='false'])[3]"); ////*[@id='main']/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/button");
    By Settings_Mode_Change_Value  = By.xpath("//button[@class='dd-item fs-11 dropdown-item' and text()='Advance Options']"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/div/button");
    By Min_Value_Change = By.xpath("(//div[contains(@class, 'pd-r-10')]/input[@type='number' and @class='sm-input-rt'])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/input");
    By Max_Value_Change = By.xpath("(//div[contains(@class, 'pd-r-10')]/input[@type='number' and @class='sm-input-rt'])[2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/input");
    By Set_Constraint = By.xpath("//div[contains(@class, 'btn-small') and contains(@class, 'btn-grey-opt') and @style='margin-right: 0px; white-space: nowrap;']"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div[5]");
    By Advance_Options_Min_Max_Run_Optimization = By.xpath("//*[@class='btn-small btn-grey3']");
    By Opt_Open_Job_Notification_0 = By.xpath("//i[text()='assignment']"); ////*[@id='main']/div/div/div/div/div/nav/div/div/span/i[1]");
    By Opt_Job_List = By.xpath("//*[@id='main']/div/div/div/div/div/nav/div/div/span/i[1]");
    By Opt_View_Result_For_Complete_Job = By.xpath("//span[@class='result-text' and text()='View result']");////*[@id='batchwindow_321']/ul/li/div/div[4]/span[1]");
    By Opt_Job_View_Result_From_Notification_Icon = By.xpath("//*[@class='result-text']");
    By View_Result_Export = By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']");
    By View_Result_Excel = By.xpath("(//button[contains(@class, 'dd-item') and contains(@class, 'fs-11')])[position()=3]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]");
    By View_Result_CSV = By.xpath("(//button[contains(@class, 'dd-item') and contains(@class, 'fs-11')])[position()=4]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]");
    By Opt_Job_Adapt_Changes = By.xpath("//*[@class='btn-small btn-blue-selected']");
    By Optimize_Delete_Scenario_ListA = By.xpath("//*[@class='outer']");
    By Select_Scenario = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i");
    By Optimize_Delete_Scenario_ListB = By.xpath("//*[@class='mg-r-1']");
    By Delete = By.xpath("//*[@class='fas fa-trash-alt mg-r-5']");
    By Optimize_Copy_Select_Scenario = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i");
    By Optimize_Copy_Scenario_ListB = By.xpath("//*[@class='mg-r-1']");
    By Collect_Copy_Scenario_Name = By.xpath("//*[@class='text-center txt-red fs-14']");
    By Copy = By.xpath("//*[@class='hide-input']");
    By Copy_Button = By.xpath("//*[@class='fas fa-copy mg-r-5']");
    By Select_Scenario_1 = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i");
    By Select_Scenario_2 = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/i");
    By Optimize_Compare_Scenario_ListA = By.xpath("//*[@class='mg-r-1']");
    By Back_to_Scenario_Library_Button = By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer mg-l-3 fs-11 fw-600']");
    By Optimize_Compare_Scenario_With_Export_Select_Scenario_1 = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[1]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/i");
    By Optimize_Compare_Scenario_With_Export_Select_Scenario_2 = By.xpath("(//i[contains(@class, 'fa-square') and contains(@class, 'fs-12')])[2]"); ///html/body/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/i");
    By Optimize_Compare_Scenario_With_Export_ListA = By.xpath("//*[@class='mg-r-1']");
    By Optimize_Compare_Scenario_View_Result_Export = By.xpath("//*[@Class='ov-hidden text-ov-ellipsis white-sp-nowrap pd-r-8']");
    By Optimize_Compare_Scenario_View_Result_Excel = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[1]");
    By Optimize_Compare_Scenario_View_Result_CSV = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/button[2]");
    By Back_To_Scenario_Library_Button = By.xpath("//*[@class='btn-grey2 bo-c-lite-grey ln-ht-20 txt-center pd-r-5 pd-l-5 cursor-pointer mg-l-3 fs-11 fw-600']");
    
    
    
    
    
    
    
	public ACA_Optimize_Module_Path(WebDriver driver) 
	{
		ACA_Optimize_Module_Path.driver = driver;
    }
	public List<WebElement> get_OptModule_listA()
    {
    	return driver.findElements(Opt_Module_listA);
    }
	public List<WebElement> get_New_Sceanario_listB()
    {
    	return driver.findElements(New_Scenario_listB);
    }
	public List<WebElement> get_New_Sceanario_Target_KPI_list()
    {
    	return driver.findElements(New_Sceanario_Target_KPI_list);
    }
	public List<WebElement> get_New_Sceanario_Target_KPI_Child_list()
    {
    	return driver.findElements(New_Sceanario_Target_KPI_Child_list);
    }
	
	public List<WebElement> get_New_Scenario_listC()
    {
    	return driver.findElements(New_Scenario_listC);
    }
	public List<WebElement> get_Def_Save_Scenario_listA()
    {
    	return driver.findElements(Def_Save_Scenario_listA);
    }
	public WebElement get_Total_Dimension_Items()
	{
		return driver.findElement(Def_Save_Scenario_listA);
	}
	public WebElement get_export()
	{
		return driver.findElement(export);
	}
	public WebElement get_excel()
	{
		return driver.findElement(excel);
	}
	public WebElement get_csv()
	{
		return driver.findElement(csv);
	}
	public WebElement get_Add_Column()
	{
		return driver.findElement(Add_Column);
	}
	public List<WebElement> get_Total_Grid_Name_Path_List()
	{
		return driver.findElements(Total_Grid_Name_Path_List);
	}
	public WebElement get_Simulate()
	{
		return driver.findElement(Simulate);
	}
	public WebElement get_SaveSimulationAs()
	{
		return driver.findElement(SaveSimulationAs);
	}
	public WebElement get_Run_Simulation()
	{
		return driver.findElement(Run_Simulation);
	}
	public WebElement get_Optimize()
	{
		return driver.findElement(Optimize);
	}
    public WebElement get_Write_the_Scenario_Name()
    {
    	return driver.findElement(Write_the_Scenario_Name);
    }
    public WebElement get_Run_Optimization()
    {
    	return driver.findElement(Run_Optimization);
    }
    public WebElement get_SelectOnSpend()
    {
    	return driver.findElement(SelectOnSpend);
    }
    public WebElement get_SelectOnBlankScreen()
    {
    	return driver.findElement(SelectOnBlankScreen);
    }
    public WebElement get_Spend_0_Simulation()
    {
    	return driver.findElement(Spend_0_Simulation);
    }
    public WebElement get_Spend_0_Save_Sim()
    {
    	return driver.findElement(Spend_0_Save_Sim);
    }
    public WebElement get_Spend_0_Run_Simulation()
    {
    	return driver.findElement(Spend_0_Run_Simulation);
    }
    public WebElement get_Opt_Spend_0_SelectOnSpend()
    {
    	return driver.findElement(Opt_Spend_0_SelectOnSpend);
    }
    public WebElement get_Spend_0_Optimize()
    {
    	return driver.findElement(Spend_0_Optimize);
    }
    public WebElement get_Opt_Spend_0_Write_the_Scenario_Name()
    {
    	return driver.findElement(Opt_Spend_0_Write_the_Scenario_Name);
    }
    public WebElement get_Opt_Spend_0_Run_Optimization()
    {
    	return driver.findElement(Opt_Spend_0_Run_Optimization);
    }
	public WebElement get_Adjust_All()
	{
		return driver.findElement(Adjust_All);
	}
	public WebElement get_By_Pct()
	{
		return driver.findElement(By_Pct);
	}
	public WebElement get_By_Pct_Apply()
	{
		return driver.findElement(By_Pct_Apply);
	}
	public WebElement get_Adjust_All_By_Pct_Simulation()
	{
		return driver.findElement(Adjust_All_By_Pct_Simulation);
	}
	public WebElement get_Adjust_All_By_Pct_Sim_SaveSimulationAs()
	{
		return driver.findElement(Adjust_All_By_Pct_Sim_SaveSimulationAs);
	}
	public WebElement get_Adjust_All_By_Pct_Run_Simulation()
	{
		return driver.findElement(Adjust_All_By_Pct_Run_Simulation);
	}
	public WebElement get_Opt_job_Adjust_All()
	{
		return driver.findElement(Opt_job_Adjust_All);
	}
	public WebElement get_Opt_job_Adjust_All_By_Pct()
	{
		return driver.findElement(Opt_job_Adjust_All_By_Pct);
	}
	public WebElement get_Opt_job_Adjust_All_By_Pct_Apply()
	{
		return driver.findElement(Opt_job_Adjust_All_By_Pct_Apply);
	}
	public WebElement get_Opt_job_Adjust_All_By_Pct_Optimize()
	{
		return driver.findElement(Opt_job_Adjust_All_By_Pct_Optimize);
	}
	public WebElement get_Opt_Write_the_Scenario_Name()
	{
		return driver.findElement(Opt_Write_the_Scenario_Name);
	}
	public WebElement get_Opt_Run_Optimize()
	{
		return driver.findElement(Opt_Run_Optimize);
	}
	public WebElement get_Adjust_All_By_Values()
	{
		return driver.findElement(Adjust_All_By_Values);
	}
	public WebElement get_Adjust_All_By_Values_Sim_job()
	{
		return driver.findElement(Adjust_All_By_Values_Sim_job);
	}
	public WebElement get_Adjust_All_By_Values_Apply()
	{
		return driver.findElement(Adjust_All_By_Values_Apply);
	}
	public WebElement get_Adjust_All_By_Values_Simulation()
	{
		return driver.findElement(Adjust_All_By_Values_Simulation);
	}
	public WebElement get_Adjust_All_By_Values_SaveSimulationAs()
	{
		return driver.findElement(Adjust_All_By_Values_SaveSimulationAs);
	}
	public WebElement get_Adjust_All_By_Values_Run_Simulation()
	{
		return driver.findElement( Adjust_All_By_Values_Run_Simulation );
	}
	public WebElement get_Adjust_All_By_Values_opt_job()
	{
		return driver.findElement(Adjust_All_By_Values_opt_job);
	}
	public WebElement get_Adjust_All_By_Values_Optimization()
	{
		return driver.findElement(Adjust_All_By_Values_Optimization);
	}
	public WebElement get_Adjust_All_By_Values_Apply_Opt()
	{
		return driver.findElement(Adjust_All_By_Values_Apply_Opt);
	}
	public WebElement get_Adjust_All_By_Values_Optimize()
	{
		return driver.findElement(Adjust_All_By_Values_Optimize);
	}
	public WebElement get_Adjust_All_By_Values_Write_the_Simulation_Name()
	{
		return driver.findElement(Adjust_All_By_Values_Write_the_Simulation_Name);
	}
	public WebElement get_Adjust_All_By_Values_Run_Simulation_job()
	{
		return driver.findElement(Adjust_All_By_Values_Run_Simulation_job);
	}
	public WebElement get_Optimize_Minimize_Budget()
	{
		return driver.findElement(Optimize_Minimize_Budget);
	}
	public WebElement get_Optimize_Min_Budget_Write_the_Scenario_Name()
	{
		return driver.findElement(Optimize_Min_Budget_Write_the_Scenario_Name);
	}
	public WebElement get_Change_Optimization_Goal()
	{
		return driver.findElement(Change_Optimization_Goal);
	}
	public WebElement get_Optimization_Goal_Change_Value()
	{
		return driver.findElement(Optimization_Goal_Change_Value);
	}
	public WebElement get_Optimization_Goal_Run_Optimization()
	{
		return driver.findElement(Optimization_Goal_Run_Optimization);
	}
	public WebElement get_Advance_Options_Min_Max_Pct_Value_Change_Opt()
	{
		return driver.findElement(Advance_Options_Min_Max_Pct_Value_Change_Opt);
	}
	public WebElement get_Advance_Options_Min_Max_Write_the_Scenario_Name()
	{
		return driver.findElement(Advance_Options_Min_Max_Write_the_Scenario_Name);
	}
	public WebElement get_Change_Settings_Mode()
	{
		return driver.findElement(Change_Settings_Mode);
	}
	public WebElement get_Settings_Mode_Change_Value()
	{
		return driver.findElement(Settings_Mode_Change_Value);
	}
	public WebElement get_Min_Value_Change()
	{
		return driver.findElement(Min_Value_Change);
	}
	public WebElement get_Max_Value_Change()
	{
		return driver.findElement(Max_Value_Change);
	}
	public WebElement get_Set_Constraint()
	{
		return driver.findElement(Set_Constraint);
	}
	public WebElement get_Advance_Options_Min_Max_Run_Optimization()
	{
		return driver.findElement(Advance_Options_Min_Max_Run_Optimization);
	}
	public WebElement get_Opt_Open_Job_Notification_0()
	{
		return driver.findElement(Opt_Open_Job_Notification_0);
	}
	public WebElement get_Opt_Job_List()
	{
		return driver.findElement(Opt_Job_List);
	}
	public WebElement get_Opt_View_Result_For_Complete_Job()
	{
		return driver.findElement(Opt_View_Result_For_Complete_Job);
	}
	public WebElement get_Opt_Job_View_Result_From_Notification_Icon()
	{
		return driver.findElement(Opt_Job_View_Result_From_Notification_Icon);
	}
	public WebElement get_View_Result_Export()
	{
		return driver.findElement(View_Result_Export);
	}
	public WebElement get_View_Result_Excel()
	{
		return driver.findElement(View_Result_Excel);
	}
	public WebElement get_View_Result_CSV() 
	{
		return driver.findElement(View_Result_CSV);
	}
	public WebElement get_Opt_Job_Adapt_Changes()
	{
		return driver.findElement(Opt_Job_Adapt_Changes);
	}
	public List<WebElement>  get_Optimize_Delete_Scenario_ListA()
	{
		return driver.findElements(Optimize_Delete_Scenario_ListA);
	}
	public WebElement get_Select_Scenario()
	{
		return driver.findElement(Select_Scenario);
	}
	public List<WebElement> get_Optimize_Delete_Scenario_ListB()
	{
		return driver.findElements(Optimize_Delete_Scenario_ListB);
	}
	public WebElement get_Delete()
	{
		return driver.findElement(Delete);
	}
	public WebElement get_Optimize_Copy_Select_Scenario()
	{
		return driver.findElement(Optimize_Copy_Select_Scenario);
	}
	public List<WebElement> get_Optimize_Copy_Scenario_ListB()
	{
		return driver.findElements(Optimize_Copy_Scenario_ListB);
	}
	public WebElement get_Collect_Copy_Scenario_Name()
	{
		return driver.findElement(Collect_Copy_Scenario_Name);
	}
	public WebElement get_Copy()
	{
		return driver.findElement(Copy);
	}
	public WebElement get_Copy_Button()
	{
		return driver.findElement(Copy_Button);
	}
	public WebElement get_Select_Scenario_1()
	{
		return driver.findElement(Select_Scenario_1);
	}
	public WebElement get_Select_Scenario_2()
	{
		return driver.findElement(Select_Scenario_2);
	}
	public List<WebElement> get_Optimize_Compare_Scenario_ListA()
	{
		return driver.findElements(Optimize_Compare_Scenario_ListA);
	}
	public WebElement get_Back_to_Scenario_Library_Button()
	{
		return driver.findElement(Back_to_Scenario_Library_Button);
	}
	public WebElement get_Optimize_Compare_Scenario_With_Export_Select_Scenario_1()
	{
		return driver.findElement(Optimize_Compare_Scenario_With_Export_Select_Scenario_1);
	}
	public WebElement get_Optimize_Compare_Scenario_With_Export_Select_Scenario_2()
	{
		return driver.findElement(Optimize_Compare_Scenario_With_Export_Select_Scenario_2);
	}
	public List<WebElement> get_Optimize_Compare_Scenario_With_Export_ListA()
	{
		return driver.findElements(Optimize_Compare_Scenario_With_Export_ListA);
	}
	public WebElement get_Optimize_Compare_Scenario_View_Result_Export()
	{
		return driver.findElement(Optimize_Compare_Scenario_View_Result_Export);
	}
	public WebElement get_Optimize_Compare_Scenario_View_Result_Excel()
	{
		return driver.findElement(Optimize_Compare_Scenario_View_Result_Excel);
	}
	public WebElement get_Back_To_Scenario_Library_Button()
	{
		return driver.findElement(Back_To_Scenario_Library_Button);
	}
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
