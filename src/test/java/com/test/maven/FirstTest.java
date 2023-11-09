package com.test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", value);
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void navigateToflipkart() {
		driver.get("https://www.flipkart.com");
	}
	
	@AfterMethod
	public void closeTheBrowser() throws InterruptedException {
		Thread.sleep(3000);;
		driver.close();;
	}
	

}
