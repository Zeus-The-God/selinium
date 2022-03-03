package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_LinkName_Id {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.name("field-keywords")).sendKeys("Barbie dolls");

		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("Cute Doll Accessories Style Wardrobe Doll")).click();

		Thread.sleep(3000);

		String productTitle = driver.findElement(By.id("productTitle")).getText();

		String productPrice = driver.findElement(By.id("corePrice_desktop")).getText();

		System.out.println("productTitle" + productTitle);
		System.out.println("productPrice" + productPrice);

	}

}
