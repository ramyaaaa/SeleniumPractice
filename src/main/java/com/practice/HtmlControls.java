package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlControls {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(1000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(1000);
        WebElement hindick = driver.findElement(By.id("hindichbx"));
        hindick.click(); //check
        Thread.sleep(1000);
        if (hindick.isSelected())
            hindick.click(); //uncheck
            Thread.sleep(1000);
            driver.findElement(By.id("registerbtn")).click();
            System.out.println(driver.findElement(By.id("msg")).getText()); //to get label text
            Thread.sleep(1000);
            driver.findElement(By.linkText("Click here to navigate to the home page")).click();
    }
}
