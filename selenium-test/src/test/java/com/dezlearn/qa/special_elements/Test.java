package com.dezlearn.qa.special_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trivago.com/");

       //List<WebElement> dates = driver.findElements(By.xpath("(//td)[34]"));

    //    for(WebElement date : dates){
    //        System.out.println(date);
    //    }

    String data = driver.findElement(By.xpath("//th[@scope='col']")).getText();
    System.out.println(data);
           
    }
    
}
