package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBoxes {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement usernameTxt = driver.findElement(By.id("login_field"));
        if (usernameTxt.isDisplayed()) {
            if (usernameTxt.isEnabled()) {
                usernameTxt.sendKeys("ramyasree8999");
                String enteredTxt = usernameTxt.getAttribute("value");
                System.out.println(enteredTxt);
                Thread.sleep(3000);
                usernameTxt.sendKeys("@gmail.com");
                Thread.sleep(3000);
                usernameTxt.clear();
            }
        }else {
                System.err.println("username textbox not enabled");
            }
            System.err.println("username textbox is displayed");

        }
    }

