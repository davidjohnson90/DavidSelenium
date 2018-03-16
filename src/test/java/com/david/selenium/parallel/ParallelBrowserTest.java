package com.david.selenium.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelBrowserTest {
    @Test
    public void executSessionOne() throws InterruptedException {
        System.out.println("Thread Id 1:- " + Thread.currentThread().getId());
        //First session of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Goto arun david site
        driver.get("https://arundavidjohnson.blogspot.in/");
        //find user name text box and fill it
        driver.findElement(By.className("form-input")).sendKeys("Driver 1");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void executeSessionTwo() throws InterruptedException {
        System.out.println("Thread Id 2:- " + Thread.currentThread().getId());
        //Second session of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Goto arun david site
        driver.get("https://arundavidjohnson.blogspot.in/");
        //find user name text box and fill it
        driver.findElement(By.className("form-input")).sendKeys("Driver 2");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void executSessionThree() throws InterruptedException {
        System.out.println("Thread Id 3:- " + Thread.currentThread().getId());
        //Third session of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Goto arun david site
        driver.get("https://arundavidjohnson.blogspot.in/");
        //find user name text box and fill it
        driver.findElement(By.className("form-input")).sendKeys("Driver 3");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }
}
