package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample2 {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//LINK TEXT
	//driver.findElement(By.linkText("Forgot your password?")).click();
	
	//ParsedLinkText
	//driver.findElement(By.partialLinkText("Forgot your ")).click();
	
	//TagName
	//driver.findElement(By.tagName("img"));
 
  
	System.out.println(driver.findElements(By.tagName("img")).size());
		
		
	

}
}

