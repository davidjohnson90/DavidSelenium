package com.david.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DriverTest {

    WebDriver driver;

    @Test
    public void testChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        System.out.println("Test Chrome with Thread Id:- "
                + Thread.currentThread().getId());
//        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    //    @Test
    public void testIEDriver() {
        driver = new InternetExplorerDriver();
//        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    @Test
    public void testFirefoxDriver() {
        System.out.println("Test Firefox with Thread Id:- "
                + Thread.currentThread().getId());
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(true);
        firefoxOptions.addPreference("security.sandbox.content.level", 5);
        driver = new FirefoxDriver(firefoxOptions);
//        driver.manage().window().maximize();
        driver.get("https://arundavidjohnson.blogspot.in/");
    }

    @AfterClass
    public void destroy() {
        driver.quit();
    }
}
