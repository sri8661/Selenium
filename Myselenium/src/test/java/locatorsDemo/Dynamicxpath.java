package locatorsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;

public class Dynamicxpath {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//driver.get("https://wordpress.com/log-in");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://demo.guru99.com/test/guru99home/");
	//input[contains(@id,'usernameOrEmail')]
	
	//@FindBy(xpath = "//input[contains(@id,'usernameOrEmail')]");

 
 //input[@class ='input' and/or @name='tag'];
  
 //input[@name='log'];
	
	
//input[@class='input'][@name='log']
	
//a(contains(@href,'edit.php')[test()='posts'][i]
	
//a[contains(text(),'Dismiss this message')];
//List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
	

  //tagname[@attribute1=’value1’][attribute2=’value2’]


//Syntax 
  //a[@id=’id1’][@name=’namevalue1’]

  //img[@src=’’][@href=’’]
 
  //tagname[@attribute1=’value1’][attribute2=’value2’]
   
//Example   
   
  //a[@id=’id1’][@name=’namevalue1’]
   
  //img[@src=’’][@href=’’]	
		
	

}
}

