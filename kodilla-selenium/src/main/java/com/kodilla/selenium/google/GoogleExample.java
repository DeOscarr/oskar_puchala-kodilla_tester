package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleExample {
    public static void main(String[] args) { //
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oskar\\Documents\\Development\\Kodilla\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement acceptCookies;
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();


        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");
        inputField.submit();
    }
}