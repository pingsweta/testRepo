package com.trimble.testing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class CucumberTest {

	Response resp;
	
	@Given("launching Google")
	public void launchingGoogle() {
		// TODO Auto-generated method stub

		System.out.println("Test");
		resp = RestAssured.given().when().get("http://www.google.co.in/");
	}
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expectedStatusCd) {

		int i = resp.statusCode();
		Assert.assertTrue(expectedStatusCd==i);
		System.out.println("Code = " + i);

	}

}