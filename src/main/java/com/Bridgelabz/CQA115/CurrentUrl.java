package com.Bridgelabz.CQA115;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ("https://www.javatpoint.com/");
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }
    }
}
