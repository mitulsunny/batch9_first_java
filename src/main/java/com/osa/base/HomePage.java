package com.osa.base;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomePage extends Browser {
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
	@AfterClass
	public void closeDriver() {
		driver.close();

}
}