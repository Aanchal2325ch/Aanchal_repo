package com.rmg.authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Ouath2 {
	
	@Test
	
	public void ouath2() {
		Response response=given()
		.formParam("client_id","ButterScoh")
		.formParam("client_secret","fafa01e66b9d71f73d1889dd7eeb422c")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri ","http://example1.com")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		
		
		String  token = response.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.contentType(ContentType.JSON)
		.auth().oauth2(token)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/2005/chickens-feed	")
		.then()
		.log().all();
		
	}

}
