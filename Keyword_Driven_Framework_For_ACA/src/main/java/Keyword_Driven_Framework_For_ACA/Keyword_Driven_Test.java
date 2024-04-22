package Keyword_Driven_Framework_For_ACA;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ACA_Common_Test_Cases.ACA_Common_Test_Cases;
import ACA_Drivers_Module.ACA_Drivers_Module;
import ACA_Instruction_Data_From_Excel_WB.ACA_Activate_Instruction_Data_From_Excel;
import ACA_Log_In_Part.ACA_Activate_Login;
import ACA_Optimize_Module.ACA_Optimize_Module;
import ACA_Report_Module.ACA_Report_Module;
import ACA_Tactics_Module.ACA_Tactics_Module;
import ACA_Trends_Module.ACA_Trends_Module;
import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class Keyword_Driven_Test extends ACA_Activate_Instruction_Data_From_Excel   {

	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	public static void main(String[] args) throws Throwable 
	{
		//ACA_Activate_Instruction_Data_From_Excel.Read_Instruction_Data_From_Excel();
		//ACA_Activate_Instruction_Data_From_Excel rid = new ACA_Activate_Instruction_Data_From_Excel();
		//rid.Demofile(4);		
		//rid.Read_Instruction_Data_From_Excel(13);
		
		ACA_Activate_Instruction_Data_From_Excel rid = new ACA_Activate_Instruction_Data_From_Excel();
		rid.Read_LogIn_Data_From_Excel();
		rid.Read_Instances_List_Data_From_Excel();
		rid.Read_Instruction_Data_From_Excel();
		
		System.out.println("\n" + "Read LogIn Data From Excel : " + rid.Read_LogIn_Data_From_Excel() + "\n");
		System.out.println("\n" + "Read Instances List Data From Excel : " + rid.Read_Instances_List_Data_From_Excel() + "\n");
		System.out.println("\n" + "Read Instruction Data From Excel : " + rid.Read_Instruction_Data_From_Excel() + "\n");
		
		
		
		ACA_Activate_Login A_LogIn = new ACA_Activate_Login();
		A_LogIn.Open_Browser();
		A_LogIn.Navigate_To_URL();
		A_LogIn.Enter_User_Id();
		A_LogIn.Enter_User_Password();
		A_LogIn.Search_On_Tenant();
		if(cellValue_5 == "")
        {
        	System.out.println("\n" + "Seleted on Stage Instance");
        }
		else
		{
			A_LogIn.Select_On_App();
		}
				
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
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Apply_Button"))
			{
				For_Common_TC.Filter_Apply_Button();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Save_Icon"))
			{
				For_Common_TC.Filter_Save_Icon();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Scope_Typing_New_Name_and_Description"))
			{
				For_Common_TC.Filter_Scope_Typing_New_Name_and_Description();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Filter_Scope_Save_And_Delete_This_Scope"))
			{
				For_Common_TC.Filter_Scope_Save_And_Delete_This_Scope();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("KPI_and_Grid_Data_Verify"))
			{
				Module_For_Tactics.KPI_and_Grid_Data_Verify();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_DrillDown"))
			{
				Module_For_Tactics.Tactics_DrillDown();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Export"))
			{
				Module_For_Tactics.Tactics_Export();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Tactics_Add_Column"))
			{
				Module_For_Tactics.Tactics_Add_Column();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Drivers.Drivers_Filter_Scope_Select_DeSelect();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Add_Column"))
			{
				Module_For_Drivers.Drivers_Add_Column();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_Export"))
			{
				Module_For_Drivers.Drivers_Export();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Drivers_DrillDown"))
			{
				Module_For_Drivers.Drivers_DrillDown();;
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_DrillDown"))
			{
				Module_For_Trends.Trends_DrillDown();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Add_Column"))
			{
				Module_For_Trends.Trends_Add_Column();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Export"))
			{
				Module_For_Trends.Trends_Export();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Trends_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Trends.Trends_Filter_Scope_Select_DeSelect();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Go_To_Optimize_Module"))
			{
				Module_For_Optimize.Go_To_Optimize_Module();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Create_A_New_Scenario"))
			{
				Module_For_Optimize.Create_A_New_Scenario();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Default_Save_Scenario"))
			{
				Module_For_Optimize.Default_Save_Scenario();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Optimize.Optimize_Filter_Scope_Select_DeSelect();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_DrillDown"))
			{
				Module_For_Optimize.Optimize_DrillDown();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Add_Column"))
			{
				Module_For_Optimize.Optimize_Add_Column();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Export"))
			{
				Module_For_Optimize.Optimize_Export();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Simulation_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Flat_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Flat_Opt_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Spend_0_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Spend_0_Opt_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Spend_0_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Spend_0_Simulation_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Minimize_Budget_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Minimize_Budget_Opt_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Advance_Options_Min_Max_Pct_Value_Change"))
			{
				Module_For_Optimize.Advance_Options_Min_Max_Pct_Value_Change();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Delete_Scenario"))
			{
				Module_For_Optimize.Optimize_Delete_Scenario();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Copy_Scenario"))
			{
				Module_For_Optimize.Optimize_Copy_Scenario();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Compare_Scenario"))
			{
				Module_For_Optimize.Optimize_Compare_Scenario();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Pct_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Pct_Simulation_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Pct_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Pct_Opt_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Values_Simulation_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Values_Simulation_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Adjust_All_By_Values_Opt_Job"))
			{
				Module_For_Optimize.Optimize_Adjust_All_By_Values_Opt_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Job_View_Result_Export"))
			{
				Module_For_Optimize.Optimize_Job_View_Result_Export();
			}			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Open_Job_Notification_Panel"))
			{
				Module_For_Optimize.Optimize_Open_Job_Notification_Panel();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_View_Result_for_Complete_Job"))
			{
				Module_For_Optimize.Optimize_View_Result_for_Complete_Job();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Optimize_Job_Adapt_These_Changes"))
			{
				Module_For_Optimize.Optimize_Job_Adapt_These_Changes();
			}
			
			
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Go_To_Report_Module"))
			{
				Module_For_Report.Go_To_Report_Module();
			}
			else if(rid.Read_Instruction_Data_From_Excel().get(i).toString().equals("Close_Browser"))
			{
				A_LogIn.Close_Browser();
			}
		}
					
		System.out.println("\n" + "All the Test cases executed successfully!");
		Thread.sleep(500);
		
		driver.quit();
        System.out.println("\n" + "Browser closed successfully!");		
		
	}
}
