package com.rmg.crud;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getProjectsUsingBDD {

		@Test
		public void getAllProjectTest(){
			//Response resp=RestAssured.get("http://localhost:8084/projects");
           when()    //actual result or can use given
           .get("http://localhost:8084/projects") // giving address
           .then()    //to store response
           .log().all()
           .assertThat().statusCode(200)
           .and()
           .assertThat().contentType(ContentType.JSON);
           
          
}
}