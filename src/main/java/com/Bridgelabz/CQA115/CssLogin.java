package com.Bridgelabz.CQA115;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssLogin {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#email.inputtext._55r1")).sendKeys("8109555221");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);


    }
}
