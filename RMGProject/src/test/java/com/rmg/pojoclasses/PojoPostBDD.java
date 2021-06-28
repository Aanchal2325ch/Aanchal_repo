package com.rmg.pojoclasses;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PojoPostBDD {

@Test

public void createProject() {
	//JSONObject jsobj=new JSONObject();
	//jsobj.put("createdBy","suman");
	//jsobj.put("createdOn","hdfc");
	Project pojoObj=new Project("rohit","hdfc","Completed",20);

	given()
	.contentType(ContentType.JSON)
	.body(pojoObj)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.log().all()
	.and()
	.assertThat().statusCode(201);
	
}
}
