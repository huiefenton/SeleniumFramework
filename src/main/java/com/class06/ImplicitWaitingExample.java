package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitingExample {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // Selenium Version < 4 - Syntax is
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Selenium Version >= 4 - Syntax is
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.manage().window().maximize();

        WebElement startBtn = driver.findElement(By.xpath("//div[@id='start']/button"));
        startBtn.click();

        // Option 1 - Static wait - Not recommended
        // Thread.sleep(5000);

        WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());

    }
}
