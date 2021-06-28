package com.rmg.authentication;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DigestAuthentication {
	@Test
	public void baiscAuthTest() {
		given()
		.contentType(ContentType.JSON)
		.auth().digest("rmgyantra","rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log().all();
		
	}
	
	

}

 


