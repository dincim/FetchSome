package com.fetchsome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/muratdinc/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://192.168.0.248:8080/product-search/find");
		
	}
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.className("auth0-lock-input")).sendKeys("murat.dinc@fairbit.com");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();
		
		
	}
		
		
		
	}
	
	
