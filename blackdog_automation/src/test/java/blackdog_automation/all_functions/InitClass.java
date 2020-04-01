//testng smoketests
//java docs
//util for webdriver
//testscript jira id
//waits for page load
//screen validations on the page throw error
//test for verification

package blackdog_automation.all_functions;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import blackdog_automation.all_functions.Log;
import blackdog_automation.all_functions.CSV_Reader;
import blackdog_automation.all_functions.UtilityClass;
import org.openqa.selenium.Platform;

/** Class to 
 * Loads the configuration properties into a properties file
 * Sets the Chrome options, disables notifications in chrome
 * Reads the Browser name and Browser mode from the Test Data file
 * Opens a fresh window of the browser, maximizes the screen, deletes all cookies
 * Waits for the Page Load timeout time and again waits for the implicit wait period
 * Opens the url for urbest website
 */


public class InitClass 
{
	public static WebDriver driver;
	public static final String currentDir = System.getProperty("user.dir");
	public static String browserpath=null;
	//public static Properties prop;


	public InitClass() throws IOException
	{
		Log.info("invoking baseclass constructor");

	}

	/**
	 * Sets the Chrome options, disables notifications in chrome
	 * Reads the Browser name and Browser mode from the Test Data file
	 * Opens the specified browser (Chrome, Firefox or Opera) in the specified mode
	 * Opens a fresh window of the browser, maximizes the screen, deletes all cookies
	 * Waits for the Page Load timeout time and again waits for the implicit wait period
	 * Opens the url
	 * @throws Exception 
	 */

	public static void initBrowser() throws Exception
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		String brwName="Chrome";
		String brwmode="local";
		String url="https://uat-idtwo2.blackdoghealth.org.au/Screening.aspx#";

		if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
			browserpath = currentDir + "//All_browser_exes//";
		} else if (Platform.getCurrent().toString().contains("WIN")) {
			browserpath = currentDir + "\\All_browser_exes\\";
		}

		if (Platform.getCurrent().toString().equalsIgnoreCase("MAC"))
				System.setProperty("webdriver.chrome.driver", browserpath+"//chromedriver");
		else if(Platform.getCurrent().toString().contains("WIN"))
				System.setProperty("webdriver.chrome.driver", "browserpath"+"\\chromedriver.exe");
		Log.info("lauching chrome driver");
		driver = new ChromeDriver(options);
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLCIT_WAIT, TimeUnit.SECONDS);
		Log.info("Launching adactin hotel web page in chrome browser");;
		driver.get(url);
		}
	

	public static void closeBrowser()
	{
		driver.close();
		Log.info("Closing the browser");
	}
}
