package practice.com.complexvalidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;


/*
 * validate the first projectName
 */
public class ValidateResponseBody {
	@Test
	
	public void getAllProjectValidateStaticResponse() {
		String expectedProjectName="sdetFirstApi";
		Response resp = when()
		.get("http://localhost:8084/projects");
		
		resp.then()
		.assertThat().statusCode(200)
		.log().all();
		
	 	String actprojectName=resp.jsonPath().get("[3].projectName");
	    System.out.println(actprojectName);
	}
	/*
	 * validate any project name is available in dynamic
	 */
	
	
	public void getAllProjectValidateDynamicResponse() {
		
		boolean flag=false;
		String expectedProjectName="sdetFirstApi";
		Response resp = when()
		.get("http://localhost:8084/projects");
		
		resp.then()
		.assertThat().statusCode(200)
		.log().all();
		
	 	List<String> list=resp.jsonPath().get("projectName");
	 	
	    for (String str : list) {
	    	if (expectedProjectName.equals(str)) {
	    		System.out.println(expectedProjectName+"===avilable");
	    		flag=true;
	    		break;
				
			}
			
		}
	    Assert.assertEquals(flag,true);
	}

}
