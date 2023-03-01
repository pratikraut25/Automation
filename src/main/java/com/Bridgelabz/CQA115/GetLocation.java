package com.Bridgelabz.CQA115;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        String title= driver.getTitle();
        System.out.println("The tittle of this page is :"+title);



    }
}
