package testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utility.DriverClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class HandlingBrowserWindow extends DriverClass {
	
	static  WebDriver driver;
	ArrayList<String> tabs=new ArrayList<>();
	
	@BeforeClass
	@Parameters({"browser"})
	public static void driverconfig(String browser)//configure driver
		{
	
			driver=DriverClass.driverInstantiate(browser);
		
		}
	@Test(priority=0)
	public void helpButton() throws InterruptedException
	 {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("helpbutton")));
		 driver.findElement(By.id("helpbutton")).click();
		 
	 }
	@Test(priority=1)
	public void chatButton(){
		 driver.findElement(By.id("chatbutton")).click();
	}
	@Test(priority=2)
	public void visitButton(){

		
driver.findElement(By.id("visitbutton")).click();
	}
	@Test(priority=3)
	public void noOfWindows() throws IOException
	{
	
		//Total no.of tabs opened
		//ExcelUtils.readexcel();
		tabs=new ArrayList(driver.getWindowHandles());
		System.out.println("No. of tabs: "+tabs.size());
		//System.out.println(Integer.toString(tabs.size()));
		//ExcelUtils.writeexcel(0,1,Integer.toString(tabs.size()));
	}
	@Test(priority=4)
	public void winCollection()
	{
	
		//Visit Us tab 
		tabs=new ArrayList(driver.getWindowHandles());
		for(int i=0;i<tabs.size();i++)
	    {
	    	driver.switchTo().window((String) tabs.get(i));
	    	if (driver.switchTo().window((String) tabs.get(i)).getTitle().equals("Visit Us"))
	    	{
	    		System.out.println("Visit Us found");
	    		//ExcelUtils.writeexcel(0,1,"Found");
	    		driver.close();
	    		break;
	    	}
	    	
	    }
	    driver.switchTo().window((String) tabs.get(0));
	}
@AfterClass
	// function to close the browser
	public void quitBrowser() {
		driver.quit();
	}
	
}
	