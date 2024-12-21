package com.api.test;

import com.api.base.AuthServiceUser;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestForgetPassword {
	
	@Test 
public void forgetPassword()
{
	AuthServiceUser authenservice = new AuthServiceUser();
	Response response = authenservice.forgetPassword("test1111@yopmail.com");
	System.out.println(response.asPrettyString());
	
}
}
