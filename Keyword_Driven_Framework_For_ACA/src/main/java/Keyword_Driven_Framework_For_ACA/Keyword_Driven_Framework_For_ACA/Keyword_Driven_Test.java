package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

public class Keyword_Driven_Test {

	public static void main(String[] args) throws Throwable {
		
		Read_Instruction_Data RID = new Read_Instruction_Data();
		RID.Demofile(4);
		
		Activate_LogIn A_LogIn = new Activate_LogIn();
		Module_For_Tactics M_Tactics = new Module_For_Tactics();
		
		Get_Driver.getdriver();
		A_LogIn.Navigate_To_URL();
		A_LogIn.Enter_User_Id();
		A_LogIn.Enter_User_Password();
		A_LogIn.Search_On_Tenant();
		A_LogIn.Select_On_App();
		M_Tactics.Filter_Select_DeSelect();
		M_Tactics.Filter_Apply_Button();
		M_Tactics.Filter_Save();
		M_Tactics.Filter_Scope_Typing_New_Name_and_Description();
		A_LogIn.Close_Browser();
		
		System.out.println("\n" + "Test Case Executed Successfully");
	}

}
