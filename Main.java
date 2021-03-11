/*
package Project.AddEditEmployeeDetails;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Project.AddEditEmployeeDetails.EmployeeDetails.LoginTest;
import Project.onee.alert;
import Project.onee.form;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./operadriver.exe");
		WebDriver driver;
		String baseUrl="http://stqatools.com/";
		System.out.println("Select a Browser:\n1)GoogleCrome \n2)Firefox");
		try (Scanner scan = new Scanner(System.in)) {
			int browser = scan.nextInt();
			if (browser==1)
				driver = new ChromeDriver();
			else
				driver = new FirefoxDriver();
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		//Object of Alert class is called.
		alert alert =new alert(driver);
		
		//Object of Form class is called
		LoginTest login=new LoginTest();
		
		alert.alertBox();
		driver.navigate().to("https://stqatools.com/demo/");
		LoginTest.LoginOrangeHRM();
		driver.close();
	}
	
}
*/