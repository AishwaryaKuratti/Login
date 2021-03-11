package utility;
	 import java.util.Properties;
	 import java.util.concurrent.TimeUnit;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

	

	public class DriverClass {
		public static  WebDriver driver;
		public static String exePath;
		public Properties prop;
		public static String url = "http://cookbook.seleniumacademy.com/Config.html";
		public static String browsertype;
		public static WebDriver driverInstantiate(String browser) {

			browsertype= browser;
			if(browsertype.equalsIgnoreCase("chrome")) {
				exePath = "E:\\selenium\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(url);
				driver.manage().deleteAllCookies();
			}
			else if(browser.equalsIgnoreCase("Mozila")) {
				exePath = "E:\\selenium\\geckodriver-v0.28.0-win64 (1)\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", exePath);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(url);
				driver.manage().deleteAllCookies();
			}
				return driver;
			}
		}
	
	