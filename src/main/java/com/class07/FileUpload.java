package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver");
        // Open the browser
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
    }

    @Test
    public void fileUpload(){
        WebElement fileUploadInput = driver.findElement(By.id("file-upload"));
        fileUploadInput.sendKeys("C:\\Users\\khima\\IdeaProjects\\SeleniumFramework\\src\\main\\resources\\data\\fileUpload");

        WebElement fileUploadBtn = driver.findElement(By.id("file-submit"));
        fileUploadBtn.click();
    }

    @Test

    public void Practice1(){
        WebElement fileUploadInput = driver.findElement(By.id("uploadPicture"));
        fileUploadInput.sendKeys("/Users/FentonHuie/IdeaProjects/SeleniumFramework/src/main/resources/data/textSome");

        WebElement fileUploadBtn = driver.findElement(By.id("submit"));
        fileUploadBtn.click();
    }











}
