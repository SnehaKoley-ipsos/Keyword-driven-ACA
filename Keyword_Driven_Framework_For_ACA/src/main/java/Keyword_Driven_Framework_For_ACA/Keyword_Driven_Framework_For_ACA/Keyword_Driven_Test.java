package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Keyword_Driven_Test extends ACA_Activate_Instruction_Data_From_Excel   {

	public static void main(String[] args) throws Throwable 
	{
		//ACA_Activate_Instruction_Data_From_Excel.read_Excel_Instruction_Data();
		
		//ACA_Activate_Instruction_Data_From_Excel RID = new ACA_Activate_Instruction_Data_From_Excel();
		//RID.Demofile(4);		
		//RID.read_Excel_Instruction_Data(13);
		
		ACA_Activate_Instruction_Data_From_Excel rid = new ACA_Activate_Instruction_Data_From_Excel();
		rid.read_Excel_Instruction_Data();
		
		System.out.println("\n" + "read_Excel_Instruction_Data: " + rid.read_Excel_Instruction_Data());
		
		ACA_Activate_Login A_LogIn = new ACA_Activate_Login();
		
		
		A_LogIn.Open_Browser();
		A_LogIn.Navigate_To_URL();
		A_LogIn.Enter_User_Id();
		A_LogIn.Enter_User_Password();
		A_LogIn.Search_On_Tenant();
		
		
		for (int i=0; i< rid.read_Excel_Instruction_Data().size(); i++) 
		{			
			//System.out.println("\n" + rid.read_Excel_Instruction_Data().get(i).toString());
			
			ACA_Tactics_Module Module_For_Tactics = new ACA_Tactics_Module();
			ACA_Drivers_Module Module_For_Drivers = new ACA_Drivers_Module();
			ACA_Common_Test_Cases For_Common_TC = new ACA_Common_Test_Cases();
			
			
			
			if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Select_On_App")) 
			{
				A_LogIn.Select_On_App();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Filter_Scope_Select_DeSelect"))
			{
				Module_For_Tactics.Filter_Scope_Select_DeSelect();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Filter_Apply_Button"))
			{
				For_Common_TC.Filter_Apply_Button();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Filter_Save_Icon"))
			{
				For_Common_TC.Filter_Save_Icon();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Filter_Scope_Typing_New_Name_and_Description"))
			{
				For_Common_TC.Filter_Scope_Typing_New_Name_and_Description();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Filter_Scope_Save_And_Delete_This_Scope"))
			{
				For_Common_TC.Filter_Scope_Save_And_Delete_This_Scope();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("KPI_and_Grid_Data_Verify"))
			{
				Module_For_Tactics.KPI_and_Grid_Data_Verify();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("DrillDown"))
			{
				Module_For_Tactics.DrillDown();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Tactics_Export"))
			{
				Module_For_Tactics.Tactics_Export();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Tactics_Add_Column"))
			{
				Module_For_Tactics.Tactics_Add_Column();
			}			
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Driver_Filter_Scope_Select_DeSelect"))
			{
				Module_For_Drivers.Driver_Filter_Scope_Select_DeSelect();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Drivers_Add_Column"))
			{
				Module_For_Drivers.Drivers_Add_Column();
			}			
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Drivers_Export"))
			{
				Module_For_Drivers.Drivers_Export();
			}
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Drivers_DrillDown"))
			{
				Module_For_Drivers.Drivers_DrillDown();;
			}
			
			
			else if(rid.read_Excel_Instruction_Data().get(i).toString().equals("Close_Browser"))
			{
				A_LogIn.Close_Browser();
			}
		}
		
		
		
//		Module_For_Tactics.Filter_Select_DeSelect();
// 		Module_For_Tactics.Filter_Apply_Button();
//		Module_For_Tactics.Filter_Save_Icon();
//		Module_For_Tactics.Filter_Scope_Typing_New_Name_and_Description();
//		Module_For_Tactics.Filter_Scope_Save_And_Delete_This_Scope();
//		A_LogIn.Close_Browser();
		
		System.out.println("\n" + "All the Test cases executed successfully");
	}

}
