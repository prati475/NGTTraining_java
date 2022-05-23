package _a14_selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/* Selenium grid
 *	- It is part of selenium suit
 *	- It provides multiple tests across different browsers, operating systems, and machine in parallel
 *	- It has a concept of hub and node
 *	- Hub: Where you run the test
 *	- Node: Where execution happens
 *	- parallel testing
 */

public class MultipleBrowserTest {
	
	WebDriver driver;
	
	@Parameters("browserType")
	@Test
	public void invokeBrowser(String browserType) throws MalformedURLException
	{
		
		URL remoteURL = new URL("http://172.31.128.129:4555/wd/hub");
		
		if(browserType.equals("chrome"))
		{
			ChromeOptions chromeOptions = new ChromeOptions();
			
			driver = new RemoteWebDriver(remoteURL, chromeOptions);
		}
		else if (browserType.equals("firefox"))
		{
			FirefoxOptions foxOption = new FirefoxOptions();
			
			driver = new RemoteWebDriver(remoteURL, foxOption);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://test.qatechhub.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
