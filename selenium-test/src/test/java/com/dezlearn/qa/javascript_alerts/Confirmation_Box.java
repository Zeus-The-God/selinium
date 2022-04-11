package com.dezlearn.qa.javascript_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Box {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/javascript-alerts/");

        driver.findElement(By.cssSelector("#c_alert2")).click();
        Thread.sleep(3000);

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();

        driver.close();

    }

}
