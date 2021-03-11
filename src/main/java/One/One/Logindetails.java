
/*
 * package One.One;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logindetails {

	public class LoginTest {

		WebDriver driver =null;
		
		
		@BeforeMethod
		public void openBrowser() {
		
			System.setProperty("webdriver.chrome.driver","./chromedriver_win32/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//To maximize the Browser
			driver.manage().window().maximize();
			
			//Apply Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
		
		@Test
		public void LoginOrangeHRM(){
			//open the orangehrmlive site
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
			driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sana");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Khan");
			driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
			driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("2345678");
			
			driver.findElement(By.xpath("//input[@id='chkLogin']")).click();
			
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("sanakhan");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("sanakhan123");
			driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("sanakhan123");
			
			Select drpstatus=new Select(driver.findElement(By.name("status")));
			drpstatus.selectByVisibleText("Enabled");
			
			
			
			
		}
		
	
	
	
}
}

*/
