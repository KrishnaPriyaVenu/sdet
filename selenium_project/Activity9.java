package Seleniumproject;
import java.util.List;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforMethod() {
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
	}


	@Test()
	public void leadsTableTestCase() {
		WebElement usernameField = driver.findElement(By.id("user_name"));
		WebElement passwordField = driver.findElement(By.id("username_password"));
		usernameField.sendKeys("admin");
		passwordField.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();

		String dashboardText = driver.findElement(By.id("tab0")).getText();
		Assert.assertEquals(dashboardText, "SUITECRM DASHBOARD");
		
		WebElement salesItem = driver.findElement(By.id("grouptab_0"));

		actions.moveToElement(salesItem).build().perform();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("list-view-rounded-corners")));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr"));
		String name;
		String user;
		for(int i = 1; i<=rows.size(); i++) {
			name = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr["+i+"]/td[3]")).getText();
			user = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr["+i+"]/td[8]")).getText();
			
			Reporter.log("name: "+name+"\tuser: "+user+" |", false);
		}
	}


	@AfterClass
	public void afterClass() {
		//close browser
		driver.close();
	}

}
