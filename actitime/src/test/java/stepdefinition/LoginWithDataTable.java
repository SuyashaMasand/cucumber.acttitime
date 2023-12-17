package stepdefinition;

import java.util.List;

import io.cucumber.java.en.Given;

public class LoginWithDataTable {
	@Given("User is present in login page wiith username and password")
	public void user_is_present_in_login_page_wiith_username_and_password(io.cucumber.datatable.DataTable d) {
	 List<String> list = d.asList();
	 for(String l:list) {
		 System.out.println(l);
	 }
	   
	}


}
