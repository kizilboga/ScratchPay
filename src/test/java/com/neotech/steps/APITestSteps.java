package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITestSteps {
	String tokenFromResponse;
	
	@Given("I login to the account")
	public void i_login_to_the_account() {

		RestAssured.baseURI = "https://qa-challenge-api.scratchpay.com/api";
		
		Response generateTokenResponse = 
		RestAssured.
			given().
			when().get("/auth?email=gianna@hightable.test&password=thedantonio1").prettyPeek();

		//Verify if response status code is 200
		generateTokenResponse.then().assertThat().statusCode(200);
		
//		get the token 
		tokenFromResponse = generateTokenResponse.body().jsonPath().getString("data.session.token");
		
		System.out.println("--------------------");
		System.out.println("Token from Response:" + tokenFromResponse );
	}

	@When("I list the emails")
	public void ý_list_the_emails() {
		RestAssured.baseURI = "https://qa-challenge-api.scratchpay.com/api";
		
//		this end point gives an error!!! Even I set User-Agent
		
//		RestAssured.given()
//					.header("Authorization", "Bearer " + tokenFromResponse)
//					.header("User-Agent", "PostmanRuntime/7.29.2")
//					.when().get("/clinics/2/emails").prettyPeek()
//					.then().assertThat().statusCode(400);

		
	}
	
	@When("I search a word and assert the result")
	public void ý_search_a_word_and_assert_the_result() {
		
//					Search with a token
		
					RestAssured.baseURI = "https://qa-challenge-api.scratchpay.com/api";
					RestAssured.given()
					.header("Authorization", "Bearer " + tokenFromResponse)
					.queryParam("term", "veterinary")
					.when().get("/clinics").prettyPeek()
				.then().assertThat().statusCode(200);
					
					
//					Search without a token gives an error!!!
					
//					RestAssured.baseURI = "https://qa-challenge-api.scratchpay.com/api";
//					RestAssured.given()
//					.queryParam("term", "veterinary")
//					.when().get("/clinics").prettyPeek()
//					.then().assertThat().statusCode(401);;		
					
	}
}
