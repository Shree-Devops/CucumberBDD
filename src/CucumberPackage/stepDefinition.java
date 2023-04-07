package CucumberPackage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	@Given("^user is on login page$")
	public void loginPage() {
		System.out.print("login page");
	}
	@When("^user enters Login Id and password$")
	public void loginDetails() {
		System.out.print("login details");
	}
	@Then("^user clicks on Submit button$")
	public void Submit() {
		System.out.print("Submit");
	}

}
