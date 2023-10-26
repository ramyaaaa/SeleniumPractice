package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("Ramya");
        Thread.sleep(5000);
        driver.switchTo().frame("frm1");
        driver.findElement(By.id("course"));
        Select coursesel = new Select(driver.findElement(By.id("course")));
        coursesel.selectByIndex(1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("Ramyasree");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("name")).sendKeys("Hi Ramya");
    }
}
