package com.rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Get {
	@Test
	public void get() {
		when()
		.get("http://localhost:8080/api/users/2")
		.then()
		.and().log().all();
		
	}

}
