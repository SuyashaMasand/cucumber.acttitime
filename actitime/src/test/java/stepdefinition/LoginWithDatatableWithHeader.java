package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDatatableWithHeader {
	
	@Given("user is present in actitime application")
	public void user_is_present_in_actitime_application() {
	    
	}

	@When("user will enter url, username and password")
	public void user_will_enter_url_username_and_password(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> list = d.asMaps();
	   for(int i =0;i<list.size();i++) {
		    System.out.println(list.get(i).get("url"));   
		    System.out.println(list.get(i).get("username"));  
		    System.out.println(list.get(i).get("password"));  
		   
	   }
	}

	@Then("login page will be displayed")
	public void login_page_will_be_displayed() {
	    
	}

}
