package Keyword_Driven_Framework_For_ACA;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ACA_Common_Test_Cases.ACA_Common_Test_Cases;
import ACA_Drivers_Module.ACA_Drivers_Module;
import ACA_Instruction_Data_From_Excel_WB.ACA_Activate_Instruction_Data_From_Excel;
import ACA_Log_In_Part.ACA_Activate_Login;
import ACA_Optimize_Module.ACA_Optimize_Module;
import ACA_Report_Module.ACA_Report_Module;
import ACA_Tactics_Module.ACA_Tactics_Module;
import ACA_Trends_Module.ACA_Trends_Module;
import ACA_Web_Driver.ACA_Activate_Get_Driver;


public class Keyword_Driven_Test extends ACA_Activate_Instruction_Data_From_Excel {

	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	public static ExtentReports extent;
	
	public static void main(String[] args) throws Throwable 
	{		
		String dateName = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		String folderName = "ExtentReports "+dateName;
		//String folderName = "ExtentReports_0";
		
		ExtentSparkReporter spark = new ExtentSparkReporter(path+ "\\test-output\\"+folderName+"\\ACA_ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		FileInputStream fis = new FileInputStream(path + "\\Excel_Data\\Instruction_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String sheetName = wb.getSheetAt(0).getSheetName();
		
		ACA_Activate_Instruction_Data_From_Excel rid = new ACA_Activate_Instruction_Data_From_Excel();
		rid.Read_LogIn_Data_From_Excel();
		//rid.Read_Instances_List_Data_From_Excel();
		rid.Read_Instruction_Data_From_Excel();
		
		//System.out.println("\n" + "Read LogIn Data From Excel : " + rid.Read_LogIn_Data_From_Excel() + "\n");
		//System.out.println("\n" + "Read Instances List Data From Excel : " + rid.Read_Instances_List_Data_From_Excel() + "\n");
		System.out.println("\n" + "Read Instruction Data From Excel : " + rid.Read_Instruction_Data_From_Excel() + "\n");
				
		
		ACA_Activate_Login A_LogIn = new ACA_Activate_Login();
		A_LogIn.Open_Browser();
		A_LogIn.Navigate_To_URL();
		//A_LogIn.Enter_User_Id();
		//A_LogIn.Enter_User_Password();
		A_LogIn.Search_On_Tenant();		
		if(cellValue_5 == "")
        {
        	System.out.println("\n" + "Seleted on Stage Instance");
        }
		else
		{
			A_LogIn.Select_On_App();
		}
		
		ExtentTest test = extent.createTest(sheetName);
		for (int i=0; i< rid.Read_Instruction_Data_From_Excel().size(); i++) 
		{
			//System.out.println("\n" + rid.Read_Instruction_Data_From_Excel().get(i).toString());
			
			ACA_Tactics_Module Module_For_Tactics = new ACA_Tactics_Module();
			ACA_Drivers_Module Module_For_Drivers = new ACA_Drivers_Module();
			ACA_Trends_Module Module_For_Trends = new ACA_Trends_Module();
			ACA_Optimize_Module Module_For_Optimize = new ACA_Optimize_Module();
			ACA_Report_Module Module_For_Report = new ACA_Report_Module();
			ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();			
			
			//if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Select_On_App")) 
			//{
			//	A_LogIn.Select_On_App();
			//}
			
			if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Tactics.Tactics_Filter_Scope_Select_DeSelect();
//				ExtentTest test = extent.createTest("Tactics_Filter_Scope_Select_DeSelect");
				test.log(Status.INFO, "Tactics_Filter_Scope_Select_DeSelect");
			}		
			if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Navigate_to_Tactics_Module"))
			{
				Module_For_Tactics.Navigate_to_Tactics_Module();
//				ExtentTest test = extent.createTest("Navigate_to_Tactics_Module");
				test.log(Status.INFO, "Navigate_to_Tactics_Module");
			}	
			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Apply_Button"))
			{
				For_Common_TC.Filter_Apply_Button();
//				ExtentTest test = extent.createTest("Filter_Apply_Button");
				test.log(Status.INFO, "Filter_Apply_Button");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Save_Icon"))
			{
				For_Common_TC.Filter_Save_Icon();
//				ExtentTest test = extent.createTest("Filter_Save_Icon");
				test.log(Status.INFO, "Filter_Save_Icon");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Scope_Typing_New_Name_and_Description"))
			{
				For_Common_TC.Filter_Scope_Typing_New_Name_and_Description();
//				ExtentTest test = extent.createTest("Filter_Scope_Typing_New_Name_and_Description");
				test.log(Status.INFO, "Filter_Scope_Typing_New_Name_and_Description");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Scope_Save_And_Delete_This_Scope"))
			{
				For_Common_TC.Filter_Scope_Save_And_Delete_This_Scope();
//				ExtentTest test = extent.createTest("Filter_Scope_Save_And_Delete_This_Scope");
				test.log(Status.INFO, "Filter_Scope_Save_And_Delete_This_Scope");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("KPI_and_Grid_Data_Verify"))
			{
				Module_For_Tactics.KPI_and_Grid_Data_Verify();
//				ExtentTest test = extent.createTest("KPI_and_Grid_Data_Verify");
				test.log(Status.INFO, "KPI_and_Grid_Data_Verify");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_DrillDown"))
			{
				Module_For_Tactics.Tactics_DrillDown();
//				ExtentTest test = extent.createTest("Tactics_DrillDown");
				test.log(Status.INFO, "Tactics_DrillDown");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Export"))
			{
				Module_For_Tactics.Tactics_Export();
//				ExtentTest test = extent.createTest("Tactics_Export");
				test.log(Status.INFO, "Tactics_Export");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Add_Column"))
			{
				Module_For_Tactics.Tactics_Add_Column();
//				ExtentTest test = extent.createTest("Tactics_Add_Column");
				test.log(Status.INFO, "Tactics_Add_Column");
			}		
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Thresholds"))
			{
				Module_For_Tactics.Tactics_Thresholds();
//				ExtentTest test = extent.createTest("Tactics_Thresholds");
				test.log(Status.INFO, "Tactics_Thresholds");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Drivers.Drivers_Filter_Scope_Select_DeSelect();
//				ExtentTest test = extent.createTest("Drivers_Filter_Scope_Select_DeSelect");
				test.log(Status.INFO, "Drivers_Filter_Scope_Select_DeSelect");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Add_Column"))
			{
				Module_For_Drivers.Drivers_Add_Column();
//				ExtentTest test = extent.createTest("Drivers_Add_Column");
				test.log(Status.INFO, "Drivers_Add_Column");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Export"))
			{
				Module_For_Drivers.Drivers_Export();
//				ExtentTest test = extent.createTest("Drivers_Export");
				test.log(Status.INFO, "Drivers_Export");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_DrillDown"))
			{
				Module_For_Drivers.Drivers_DrillDown();
//				ExtentTest test = extent.createTest("Drivers_DrillDown");
				test.log(Status.INFO, "Drivers_DrillDown");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Navigate_to_Trends_Module"))
			{
				Module_For_Trends.Navigate_to_Trends_Module();
//				ExtentTest test = extent.createTest("Navigate_to_Trends_Module");
				test.log(Status.INFO, "Navigate_to_Trends_Module");
			}
			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_DrillDown"))
			{
				Module_For_Trends.Trends_DrillDown();
//				ExtentTest test = extent.createTest("Trends_DrillDown");
				test.log(Status.INFO, "Trends_DrillDown");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Add_Column"))
			{
				Module_For_Trends.Trends_Add_Column();
//				ExtentTest test = extent.createTest("Trends_Add_Column");
				test.log(Status.INFO, "Trends_Add_Column");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Thresholds"))
			{
				Module_For_Trends.Trends_Thresholds();
//				ExtentTest test = extent.createTest("Trends_Thresholds");
				test.log(Status.INFO, "Trends_Thresholds");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Export"))
			{
				Module_For_Trends.Trends_Export();
//				ExtentTest test = extent.createTest("Trends_Export");
				test.log(Status.INFO, "Trends_Export");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Trends.Trends_Filter_Scope_Select_DeSelect();
//				ExtentTest test = extent.createTest("Trends_Filter_Scope_Select_DeSelect");
				test.log(Status.INFO, "Trends_Filter_Scope_Select_DeSelect");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Navigate_to_Optimize_Module"))
			{
				Module_For_Optimize.Navigate_to_Optimize_Module(test, folderName);
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Create_A_New_Scenario"))
			{
				Module_For_Optimize.Create_A_New_Scenario(test, folderName);
//				ExtentTest test = extent.createTest("Create_A_New_Scenario");
				//test.log(Status.INFO, "Create_A_New_Scenario");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Create_A_New_Scenario_PopUp_Create"))
			{
				Module_For_Optimize.Create_A_New_Scenario_PopUp_Create(test, folderName);
				//ExtentTest test = extent.createTest("Create_A_New_Scenario_PopUp_Create");
				//test.log(Status.INFO, "Create_A_New_Scenario_PopUp_Create");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Default_Save_Scenario"))
			{
				Module_For_Optimize.Default_Save_Scenario();
//				ExtentTest test = extent.createTest("Default_Save_Scenario");
				test.log(Status.INFO, "Default_Save_Scenario");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Optimize.Optimize_Filter_Scope_Select_DeSelect();
//				ExtentTest test = extent.createTest("Optimize_Filter_Scope_Select_DeSelect");
				test.log(Status.INFO, "Optimize_Filter_Scope_Select_DeSelect");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_DrillDown"))
			{
				Module_For_Optimize.Optimize_DrillDown();
//				ExtentTest test = extent.createTest("Optimize_DrillDown");
				test.log(Status.INFO, "Optimize_DrillDown");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Add_Column"))
			{
				Module_For_Optimize.Optimize_Add_Column();
//				ExtentTest test = extent.createTest("Optimize_Add_Column");
				test.log(Status.INFO, "Optimize_Add_Column");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Export"))
			{
				Module_For_Optimize.Optimize_Export();
//				ExtentTest test = extent.createTest("Optimize_Export");
				test.log(Status.INFO, "Optimize_Export");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Simulation_Job();
//				ExtentTest test = extent.createTest("Optimize_Simulation_Job");
				test.log(Status.INFO, "Optimize_Simulation_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Flat_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Flat_Opt_Job();
//				ExtentTest test = extent.createTest("Optimize_Flat_Opt_Job");
				test.log(Status.INFO, "Optimize_Flat_Opt_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Spend_0_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Spend_0_Opt_Job();
//				ExtentTest test = extent.createTest("Optimize_Spend_0_Opt_Job");
				test.log(Status.INFO, "Optimize_Spend_0_Opt_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Spend_0_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Spend_0_Simulation_Job();
//				ExtentTest test = extent.createTest("Optimize_Spend_0_Simulation_Job");
				test.log(Status.INFO, "Optimize_Spend_0_Simulation_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Minimize_Budget_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Minimize_Budget_Opt_Job();
//				ExtentTest test = extent.createTest("Optimize_Minimize_Budget_Opt_Job");
				test.log(Status.INFO, "Optimize_Minimize_Budget_Opt_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Advance_Options_Min_Max_Pct_Value_Change"))
			{
				Module_For_Optimize.Advance_Options_Min_Max_Pct_Value_Change();
//				ExtentTest test = extent.createTest("Advance_Options_Min_Max_Pct_Value_Change");
				test.log(Status.INFO, "Advance_Options_Min_Max_Pct_Value_Change");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Delete_Scenario"))
			{
				Module_For_Optimize.Optimize_Delete_Scenario();
//				ExtentTest test = extent.createTest("Optimize_Delete_Scenario");
				test.log(Status.INFO, "Optimize_Delete_Scenario");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Copy_Scenario"))
			{
				Module_For_Optimize.Optimize_Copy_Scenario();
//				ExtentTest test = extent.createTest("Optimize_Copy_Scenario");
				test.log(Status.INFO, "Optimize_Copy_Scenario");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Compare_Scenario"))
			{
				Module_For_Optimize.Optimize_Compare_Scenario();
//				ExtentTest test = extent.createTest("Optimize_Compare_Scenario");
				test.log(Status.INFO, "Optimize_Compare_Scenario");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Pct_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Pct_Simulation_Job();
//				ExtentTest test = extent.createTest("Optimize_Adjust_All_By_Pct_Simulation_Job");
				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Simulation_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Pct_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Pct_Opt_Job();
//				ExtentTest test = extent.createTest("Optimize_Adjust_All_By_Pct_Opt_Job");
				test.log(Status.INFO, "Optimize_Adjust_All_By_Pct_Opt_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Values_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Values_Simulation_Job();
//				ExtentTest test = extent.createTest("Optimize_Adjust_All_By_Values_Simulation_Job");
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Simulation_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Values_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Values_Opt_Job();
//				ExtentTest test = extent.createTest("Optimize_Adjust_All_By_Values_Opt_Job");
				test.log(Status.INFO, "Optimize_Adjust_All_By_Values_Opt_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Job_View_Result_Export"))
			{
				Module_For_Optimize.Optimize_Job_View_Result_Export();
//				ExtentTest test = extent.createTest("Optimize_Job_View_Result_Export");
				test.log(Status.INFO, "Optimize_Job_View_Result_Export");
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Open_Job_Notification_Panel"))
			{
				Module_For_Optimize.Optimize_Open_Job_Notification_Panel();
//				ExtentTest test = extent.createTest("Optimize_Open_Job_Notification_Panel");
				test.log(Status.INFO, "Optimize_Open_Job_Notification_Panel");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_View_Result_for_Complete_Job"))
			{
				Module_For_Optimize.Optimize_View_Result_for_Complete_Job();
//				ExtentTest test = extent.createTest("Optimize_View_Result_for_Complete_Job");
				test.log(Status.INFO, "Optimize_View_Result_for_Complete_Job");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Job_Adapt_These_Changes"))
			{
				Module_For_Optimize.Optimize_Job_Adapt_These_Changes();
//				ExtentTest test = extent.createTest("Optimize_Job_Adapt_These_Changes");
				test.log(Status.INFO, "Optimize_Job_Adapt_These_Changes");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Thresholds"))
			{
				Module_For_Optimize.Optimize_Thresholds(test, folderName);
				//ExtentTest test = extent.createTest("Optimize_Thresholds");
				//test.log(Status.INFO, "Optimize_Thresholds");
			}
			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Navigate_to_Report_Module"))
			{
				Module_For_Report.Navigate_to_Report_Module();
//				ExtentTest test = extent.createTest("Report_Module");
				test.log(Status.INFO, "Navigate to Report Module");
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Navigate_to_All_Individual_Report"))
			{
				Module_For_Report.Navigate_to_All_Individual_Report();
//				ExtentTest test = extent.createTest("Navigate_to_All_Individual_Report");
				test.log(Status.INFO, "Navigate_to_All_Individual_Report");
			}
			
			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Close_Browser"))
			{
				A_LogIn.Close_Browser();
//				ExtentTest test = extent.createTest("Close_Browser");
				test.log(Status.INFO, "Close_Browser");
			}
		}
					
		System.out.println("\n" + "All the Test cases executed successfully!");
		Thread.sleep(500);
		
		extent.flush();
		
		driver.quit();
        System.out.println("\n" + "Browser closed successfully!");		
		
	}
}
