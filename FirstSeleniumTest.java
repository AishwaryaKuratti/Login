package seleniumLearningBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	@Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\eclipse-workspace\\seleniumLearningMavenProject\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//To maximize the Browser
		driver.manage().window().maximize();
				
		driver.get(URL);
		
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//Verify HomePage Title
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		//To Close the Browser
		driver.close();
		
	}

}
