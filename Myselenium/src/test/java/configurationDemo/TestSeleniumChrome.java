package configurationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniumChrome {
	ConfigReader config;
	
	@BeforeTest
	public void Setup() {
 config= new ConfigReader();
/// Create object of DesiredCapabilities class
	DesiredCapabilities cap=DesiredCapabilities.chrome();

	// Set ACCEPT_SSL_CERTS  variable to true
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		System.out.println("====================setup is ready================");
	}

	@Test
	public void TestChrome() {
		
		System.out.println("====================Test started================");
		WebDriver driver =new ChromeDriver();
		driver.get("config.getApplicationUrl()");
	}
	public void TearDown() {
		WebDriver driver =new ChromeDriver();
		driver.quit();
		System.out.println("====================Test closed================");
	}
}
