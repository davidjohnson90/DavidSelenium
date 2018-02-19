package com.david.selenium.drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DriverTest {

    WebDriver driver;

    @Test
    public void testChromeDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    @Test(enabled = false)
    public void testIEDriver() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    @Test(enabled = false)
    public void testFirefoxDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    @AfterClass
    public void destroy() {
        driver.quit();
    }
}
