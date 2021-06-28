package cm.rmg.parametrs;

import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
public class RunParameters {
	String baseUri=System.getProperty("uri");
	@Test
	public void runParameterTest() {
		
		//String uri=System.getProperty("uri");
		//System.out.println(uri);
		//String endPoint=System.getProperty("endpoint");
		//System.out.println(endPoint);
		given()
		.baseUri(baseUri)
		.get("/api/users?page=2")
		.then()
		.log().all();
		
	}

}
