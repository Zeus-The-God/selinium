package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sooraj");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"))
				.sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Abc@#$123");// xpath using
																									// attribute
		driver.findElement(By.xpath("//label[text()='Female']")).click();// xpath using text

	}

}
