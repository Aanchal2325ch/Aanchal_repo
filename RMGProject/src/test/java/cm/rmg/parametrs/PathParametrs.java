package cm.rmg.parametrs;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class PathParametrs {
	@Test
	
	public void gitHubPathParam() {
		List<String> username=new ArrayList<String>();
		username.add("Aanchal2325ch");
		for(String usernames:username)
		given()
		.contentType(ContentType.JSON)
		.pathParam("username",usernames)
		.when()
		.get("http://api.github.com/users/{username}/repos")
		.then()
		.log().all();
		
		
		
	}

}
