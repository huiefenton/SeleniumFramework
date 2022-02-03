package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeInClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());

    }
}
