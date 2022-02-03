package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ScrollExample {

    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver");

        // Open the browser
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,60);

        // 1. To open url in browser
        driver.get("https://www.minted.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        WebElement emailField = driver.findElement(By.xpath("//input[@id = 'bx-element-1303201-Gu64Msv-input']"));


        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys("Test@gmail.com");
    }
}
