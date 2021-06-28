package com.rmg.pojoclasses;
import  static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class postUisngJsonFileBdd {
	@Test
	
	public void postJsonFile(){
		File filename=new File("./JsonFile.json");
		given()
		.contentType(ContentType.JSON)
		.body(filename)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();

		
	}

}



