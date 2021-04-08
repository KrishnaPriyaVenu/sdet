package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobAct4 {
	
	WebDriver  driver;	
	 WebDriverWait wait;
	

  
    
    @Given("^EUser is on Alchemy Job page$")	
   public void ENavigateJobpage() {
   	try {
		//System.setProperty("webdriver.chrome.driver", ChromePath);
			driver = new ChromeDriver();	
		   wait = new WebDriverWait(driver, 20);
		   driver.manage().window().maximize();	
		   System.out.println("Maximised Window");
		   driver.get("https://alchemy.hguy.co/jobs/");
		   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Jobs']")));
		  
		   
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
   }
	
	
   @When("^EGo to Post a Job page$")
	
   public void EGoToPostJobPage() {
	   try {
		   driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
		   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[@for='create_account_email']")));
		  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }


   @And("^ExampleEnter \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	
   public void EEnterJobDetails(String email, String JobTitle, String Description, String AppURL, String CompanayName) throws Exception {
	   	 try {
	   		JavascriptExecutor js = (JavascriptExecutor) driver;
	   		 driver.findElement(By.id("create_account_email")).sendKeys(email);
	   		driver.findElement(By.id("job_title")).sendKeys(JobTitle);
	  // 		WebElement element = driver.findElement(By.xpath("//*[@id='tinymce']/p"));
	   	//	js.executeScript("arguments[0].scrollIntoView();", element);
	   		Thread.sleep(3000);
	   		js.executeScript("window.scrollBy(0,500)");
	   		driver.switchTo().frame("job_description_ifr");
	   		Thread.sleep(2000);
	   		driver.findElement(By.xpath("//body[@id='tinymce']")).click();
	   		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys(Description);
	        driver.switchTo().defaultContent();
	        Thread.sleep(2000);
	   		driver.findElement(By.id("application")).sendKeys(AppURL);
	   		driver.findElement(By.id("company_name")).sendKeys(CompanayName);
	   		 
	   		
	   		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	 
	   }
   
   

@And("^EClick on Submit$")
	
   public void EClickSubmit() throws Exception {
	
	driver.findElement(By.xpath("//input[@value='Preview']")).click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='job_preview_submit_button']")));
	driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
	   
	
	   }
   
 
   
   @And("^EGo to the Jobs page$")
	
   public void EJobPage() throws Exception {
	   try {
		   
		   System.out.println("Text :"+driver.findElement(By.xpath("//*[@class='entry-content clear']")).getText());
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@class='entry-content clear']/a")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   	 
	   }
   

@Then("^EConfirm job listing is shown on page$")
	
 public void EConfirmJobListing() throws Exception {
	System.out.println("Job Title:"+driver.findElement(By.xpath("//div[@class='ast-single-post-order']/h1")).getText());
	String jobTitle =driver.findElement(By.xpath("//div[@class='ast-single-post-order']/h1")).getText(); 
	Assert.assertEquals("SDET SR Tester", jobTitle);
   }
   
@And("^EGenerate HTML report$")

public void EGenerateHTMLReport() throws Exception {
	   try {
		   
		   System.out.println("Generated HTML Report");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   	 
	   }

  
		
	   

}
