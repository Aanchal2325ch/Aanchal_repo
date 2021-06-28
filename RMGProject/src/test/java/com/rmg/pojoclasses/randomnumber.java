package com.rmg.pojoclasses;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class randomnumber {

	
	@Test
	
	public void postRandom() {
		
		Random random=new Random();
		int randomInt=random.nextInt(2000);
		System.out.println(randomInt);
		
		Project pojoObj=new Project("beena","hdfc"+randomInt,"Completed",20);

		given()
		.contentType(ContentType.JSON)
		.body(pojoObj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all()
		.and()
		.assertThat().statusCode(201);
		
	}
}
