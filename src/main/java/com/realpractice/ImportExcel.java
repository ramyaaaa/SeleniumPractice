package com.realpractice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImportExcel {
    @Test
    public void fb() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        File filePath = new File("C:\\Users\\ramya\\OneDrive\\Desktop\\test.xlsx");
        FileInputStream stream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        //XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFSheet sheet = workbook.getSheetAt(0);
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
        driver.findElement(By.name("lastname")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
        driver.findElement(By.name("reg_email__")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
       driver.findElement(By.id("password_step_input")).sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
        WebElement monthElement = driver.findElement(By.id("month"));
        Select monthDropdown = new Select(monthElement);
        List<WebElement> noofMonths = monthDropdown.getOptions();
        for (WebElement option : noofMonths)
        {
            System.out.println(option.getText());
        }
        monthDropdown.selectByIndex(0);


    }
}
