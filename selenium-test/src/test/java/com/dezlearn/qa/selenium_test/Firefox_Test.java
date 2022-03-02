package com.dezlearn.qa.selenium_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://fzintegrator.qa.fusionezee.com");

		System.out.println(driver.getTitle());

	}

}
