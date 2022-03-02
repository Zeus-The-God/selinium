package com.dezlearn.qa.element_details;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Get_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		String att1 = driver.findElement(By.id("u_0_j_8M")).getAttribute("class");
		
		String att2 = driver.findElement(By.id("u_0_j_8M")).getAttribute("aria-label");
		
		System.out.println(att1);
		System.out.println(att2);
		
		driver.close();
		
	}

}
