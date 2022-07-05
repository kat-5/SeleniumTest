package com.syntax.class01.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
   /* navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https:www.fb.com");
       // driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Luna");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Sole");
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("lunasole@gmail.com");
        Thread.sleep(2000);
        WebElement emailConfirm=driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirm.sendKeys("lunasole@gmail.com");
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("Blablabla");
        WebElement birthdayMonth=driver.findElement(By.id("month"));
        birthdayMonth.sendKeys("01");
        WebElement birthdayDay=driver.findElement(By.id("day"));
        birthdayDay.sendKeys("23");
        WebElement birthdayYear=driver.findElement(By.id("year"));
        birthdayYear.sendKeys("2000");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        //driver.findElement(By.className("_8idr img")).click();
        driver.close();

    }
}
