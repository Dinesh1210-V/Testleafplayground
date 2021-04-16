package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
        
        driver.findElementByXPath("(//a[contains(text(),'Find Leads')])[1]").click();
        
        driver.findElementByLinkText("Phone").click();
        
        driver.findElementByXPath("((//label[text()='phone Number:'])[4]/following::input)[3]").sendKeys("99");
        
        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
        
        Thread.sleep(2000);
        
        String capture=driver.findElementByXPath("(//div[@class='x-grid3-hd-inner x-grid3-hd-firstName'])[1]").getText();
        
        System.out.println("capture lead id is"+ capture);
        
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        
        Thread.sleep(2000);    
        
        driver.findElementByClassName("subMenuButtonDangerous").click();
        
        driver.findElementByLinkText("Find Leads").click();
        
        driver.findElementByLinkText("Phone").click();
        
        driver.findElementByXPath("((//label[text()='phone Number:'])[4]/following::input)[3]").sendKeys(capture);
        
        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
        
        String text= driver.findElementByClassName("x-paging-info").getText();
        
        System.out.println("text is :"+text);
        
        if(text.equals("No record to display")) {
        	System.out.println("text is not matched");
        }
        System.out.println("Test method ended");
        }
       }


