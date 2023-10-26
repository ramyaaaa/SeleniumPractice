package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameThreeHandling {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("Ramya");
        Thread.sleep(5000);
        driver.switchTo().frame("frm3");
        driver.switchTo().frame("frm1");
        Select courselist = new Select(driver.findElement(By.id("course")));
        courselist.selectByIndex(1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("Ramyasree");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Ramya");


    }
}
