package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
		
		//driver.findElementByLinkText("Go to Home Page").click();
		
		driver.findElementByLinkText("Verify am I broken?").click();
		
        //driver.close();
	}

}
