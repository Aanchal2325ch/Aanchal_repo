package com.rmg.crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PatchProject {
	@Test
	public void patch() {
		
		
		JSONObject jsobject=new JSONObject();
		jsobject.put("createdBy","jonny");
		jsobject.put("createdOn","jan");
	
		given()
		.contentType(ContentType.JSON)
		.body(jsobject.toJSONString())
		.when()
		.patch("http://localhost:8084/projects/TY_PROJ_204")
		.then()
		
		.log().all();
	}

}
