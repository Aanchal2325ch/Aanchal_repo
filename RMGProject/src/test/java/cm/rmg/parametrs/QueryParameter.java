package cm.rmg.parametrs;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	
	public void queryPara() {
		// 
		given()
		.contentType(ContentType.JSON)
		.queryParam("q","Aanchal_repo")
		.when()
		.get("https://api.github.com/search/repositories")
		.then()
		.log().all();
		
	}

}
