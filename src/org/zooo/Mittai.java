package org.zooo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mittai {
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\keerthi\\eclipse-workspace\\Keerthi3\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("kee123@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
		next.click();
		
	
		
	
	}

}
