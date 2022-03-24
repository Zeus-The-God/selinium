package com.dezlearn.qa.switching_tabs;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Browser_Windows {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/multiple-browser-windows/");

        driver.findElement(By.cssSelector("#u_7_8")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            System.out.println(window);
            driver.switchTo().window(window);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            System.out.println("----------------------------------");

            if (driver.getCurrentUrl().equals("https://facebook.com")) {
                break;
            }
        }
        driver.findElement(By.cssSelector("#email")).sendKeys("username");
        driver.findElement(By.cssSelector("#pass")).sendKeys("password");

    }
}
