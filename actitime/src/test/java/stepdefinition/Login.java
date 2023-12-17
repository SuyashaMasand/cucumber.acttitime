package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	@Given("user is present in login page")
	public void user_is_present_in_login_page() {
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	   System.out.println("user is present in login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	    System.out.println("user enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	System.out.println("click on login button");
	}

	@Then("home page will be displayed")
	public void home_page_will_be_displayed() {
	   System.out.println("home page will be displayed");
	}



	

}
