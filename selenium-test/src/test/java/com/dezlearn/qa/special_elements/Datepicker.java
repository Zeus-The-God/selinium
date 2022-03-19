package com.dezlearn.qa.special_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

    public static void main(String[] args) throws InterruptedException {

        String expectedMonth = "Aug 2022";
        String expectedDate = "15";

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trivago.com/");

        driver.findElement(By.xpath("//span[@data-testid='checkin-calendar-subline']")).click();
        String currentMonth = driver.findElement(By.xpath("//th[@scope='col']")).getText();
        int count = 0;

        while (!currentMonth.contains(expectedMonth)) {

            driver.findElement(By.xpath("//span[@class='inline-flex leading-none transform']")).click();
            count++;
            Thread.sleep(1000);
            currentMonth = driver.findElement(By.xpath("//button[normalize-space()='April 2022']")).getText();

            if (count == 12) {
                break;
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("(//td)[33]"));

        for (WebElement date : dates) {
            String x = date.getText().trim();
            if (x.equals(expectedDate)) {
                date.click();
                break;
            }
        }
    }

}
