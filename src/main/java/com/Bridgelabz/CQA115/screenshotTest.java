package com.Bridgelabz.CQA115;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class screenshotTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("./Screenshot/"+ System.currentTimeMillis() + "screenshot.png");

        try {
            FileHandler.copy(sourcefile,destinationfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
