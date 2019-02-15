package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	public static final void setWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mykol\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	WebDriver driver = null;
	@Given("^User is on store\\.demoqa\\.com$")
	public void user_is_on_store_demoqa_com() throws Throwable {
	    setWebDriver();
	    driver = new ChromeDriver();
		driver.get("http://store.demoqa.com");
	}

	@When("^User clicks on my account link$")
	public void user_clicks_on_my_account_link() throws Throwable {
		WebElement MyAccountLink = driver.findElement(By.className("account_icon"));
		MyAccountLink.click();
	}
	
	@And("^User logs in using valid username and password$")
	public void user_logs_in_using_valid_username_and_password() throws Throwable {
		WebElement usernameField = driver.findElement(By.id("log"));
		usernameField.sendKeys("LearnCucmber");
		
		WebElement passwordField = driver.findElement(By.id("pwd"));
		passwordField.sendKeys("TestPassword123@");
		
		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();

	}

	@Then("^User is taken to myaccount page$")
	public void user_is_taken_to_myaccount_page() throws Throwable {

	}
}





