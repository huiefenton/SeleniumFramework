package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class SeleniumBasicCommand {
    public static void main(String[] args) {

        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver");
        //open the browser
        ChromeDriver driver = new ChromeDriver();

        //1. To open url in browser
       // driver.get("https://www.google.com");
        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("TV");

        String text = searchBox.getAttribute("placeholder");
        System.out.println(text);

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        WebElement footerText = driver.findElement(By.id("td[@class= 'gf-legal']"));
        System.out.println(footerText.getText());


        ;





        // Maximize

//        driver.manage().window().maximize();
//
//        driver.manage().deleteAllCookies();
//
//        // Close the browser
//        driver.close();

    }
}
