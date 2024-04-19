package ACA_Global_Functions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;

import ACA_Web_Driver.ACA_Activate_Get_Driver;

public class ACA_Activate_Global_Functions {
	
	//private static final String DateTime = null;
	public static String Scenario_Name = "Activate_QA_WebCrawler_";
	static WebDriver driver = ACA_Activate_Get_Driver.getdriver();
	
	
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
		 // Define custom directory for screenshots
        String customPath = "C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Take_Snap_Shot\\";

        // Capture screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Date currentDate = new Date();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("HH-mm-ss_dd-MMM-yyyy");

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss_dd-MM-yyyy");
    	String formattedDateTime = dateFormat.format(currentDate);
        
    	String fileName = "SS_" + formattedDateTime + ".jpg";
    	
        // Save the screenshot to custom directory
        try {
            	// Create custom directory if it doesn't exist
            	File customDirectory = new File(customPath);
            	if (!customDirectory.exists()) 
            	{
            		customDirectory.mkdirs();
            	}
            	
            String filePath = Paths.get(customPath, fileName).toString();

            // Save the screenshot to custom path
            screenshotFile.renameTo(new File(filePath));
            System.out.println("\n" + "Screenshot saved to: " + filePath);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
       
    }
	
//	public static String takeScreenshotAtEndOfTest() throws IOException {
//        String dateName = new SimpleDateFormat("_HH:mm:ss_dd-MMM-yyyy").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        String destination = System.getProperty("C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Take_Snap_Shot\\") + dateName + ".JPG";
//        File finalDestination = new File(destination);
//        FileHandler.copy(source, finalDestination);
//        return destination;
//    }
	
}
