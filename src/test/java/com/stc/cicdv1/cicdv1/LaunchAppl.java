package com.stc.cicdv1.cicdv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAppl {
	@Test //Testing 20-08 // 20-18 //20-28 //21:30
	public void f() {
		String strPath = "E:\\SeleniumTraining1\\TestingApp.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(strPath);
			System.out.println("Application Launched ......");
			driver.findElement(By.id("PWD")).sendKeys("Hello");
			driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
			String strTitle = driver.findElement(By.xpath("//h2")).getText();
			System.out.println("Title is : - " + strTitle);
			driver.quit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
