package com.rest.project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getUsingBDD {
	@Test
	
	public void getProjects() {
		when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
		
	}

}
