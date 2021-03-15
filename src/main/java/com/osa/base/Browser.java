package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	 WebDriver driver;
	 @BeforeTest
	public  void browserOpen() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.osaconsultingtech.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	 @Test(priority=1)
	 public void logo() {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a"));
			
			System.out.println(driver.getTitle());

				
	 }	
	@Test(priority=2)
	 public void login() {
			driver.findElement(By.xpath("//*[@id=\"ftco-nav\"]/ul/li[7]/a")).click();
			driver.findElement(By.id("username")).sendKeys("sayeedins@yahoo.com");
			driver.findElement(By.id("password")).sendKeys(".........");
			driver.findElement(By.id("login_button")).click();
		}
	 @Test(priority=3)
	 public void studentPage() {
			driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a")).click();
			
			
		}
	@AfterTest
	public void closeDriver() {
		driver.close();
}
}