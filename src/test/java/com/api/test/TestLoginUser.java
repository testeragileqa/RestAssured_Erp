package com.api.test;

import com.api.base.AuthServiceUser;
import com.api.request.LoginRequestUser;
import com.api.response.LoginResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestLoginUser {

	
	@Test
	public void loginTestUser()
	{
		
		LoginRequestUser loginrequestuser = new LoginRequestUser("ssafa19666","ssafa19666");
		AuthServiceUser authuser = new AuthServiceUser();
		Response response = authuser.login(loginrequestuser);
        System.out.println(response.asPrettyString());
 
	    LoginResponse loginresp= response.as(LoginResponse.class);
        System.out.println(loginresp.getToken());
        System.out.println(loginresp.getEmail());
	    Assert.assertEquals(response.getStatusCode(), 200);

	    Assert.assertTrue(loginresp.getToken() != null );
	    Assert.assertTrue(loginresp.getEmail() != null );


		
	}
}
