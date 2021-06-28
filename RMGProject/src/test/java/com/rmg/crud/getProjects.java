package com.rmg.crud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getProjects {
	@Test
	public void getAllProjectTest(){
		Response resp=RestAssured.get("http://localhost:8084/projects");
		
		//get Status code
		//System.out.println(resp.getStatusCode());
		
		//get the content type
		//System.out.println(resp.getContentType());
		ValidatableResponse resVal = resp.then();
		resVal.assertThat().statusCode(200);
		resVal.assertThat().contentType(ContentType.JSON);
		resVal.log().all();
		
		
	}

}
