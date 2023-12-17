package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithExample {
	
	@Given("when user is present in acttitime with url {string}")
	public void when_user_is_present_in_acttitime_with_url(String url) {
		System.out.println(url);
	    
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String un, String pwd) {
		System.out.println(un);
		System.out.println(pwd);
	    
	}

	@Then("user clicks on login, home page will be displayed")
	public void user_clicks_on_login_home_page_will_be_displayed() {
	    
	}




}
