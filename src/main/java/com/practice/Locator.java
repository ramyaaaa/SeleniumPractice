package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locator {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.name("login")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.id("password")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.className("header-logo")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.linkText("Forgot password?")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.partialLinkText("Create an")));
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.tagName("h1")));
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.cssSelector("input[name='commit']")));


    }
        public static void highlight(WebDriver driver, WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        }

}
