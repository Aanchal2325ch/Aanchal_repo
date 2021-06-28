package com.rest.project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {
	@Test
	
	public void getAll() {
		
		Response response = RestAssured.get("http://localhost:8084/projects");
	    System.out.println(response.asString());
	    response.prettyPrint();
	    response.then().log().all();
	}

}
