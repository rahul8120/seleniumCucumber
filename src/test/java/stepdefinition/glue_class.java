package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*; //en.Given -->change to--> en.*= all gherkin imported
import junit.framework.Assert;

public class glue_class 
{
WebDriver driver;
	
	@Given("user reached to login page")
	public void user_reached_to_login_page() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Jadhav\\Downloads\\01 Velocity Testing notes\\Selenium app\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
		
	}

	@And("click on login")
	public void click_on_login() 
	{
	
		driver.findElement(By.xpath("//button[@id='submit']")).click();	
	}

	@Then("verify successful login message")
	public void verify_successful_login_message() 
	{
//verify message		
		String actual_msg=driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
			System.out.println(actual_msg);
		String exp_msg="Logged In Successfully";
		
		Assert.assertEquals(exp_msg, actual_msg);
	}
	@And("click logout")
	public void logout()
	{
		driver.findElement(By.xpath("//a[@style='color:#ffffff']")).click(); //logout
	}
	
}
