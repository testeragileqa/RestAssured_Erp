package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

 
   public class LoginTest {
	
		
		@Test
		public void loginTest()
		{
			
			RestAssured.baseURI  = "http://64.227.160.186:8080/";
			RequestSpecification request = RestAssured.given().header("Content-Type", "application/json").body("{\"username\": \"ssafa19666\",\"password\": \"ssafa19666\"}");
		    Response response =	request.post("/api/auth/login");
		    System.out.println(response.asPrettyString());
		    
		    Assert.assertEquals(response.getStatusCode(), 200);
		}

}
