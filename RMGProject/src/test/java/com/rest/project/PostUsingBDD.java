package com.rest.project;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class PostUsingBDD {
	
	@Test
	public void post() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","vishkha");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj.toJSONString())
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
	}

}
