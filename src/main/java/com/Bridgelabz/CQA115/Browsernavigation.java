package com.Bridgelabz.CQA115;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.instagram.com/accounts/login/");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        driver.close();
        driver.quit();
    }
}