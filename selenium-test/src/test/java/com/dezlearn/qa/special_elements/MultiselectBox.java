package com.dezlearn.qa.special_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiselectBox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.linkedin.com/jobs/search/?geoId=105167843&keywords=software%20quality%20assurance&location=Kerala%2C%20India");

		driver.findElement(By.xpath("//button[normalize-space()='Experience Level']")).click();
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("#artdeco-hoverable-artdeco-gen-65 li"));
		for (WebElement option : options) {
			if (option.getText().trim().contains("Associate") || 
					 option.getText().trim().contains("Director")) {
				option.click();
			}
		}

	}

}
