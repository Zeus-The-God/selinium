package com.dezlearn.qa.test_synchronization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.dezlearn.com/explicit-wait-example/");

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sooraj");
        driver.findElement(By.xpath("//div[@id='content']//input[2]")).sendKeys("S");
        driver.findElement(By.xpath("//input[3]")).sendKeys("test@gmail.com");

        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click();

    }

}
