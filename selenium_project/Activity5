package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm"); 
    }

    @Test
    public void Test() {
        WebElement username = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"bigbutton\"]"));
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        login.click();
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"ajaxHeader\"]/nav/div"));
        System.out.println(menu.getCssValue("color"));
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
