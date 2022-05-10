package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oskar\\Documents\\Development\\Kodilla\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}