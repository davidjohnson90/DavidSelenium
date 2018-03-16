package com.david.selenium.selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectListTest {

    WebDriver driver;


    @BeforeClass
    public void initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSelectList() {
        driver.get("https://github.com/davidjohnson90?tab=repositories");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement value = driver.findElement(By.linkText("DavidSelenium"));
        value.click();
//        Select listLanguage = new Select(driver.findElement(By.partialLinkText("Language")));
//        System.out.println(listLanguage);
    }
}
