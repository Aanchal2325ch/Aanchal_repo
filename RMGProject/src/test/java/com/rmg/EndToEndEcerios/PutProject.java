package com.rmg.EndToEndEcerios;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.sql.SQLException;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmg.GenericUtilities.DataBaseUtilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutProject {
	@Test
	/**
	 * modify data
	 * @throws SQLException 
	 */
	public void modify() throws SQLException {
	String project_name="sdet";
	  
	   JSONObject obj = new JSONObject();
	   obj.put("createdBy","aanchal_automation");
	   obj.put("projectName", "sdet");
	   obj.put("status","completed");
	   obj.put("teamSize",30);
	   
	   given()
	   .contentType(ContentType.JSON)
	   .body(obj)
	   .when()
	   .put("http://localhost:8084/projects/TY_PROJ_1002");
	   
	   
	   Response response = when().get("http://localhost:8084/projects");
	   List<String> list = response.jsonPath().get("projectName");
	   for (String actualData : list) {
		   if (project_name.equalsIgnoreCase(actualData)) {
			   System.out.println(actualData);
			   break;
			
		}
		
	}
	   //jdbc codes
	   DataBaseUtilities db=new DataBaseUtilities();
	   db.connectDB();
	  String query="select * from project;";
	   String actualValueDb = db.executeQueryAndGetData(query,4,project_name);
	   System.out.println(actualValueDb);
	   Assert.assertEquals(project_name,actualValueDb);
}

}



