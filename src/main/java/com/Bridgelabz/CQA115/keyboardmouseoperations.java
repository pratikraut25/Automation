package com.Bridgelabz.CQA115;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class keyboardmouseoperations {
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        Robot Chitti = new Robot();

        Chitti.mouseMove(400,300);

        Chitti.keyPress(KeyEvent.VK_ALT);

        Chitti.keyPress(KeyEvent.VK_F);

        Chitti.keyRelease(KeyEvent.VK_F);

        Chitti.keyRelease(KeyEvent.VK_ALT);

        Thread.sleep(3000);

        Chitti.keyPress(KeyEvent.VK_W);

        Chitti.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);

        driver.quit();
      //  driver.close();



    }
}
