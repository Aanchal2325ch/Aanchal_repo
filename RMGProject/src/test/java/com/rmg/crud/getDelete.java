package com.rmg.crud;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getDelete {
	@Test
	
	public void deleteProject() {
		given()
		
        .delete("http://localhost:8084/projects/TY_PROJ_802")
        .then()
        .log().all();
		
		
	}

}
