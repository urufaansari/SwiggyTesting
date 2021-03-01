package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Listeners(ListenerClass.class)
public class LoginDefinitions {

	
//	DriverClass getDriver = new DriverClass();
//	WebDriver driver = getDriver.setup();
	
	@Given("^I have registered on the swiggy application$")
	public void i_have_registered_on_the_swiggy_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I have registered on the swiggy application");
	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
//		driver.findElement(By.className("_2CgXb")).click();
		System.out.println("I am on the login page");
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("mobile")).sendKeys("8369708248");
		System.out.println("I enter valid credentials");
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on submit");
	}

	@Then("^I am able to login successfully$")
	public void i_am_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am able to login successfully");
	}

	@Given("^I am not registered on the application$")
	public void i_am_not_registered_on_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am not registered on the application");
	}

	@When("^I enter credentials$")
	public void i_enter_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter credentials");
	}

	@Then("^I am not able to login$")
	public void i_am_not_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am not able to login");
	}

	@When("^I enter invalid credentials$")
	public void i_enter_invalid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter invalid credentials");
	}
	
	
	
}
