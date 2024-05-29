package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GUVI\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		//driver.findElements(By.)
		driver.findElement(By.id("W0wltc")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
		
		
	}

}
