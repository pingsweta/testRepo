package com.trimble.circuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class CircuitData {

	Response resp;
	
	@Given("User hits the F1 data")
	public void User_hits_the_F1_data(){
		resp = RestAssured.given().relaxedHTTPSValidation().
							when().get("https://ergast.com/api/f1/2017/circuits.json");
	
	
	
	}
	
	@Given("user gets the data")
	public void User_gets_the_data(){
		
		//print response in string
		String respString = resp.asString();
		System.out.println(respString);
		
		//get all headers
		Headers heds = resp.getHeaders();
		System.out.println(heds);
	}

	@Then("get size of JSON file")
	public void get_size_of_JSON_file(){
		
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);
		
		System.out.println("limitValue = " + limitValue);
		
		//verify the size
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}
	
	
	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String path, String expValue){
		System.out.println("Path = " + path);
		System.out.println("ExpPath = " + expValue);
		String actualCircuitValue = resp.getBody().jsonPath().getString(path);
		System.out.println("actualCircuitValue = " + actualCircuitValue);
		Assert.assertEquals(expValue, actualCircuitValue);
		
		
	}
}
