package com.dezlearn.qa.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("Echo & Alexa")).click();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("4th Gen")).click();
		Thread.sleep(1000);

		String title = driver.findElement(By.cssSelector("#title")).getText();
		System.out.println(title);

		driver.close();

	}

}
