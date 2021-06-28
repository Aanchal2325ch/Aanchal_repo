package com.rest.project;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCrud {
	@Test
	public void create() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","vishank");
		 RequestSpecification data = RestAssured.given();
		 data.contentType(ContentType.JSON);
		 data.body(obj.toJSONString());
		 data.post("http://localhost:8084/addProject");
		 data.log().all();
        
	}

}
