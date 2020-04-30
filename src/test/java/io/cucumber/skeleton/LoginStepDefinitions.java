package io.cucumber.skeleton;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	@Given("User open the web page") 
	public void user_open_the_web_page() {
        System.out.println("open web page");
    }
    @When("user input {string} and {string}")
    public void user_input_email_and_password(String email, String password) {
        System.out.println("input " + email + " dan " + password);
    }
    @Then("user see the dashboard")
    public void user_see_the_dashboard() {
        System.out.println("user see the dashboard");
    }

}
