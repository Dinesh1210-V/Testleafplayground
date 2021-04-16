package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("dineshvenkat1210@gmail.com");
		
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		
		System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled());
		//System.out.println("the title is :" + driver.getTitle());
		
		//System.out.println("the url is :" + driver.getCurrentUrl());
		
		
		//driver.findElementById("password").sendKeys("leaf@12");
	}

}
