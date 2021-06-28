package practice.com.complexvalidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class CaptureAllRepoNameFromGit {
	@Test
	
	public void captureAllRepoTest() {
		
		Response resp=given()
		     .pathParam("gitUser","Aanchal2325ch")
		      .auth().oauth2("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")
		.when()
		.get("https://api.github.com/users/{gitUser}/repos?sort=created&per_page=100");
		
		List<String> lst=resp.jsonPath().get("name");
		for (String str : lst) {
			System.out.println(str);
			System.out.println();
			
		}
	}

}
