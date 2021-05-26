package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//id
	WebElement uname =driver.findElement(By.id("txtUsername"));
	uname.sendKeys("Admin");
	
	//by name 	
	By pass = By.name("txtPassword");
 driver.findElement(pass).sendKeys("admin123");
 
 //class name
 
 driver.findElement(By.className("textInputContainer")).click();
 
 //css
 driver.findElement(By.cssSelector("#txtPassword"));
 
 //id
 driver.findElement(By.id("#txtPassword"));
 
  
 
		
		
	

}
}

