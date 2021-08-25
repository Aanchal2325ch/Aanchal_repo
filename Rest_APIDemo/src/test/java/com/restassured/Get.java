package com.restassured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Get {
	@Test
	
	public void getAll() {
		when()
		.get("https://reqres.in/api/users/2"")
		.then()
		.and()
		.log().all();
		

}
}
