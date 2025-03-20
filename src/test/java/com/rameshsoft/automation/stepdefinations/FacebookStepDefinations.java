


package com.rameshsoft.automation.stepdefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDefinations {
	
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
	
	

	@Given("we are in FB Home page")
	public void we_are_in_fb_home_page() {
		driver.get("https://www.facebook.com");
	}
	
	@When("i enter UN <userName> and password <pwd>")
	public void i_enter_un_rameshsoft_and_password_practice(String userName , String pwd) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(userName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys(pwd);

	}
	
	 @And("when i click on login button")
	    public void when_i_click_on_login_button() {
	        driver.findElement(By.xpath("//button[@name = 'login']")).click();
	    }
	 
	 @Then("it should open page")
	    public void it_should_open_page() {
	        WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Forgotten password')]"));
	        Assert.assertNotNull(text, "Login page validation failed!");
	    }
}


	
	/*@Given("^we_are_in_FB_Home_page$")
	public void User_is_in_home_page()
	{		
		driver.get("https://www.facebook.com");
	}
	
	@When("i_enter_UN_<username>_and_password_<pwd>")
	public void i_enter_UN_and_PWD(String userName , String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
	}
	
	@Then("it_should_open_page")
	public void when_i_click_on_login_button()
	{
		//driver.findElement(By.xpath("//*[@id = 'loginbutton']/input[1]")).click();
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
	}
	
	@Then("it_should_open_page")
	public void login_page_should_be_opened()
	{
		WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Forgotten password']"));
		Assert.assertNotNull(text);
	}
}


package com.rameshsoft.automation.stepdefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStepDefinations {

    private RemoteWebDriver driver;
    private WebDriverWait wait;

    @Before
    public void beforeTCExecution() {
        System.out.println("Before Executing Test Case");
        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\BDDCucumber\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait
    }

    @After
    public void afterTCExecution() {
        if (driver != null) {
            try {
                Thread.sleep(5000); // Keeps browser open for 5 seconds after execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
        System.out.println("After Executing Test Case");
    }

    @Given("we are in FB Home page")
    public void we_are_in_fb_home_page() {
    	//System.out.println("Before Executing Test Case");
        System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\BDDCucumber\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait        
    	driver.get("https://www.facebook.com");
    }
       

    @When("i enter UN {string} and password {string}")
    public void i_enter_un_and_password(String username, String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys(pwd);
    }

    @And("when i click on login button")
    public void when_i_click_on_login_button() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();
    }

    @Then("it should open page")
    public void it_should_open_page() {
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[contains(text(), 'Forgotten password')]")));
        Assert.assertNotNull(text, "Login page validation failed!");
        driver.quit();
    }
}
*/