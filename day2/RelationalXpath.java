package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelationalXpath {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementByXPath("(//input[@id='username'])").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input[@id='password'])").sendKeys("crm/sfa");
		driver.findElementByXPath("(//input[@class='decorativeSubmit'])").click();
		driver.findElementByXPath("CRM/SFA").click();
		//driver.findElementByXPath("(//input[@class='inputlogin'])[2]").SendKeys("crmsfa");
		//driver.findElementByXPath(("//input[@class='decorativeSubmit']").click();
		//driver.findElementByXPath(("//a)[2]").click();
		
		//WebElement username = driver.findElementById("username");
		//username.sendKeys("demosalesmanager");
		
		//driver.findElementById("password").sendKeys("crmsfa");
		
	}

}
