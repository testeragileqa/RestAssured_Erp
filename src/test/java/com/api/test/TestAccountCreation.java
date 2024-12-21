package com.api.test;

import com.api.base.AuthServiceUser;
import com.api.request.SignUpRequestUser;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
 
public class TestAccountCreation {
	
	@Test
	public void createAccount()
	{
		
		
		SignUpRequestUser signup = new SignUpRequestUser.Builder()
		.userName("ahmed1111")
		.email("test1111@yopmail.com")
		.lastName("ahmed11")
		.firstName("ahmed11")
		.password("12345689")
		.mobileNumber("1234567999").build();
		
		AuthServiceUser authenservice = new AuthServiceUser();
		Response response = authenservice.signUp(signup);
		System.out.println(response.asPrettyString());
	    Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	    Assert.assertEquals(response.statusCode(), 200);
	
	}

}
