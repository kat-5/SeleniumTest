package com.syntax.class01.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    HW
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Lina");
        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Ross");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 Lala Ln");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Atlanta");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Georgia");
        WebElement zip=driver.findElement(By.id("customer.address.zipCode"));
        zip.sendKeys("56743");
        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("7689087656");
        WebElement ssn=driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("555666323");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("Lena123");
        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("Lalalala");
        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("Lalalala");
        driver.findElement(By.className("button")).click();
        driver.close();


    }
}