package com.Bridgelabz.CQA115;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSignup{
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");

            driver.findElement(By.linkText("Create new account")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input#u_f_b_wk")).sendKeys("Pratik");

            Thread.sleep(2000);

            driver.close();
            driver.findElement(By.name("lastname")).sendKeys("Raut");

            Thread.sleep(2000);

            driver.findElement(By.name("reg_email__")).sendKeys("pratikraut2512@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pratikraut2512@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.name("reg_passwd__")).sendKeys("oiuyted785");

            Thread.sleep(2000);

            driver.findElement(By.id("day")).sendKeys("25");

            Thread.sleep(2000);

            driver.findElement(By.id("month")).sendKeys("Dec");

            Thread.sleep(2000);

            driver.findElement(By.id("year")).sendKeys("1999");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

            Thread.sleep(2000);

            driver.findElement(By.name("websubmit")).click();

            driver.close();
        }
}