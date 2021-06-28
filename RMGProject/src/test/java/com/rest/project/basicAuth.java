package com.rest.project;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class basicAuth {
	@Test
	
	public void basicOuath() {
	   given()
	   .contentType(ContentType.JSON)
	   .auth().basic("rmgyantra","rmgy@9999")
	   .when()
	   .get("http://localhost:8084/login")
	   .then()
	   .log().all();
	   
	}

}
