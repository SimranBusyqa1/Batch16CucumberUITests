package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLoginSteps {
	
	WebDriver driver;
	
	@Given("I launch Chrome browser")
	public void i_launch_chrome_browser() {
	    
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe\\");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("I open OrangeHRM home page")
	public void i_open_orange_hrm_home_page() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   Thread.sleep(1000);
	}

	@Then("I verify that the logo is present on the page")
	public void i_verify_that_the_logo_is_present_on_the_page() throws InterruptedException {
		Boolean status = driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
        Assert.assertEquals(true,status);  // assertEquals(expected, actual)
        Thread.sleep(1000);
	}

	@Then("Close browser")
	public void close_browser() {
	    
		driver.close();
	}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("User must successfully login to the Dashboard page")
	public void user_must_successfully_login_to_the_dashboard_page() {
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
        Assert.assertEquals("Dashboard", text);
	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
	   
	}

}
