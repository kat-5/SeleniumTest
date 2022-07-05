package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver(); //this launches the browser
        driver.get("http://www.facebook.com");
        //WebDriver driver2= new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.navigate().back();
        driver.navigate().forward(); //method chaining
        Thread.sleep(2000); //= 2 seconds    add exception to method signature
        driver.navigate().refresh();

        //will close current tab
        driver.close();

        //will quit the whole browser
       driver.quit();
    }

}
