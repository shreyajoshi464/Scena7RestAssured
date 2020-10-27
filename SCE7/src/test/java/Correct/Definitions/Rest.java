package Correct.Definitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Rest {
	Response response;

	
	@Test
	@Given ("API foreign Exchange")
	public void api_foreign_exchange(){
		RestAssured.baseURI = "https://ratesapi.io";
	}
	@Test
	@When("posted with future date information")
	public void posted_with_future_date_information(){
		response = RestAssured.get("/api/latest");
		
	}
	@Test
	@Then(" validate positive response code received")
	public void  validate_positive_response_code_received(){
		int statusCode=response.getStatusCode();
		Assert.assertFalse(statusCode==200);
		Assert.assertNotEquals(statusCode,200);
		Assert.assertNotNull(statusCode);
		System.out.println("Response Code:"+statusCode);
	}
}
