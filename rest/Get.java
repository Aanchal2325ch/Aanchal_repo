package com.rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Get {
	@Test
	public void get() {
		when()
		.get("https://reqres.in/api/users/2")
		.then()
		.and().log().all();
		
	}

}
