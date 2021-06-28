package com.rest.project;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import  static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateObjectVisHashMap {
	
	@Test
	public void createProject() {
		HashMap map=new HashMap();
		map.put("createdBy","saroj");
		map.put("status","ongoing");
		
		
		RequestSpecification reqspc = RestAssured.given();
		reqspc.contentType(ContentType.JSON);
		reqspc.body(map);
		
		Response resp = reqspc.post("http://localhost:8084/addProject");
	    ValidatableResponse vresp = resp.then();
	    vresp.assertThat().statusCode(201);
	    vresp.assertThat().contentType("application/json");
	    vresp.log().all();
		
		
	}

}
