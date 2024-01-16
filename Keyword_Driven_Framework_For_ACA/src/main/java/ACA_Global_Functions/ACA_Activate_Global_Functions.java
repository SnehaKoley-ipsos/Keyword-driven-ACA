package ACA_Global_Functions;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Activate_Global_Functions {
	
	private static final String DateTime = null;
	public static String Scenario_Name = "Activate_QA_WebCrawler_";
	
	
	public static String Auto_Generate_New_Scenario_Name()
    {
        Random rnd = new Random();
        int RamdomValues = rnd.nextInt(10000);
        String Scenario_Name_2 = Integer.toString(RamdomValues);
        String New_Scenario_Name = (Scenario_Name + Scenario_Name_2);

        return New_Scenario_Name;
    }
	
	public static void Take_Snap_Shot()
    {
		//Take the screenshot
        File screenshot = ((TakesScreenshot) ACA_Activate_Get_Driver.getdriver()).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try
        {
            FileUtils.copyFile(screenshot, new File("C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Take_Snap_Shot\\Snap_0001.jpg"));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        
        //return "File";
		
//        String Date_Time = (DateTime.Now.ToLongDateString() + " " +
//                            DateTime.Now.Hour + "h " +
//                            DateTime.Now.Minute + "m " +
//                            DateTime.Now.Second + "s").Replace(" ", "_");
//        string SShort_Date_Time = "Snap" + "_" + Date_Time + ".jpeg";
//        Screenshot ss = ((ITakesScreenshot)driver).GetScreenshot();
//        ss.SaveAsFile(@_FolderPath+"\\" + SShort_Date_Time, ScreenshotImageFormat.Jpeg);
    }

}
