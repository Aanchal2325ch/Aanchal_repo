package com.rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunParameters {
	@Parameters("uri")
	@Test
	public void runParameters() {
		String uri=System.getProperty("uri");
		System.out.println(uri);
	
	}

}
