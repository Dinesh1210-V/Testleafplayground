package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
             WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//driver.findElementByXPath("//body[@class='page page-id-153 page-template page-template-page-keyword-category page-template-page-keyword-category-php']").click();
		
		//driver.findElementById("Go to Home Page").click();
		
       // System.out.println(driver.findElementById("position").getText());
		
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		
		System.out.println(driver.findElementById("size").getSize());
		
		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
		//driver.close();
	}

}
