package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//driver.findElementByXPath("(//input[@type='checkbox'])[8]").;
		
		int size = driver.findElementsByXPath("//label[starts-with(text(),'Select all')]/following::input").size();
		for(int i=1; i <= 5; i++) {
			driver.findElementByXPath("(//label[starts-with(text(),'Select all')]/following::input)["+i+"]").click();
			
		}
	}

}
