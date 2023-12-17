package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDirectly {

	@Given("user is present in login page with url {string}")
	public void user_is_present_in_login_page_with_url(String url) {
	    System.out.println(url);
	}

	@When("he enters username {string} and password {string}")
	public void he_enters_username_and_password(String un, String pwd) {
	   System.out.println(un);
	   System.out.println(pwd);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
	    System.out.println("Click on login button");
	}
}
