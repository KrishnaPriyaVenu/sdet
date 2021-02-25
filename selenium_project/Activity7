package Seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver = new FirefoxDriver();
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	@BeforeMethod
	public void beforMethod() {
		
		driver.get("https://alchemy.hguy.co/crm/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test()
	public void Test() {
		WebElement usernameField = driver.findElement(By.id("user_name"));
		WebElement passwordField = driver.findElement(By.id("username_password"));
		usernameField.sendKeys("admin");
		passwordField.sendKeys("pa$$w0rd");

		driver.findElement(By.id("bigbutton")).click();
		Reporter.log("login button clicked");


		String dashboardText = driver.findElement(By.id("tab0")).getText();
		Assert.assertEquals(dashboardText, "SUITECRM DASHBOARD");
		Reporter.log("Logged in to home page");
		
		WebElement salesItem = driver.findElement(By.id("grouptab_0"));
		
		actions.moveToElement(salesItem).build().perform();
		Reporter.log("Cursor hovered |");
		
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		Reporter.log("Leads found and clicked |");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[@class='oddListRowS1']/td[10]/span")));
		Reporter.log("Additional information icon is visible |");
		
		driver.findElement(By.xpath("//table/tbody/tr[@class='oddListRowS1']/td[10]/span")).click();
		Reporter.log("Clicked on addition information icon |");
		
		String phone = driver.findElement(By.xpath("//div[contains(@id,'ui-id-')]/span[@class='phone']")).getText();
		Reporter.log("Phone number is: " + phone + " |", true);

	}


	@AfterClass
	public void afterMethod() {
		//close browser
		driver.close();
	}

}
