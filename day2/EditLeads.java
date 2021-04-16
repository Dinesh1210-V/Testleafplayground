package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

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
        
        
        //driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
        
        driver.findElementByXPath("(//a[contains(text(),'Find Leads')])[1]").click();
        
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
        
        Thread.sleep(2000);
        
        driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
        
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
        
        Thread.sleep(2000);
        
        //String tit = driver.getTitle();
        
        driver.quit();
        
        
        
        
        
}
}