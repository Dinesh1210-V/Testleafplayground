package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement Source = driver.findElementById("dropdown1");
		
		Select dd = new Select(Source);
		
		dd.selectByIndex(1);
		
		
		WebElement Source1 =  driver.findElementByName("dropdown2");
		
		Select dd1 = new Select (Source1);
		
		dd1.selectByVisibleText("Appium");
		
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/..").sendKeys("Selenium");
		
	     WebElement  multiSelect= driver.findElementByXPath("//option[text()='Select your programs']/..");
		
	     Select dd2 = new Select(multiSelect);
	     
	     dd2.selectByVisibleText("Appium");
	     
	     driver.findElementByXPath("//option[text()='Get the number of dropdown options']/..").getSize();
	     
		
		
		
		
        
	}
}
