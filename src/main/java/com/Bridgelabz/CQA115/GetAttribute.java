package com.Bridgelabz.CQA115;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //find the Keep me Logged in Checkbox
        WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
        // get the tooltip text using getAttribute() method and store in a variable
        String tooltipText = Checkbox.getAttribute("title");
        System.out.println(tooltipText);
        driver.close(); } //Write a script to check
}
