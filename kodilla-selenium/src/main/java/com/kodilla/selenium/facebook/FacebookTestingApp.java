package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oskar\\Documents\\Development\\Kodilla\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver,20);

        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();


        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("select"), 2));//TODO wcześniej działało?
        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);//2017
    }
}
//driver.manage().deleteAllCookies();
//driver.navigate().to("https://www.facebook.com/");
//driver.switchTo().frame(0);
//WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
//WebDriverWait wait = new WebDriverWait(driver,20);
//WebElement acceptCookies;
//driver.findElement(By.xpath("//button[@id='u_0_1_Ib']")).click();// tu nie dziala, button ma za kazdym razem inne id
//WebElement elem = driver.findElement(By.id("u_0_1_"));
//elem.click();
//driver.findElement(By.xpath("//button[contains(.,'u_0_1_')]"));
//driver.findElement(By.xpath("//*[@id='L2AGLb']")).click();
//driver.findElement(By.xpath("//button[contains (text(),'u_0_1_']")).click();
//WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
//Select yearSelect = new Select(yearCombo);
//yearSelect.selectByIndex(5);
//Thread.sleep(5000);
