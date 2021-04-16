package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");

	        driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	        
	        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	        
	        driver.findElementByXPath("//*[@id=\"label\"]/a").click();
	        
	        driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
	        
	        driver.findElementByXPath("(//a[contains(http://leaftaps.com/opentaps/control/mainxt(),'Find Leads')])[1]").click();
	        
	        driver.findElementByLinkText("Email").click();
	        
	        driver.findElementByName("emailAddress").sendKeys("hari@testleaf.com");
	        
	        driver.findElementByXPath("//button[text()='Find Leads']").click();
	        
	        String capture = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
	        System.out.println("capture leadId is:"+capture);
	        Thread.sleep(2000);
	        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
	        Thread.sleep(2000);
	        driver.findElementByLinkText("Duplicate Lead").click();
	        
	        driver.findElementByXPath("//input[@value='Create Lads']").click();

	}

}
