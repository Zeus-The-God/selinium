package com.dezlearn.qa.mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/");

        Actions action = new Actions(driver);
        WebElement clients = driver.findElement(By.xpath("//a[normalize-space()='Test Pages']"));
        action.moveToElement(clients).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("JavaScript Alert")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
    
}
