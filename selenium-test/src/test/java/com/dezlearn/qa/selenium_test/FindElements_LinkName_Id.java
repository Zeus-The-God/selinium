package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_LinkName_Id {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		
		driver.findElement(By.linkText("Try Free")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("First Name")).sendKeys("FirstName");
		
		driver.findElement(By.id("Last Name")).sendKeys("LastName");
		
		driver.findElement(By.id("Email")).sendKeys("Email@Email.com");
		
		driver.findElement(By.id("Company")).sendKeys("Company");
		
		

	}

}
