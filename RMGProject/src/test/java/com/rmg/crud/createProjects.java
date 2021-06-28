package com.rmg.crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createProjects {
	@Test
	public void createProject() {
		JSONObject jsobject=new JSONObject();
		jsobject.put("createdBy","rohit");
		jsobject.put("createdOn","jan");
		jsobject.put("projectName","Rest");
		jsobject.put("status","completed");
		
		//RequestSpecification req = RestAssured.given();
		//req.contentType(ContentType.JSON);
		//req.body(jsobject.toJSONString());
		//Response resp = req.post("http://localhost:8084/addProject");
		//resp.then().log().all();
		given()
		.contentType(ContentType.JSON)
		.body(jsobject.toJSONString())
		.when()
        .post("http://localhost:8084/addProject")
        .then()
        .log().all();
		
	}

}
