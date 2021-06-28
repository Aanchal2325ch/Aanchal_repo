package com.rest.project;



import  static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class CreateObjectJsonFile {
	@Test
	
	public void postJsonFile(){
		File filename=new File("./JsonFile.json");
		RequestSpecification reqspc = RestAssured.given();
		reqspc.contentType(ContentType.JSON);
		reqspc.body(filename);
		
		Response resp = reqspc.post("http://localhost:8084/addProject");
	    ValidatableResponse vresp = resp.then();
	    vresp.statusCode(201);
	    vresp.contentType("application/json");
	    vresp.log().all();
		
		
	}

}
