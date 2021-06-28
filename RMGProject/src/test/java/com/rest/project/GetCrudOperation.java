package com.rest.project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetCrudOperation {
	@Test
	public void getAllProjects() {
		Response resp = RestAssured.get("http://localhost:8084/projects");
        //resp.prettyPrint();
		System.out.println(resp.statusCode());
		
		System.out.println(resp.contentType());
        ValidatableResponse respVal = resp.then();
        respVal.assertThat().statusCode(200);
        respVal.assertThat().contentType(ContentType.JSON);
        respVal.log().all();
        
	}

}
