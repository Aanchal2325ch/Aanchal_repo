package cm.rmg.parametrs;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GitParameter {
	
	@Test
	
	public void sampleTest() {
		given()
		.pathParam("gitUser","qspiderseleniumoar")
		.when()
		.get("https://api.github.com/users/{gitUser}/repos")
		.then()
		.log().all();
	}

}
