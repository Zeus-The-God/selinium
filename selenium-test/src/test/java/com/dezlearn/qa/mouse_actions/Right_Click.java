package com.dezlearn.qa.mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions action = new Actions(driver);
        action.contextClick(btn).perform();
        Thread.sleep(2000);

        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        action.sendKeys(Keys.RETURN).perform();
        driver.close();

    }

}
