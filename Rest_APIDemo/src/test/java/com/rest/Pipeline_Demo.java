package com.rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Pipeline_Demo {
	@Test
	public void get() {
		when()
		.get("https://reqres.in/api/unknown")
		.then()
		.and().log().all();
		
	}



}
