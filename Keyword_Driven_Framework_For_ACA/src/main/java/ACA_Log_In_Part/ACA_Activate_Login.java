package ACA_Log_In_Part;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ACA_Input_Section.ACA_Activate_Input_Data;
import ACA_Instruction_Data_From_Excel_WB.ACA_Activate_Instruction_Data_From_Excel;
import ACA_Web_Driver.ACA_Activate_Get_Driver;


public class ACA_Activate_Login extends ACA_Activate_Instruction_Data_From_Excel {
	
	static WebDriver driver;	
	
	public int timeSpan_1 = 5000;
	public int timeSpan_2 = 2000;
	
	
	public void Open_Browser() throws Throwable
	{
		driver = ACA_Activate_Get_Driver.getdriver();
		Thread.sleep(2000);
	}
	
	public void Navigate_To_URL() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(cellValue_1);
		//driver.get(ACA_Activate_Input_Data.URL);
		Thread.sleep(5000);
	}
	
	public void Enter_User_Id() throws Throwable
	{
		//Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cantAccessAccount']")));
		Thread.sleep(5000);
		
		driver.findElement(By.id("i0116")).sendKeys(cellValue_2);	//	Provide on UserName 
		Thread.sleep(1000);
		
		System.out.println("\n" + "Username is : " + cellValue_2);

		driver.findElement(By.id("idSIButton9")).click();							//	Click on Next Button
        Thread.sleep(5000);
        
        //WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("idA_PWD_ForgotPassword")));
        Thread.sleep(500);
	}
	
	public void Enter_User_Password() throws Throwable
	{		
		driver.findElement(By.id("i0118")).sendKeys(cellValue_3);
		Thread.sleep(500);
		
		System.out.println("\n" + "Password is : ********");
		
		int A = driver.findElements(By.xpath("//*[@id='idSIButton9']")).size();
        if(A == 1)
        {
        	driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();				//	Click on SignIn Button
            Thread.sleep(5000);
            
            WebDriverWait wait = new WebDriverWait(driver, 5000);	// AuthenticatorApp
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='section']")));

            String Authenticator_value = driver.findElement(By.xpath("//*[@id='idRichContext_DisplaySign']")).getText();
            System.out.println("\n" + "Authenticator Code is : " + Authenticator_value);

            //WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(50));	// AuthenticatorApp
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='col-md-24 form-group checkbox']")));
            Thread.sleep(9000);

            driver.findElement(By.xpath("//*[@class='win-button button_primary button ext-button primary ext-primary']")).click();
            Thread.sleep(2000);
            
            //WebDriverWait wait_3 = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user']")));
            Thread.sleep(4000);
        }
        else	//// OTP ////
        {            
        	driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
            Thread.sleep(10000);

            driver.findElement(By.xpath("//*[@pngsrc='https://aadcdn.msauth.net/shared/1.0/content/images/picker_verify_sms_b15dda889e9803e9d6befd60000fadf8.png']")).click();	//Click for 
            Thread.sleep(5000);
            
            WebDriverWait wait = new WebDriverWait(driver, 5000);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
            Thread.sleep(500);

            driver.findElement(By.id("idSIButton9")).click();
            Thread.sleep(1000);            
        }
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[1]/div/div")));
        Thread.sleep(2000);
	}
	
	public void Search_On_Tenant() throws Throwable
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user']")));
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/input")).sendKeys(cellValue_4);
        Thread.sleep(500);

        List<WebElement> listA  = driver.findElements(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/a/div/div/div"));

		for (int i= 0; i<listA.size(); i++) {

			if(listA.get(i).getText().equalsIgnoreCase(cellValue_4)) 
			{   
				System.out.println("\n" + "Search_On_Tenant : " + listA.get(i).getText());
				listA.get(i).click();
				Thread.sleep(1000);
			}
		}
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));      // To switch to the new window tab

        Thread.sleep(9000);
        WebDriverWait wait_1 = new WebDriverWait(driver, 1000);
        wait_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user']")));
        wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
        Thread.sleep(2000);
	}

	public void Select_On_App() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user']")));
        Thread.sleep(2000);
        
		String instance= cellValue_5;

        List<WebElement> list = driver.findElements(By.xpath("//*[@class='whitespace-nowrap']"));
        for(int j=0; j< list.size(); j++)
        {
            if(list.get(j).getText().equals(instance))
            {
                System.out.println("\n" + "Select_On_App : " + list.get(j).getText());
                WebElement requiredElement = list.get(j);
                Thread.sleep(2000);
                requiredElement.click();
                Thread.sleep(1000);
            }
        }        
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));      // To switch to the new window tab

        WebDriverWait wait_1 = new WebDriverWait(driver, 1000);
        wait_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user']")));
        wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
        Thread.sleep(2000);
        
        //Global_Functions.Take_Snap_Shot();
	}
	
	public void Close_Browser()
	{
		driver.quit();
	}
	


}
