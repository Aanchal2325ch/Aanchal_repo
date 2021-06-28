package com.rest.project;

import org.testng.annotations.Test;

import com.rmg.pojoclasses.Project;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostPojoClass {
	@Test
	
	public void createProject() {
		Project pojoObj=new Project("rohan","sbi","Completed",20);
		RequestSpecification reqspc = RestAssured.given();
		reqspc.contentType(ContentType.JSON);
		reqspc.body(pojoObj);
		
		Response resp = reqspc.post("http://localhost:8084/addProject");
	    ValidatableResponse vresp = resp.then();
	    vresp.assertThat().statusCode(201);
	    vresp.assertThat().contentType("application/json");
	    vresp.log().all();
		
	}

}
