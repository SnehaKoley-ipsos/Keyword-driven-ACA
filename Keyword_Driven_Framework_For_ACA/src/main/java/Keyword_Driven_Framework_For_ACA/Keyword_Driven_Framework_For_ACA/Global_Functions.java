package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.util.Random;

public class Global_Functions {
	
	public static String Scenario_Name = "Activate_QA_WebCrawler_";
	
	
	public static String Auto_Generate_New_Scenario_Name()
    {
        Random rnd = new Random();
        int RamdomValues = rnd.nextInt(10000);
        String Scenario_Name_2 = Integer.toString(RamdomValues);
        String New_Scenario_Name = (Scenario_Name + Scenario_Name_2);

        return New_Scenario_Name;
    }

}
