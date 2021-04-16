package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro {
	public static void main(String[]args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver .findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Dinesh");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("V");
		
		//driver.findElementByName("submitButton").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(source);
		
		dd.selectByIndex(1);
		
		
		
		
		
		
		
		//Thread.sleep(2000);
		//driver.close();
	}
	
}
