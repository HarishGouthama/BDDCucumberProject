package com.rameshsoft.automation.steppdefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsService {
	
	private RemoteWebDriver driver;
	
	@Before
	public void beforeTCExecution()
	{
		System.out.println("Before Executing Test Case");
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\BDDCucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(9 , TimeUnit.SECONDS);
	}
		
	@After
	public void afterTCExecution()
	{
		driver.close();
		System.out.println("After Executing Test Case");
	}
	
	@Given("^User is in home page$")
	public void User_is_in_home_page()
	{		
		driver.get("https://www.gmail.com");
	}
	
	@When("i enter UN {string} and PWD {string}")
	public void i_enter_UN_and_PWD(String userName , String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
	}
	
	@And("when i click on login button")
	public void when_i_click_on_login_button()
	{
		//driver.findElement(By.id("identifierNext")).click();
		//driver.findElement(By.xpath("//*[@id = 'loginbutton']/input[1]")).click();
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
	}
	
	@Then("login page should be opened")
	public void login_page_should_be_opened()
	{
		WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Forgotten password']"));
		Assert.assertNotNull(text);
	}
}
