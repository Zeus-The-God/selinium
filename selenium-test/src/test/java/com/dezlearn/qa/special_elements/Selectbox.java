package com.dezlearn.qa.special_elements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectbox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		String a = driver.findElement(By.id("month")).getAttribute("value");
		String b = driver.findElement(By.id("day")).getAttribute("value");
		String c = driver.findElement(By.id("year")).getAttribute("value");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		List<WebElement> d = driver.findElements(By.cssSelector("select#day>option"));
		for (WebElement day : d) {
			if (day.getText().trim().equals("5")) {
				day.click();
				break;
			}
		}

		List<WebElement> m = driver.findElements(By.cssSelector("select#month>option"));
		for (WebElement month : m) {
			if (month.getText().trim().equals("Apr")) {
				month.click();
				break;
			}
		}

		List<WebElement> y = driver.findElements(By.cssSelector("select#year>option"));
		for (WebElement year : y) {
			if (year.getText().trim().equals("1997")) {
				year.click();
				break;
			}
		}

		Thread.sleep(10000);
		driver.quit();

	}

}
