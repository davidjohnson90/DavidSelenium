package com.david.selenium.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollTest {
    WebDriver driver;


    @BeforeClass
    public void initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void ByVisibleElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    @AfterClass
    public void destroy() {
        driver.quit();
    }
}
