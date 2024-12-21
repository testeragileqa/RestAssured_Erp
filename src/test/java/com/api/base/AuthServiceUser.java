package com.api.base;

import java.util.HashMap;

import com.api.request.LoginRequestUser;
import com.api.request.SignUpRequestUser;

import io.restassured.response.Response;

public class AuthServiceUser extends BaseService{
	
	
	private static final String PATH_BASE="/api/auth/";
 
	public Response login(LoginRequestUser poyload)
	{
 		return postRequest(poyload, PATH_BASE+"login");
	}
	
	public Response signUp(SignUpRequestUser poyload)
	{
 		return postRequest(poyload, PATH_BASE+"signup");
	}
	
	public Response forgetPassword(String emailaddresse)
	{
		HashMap<String,String> poyload = new HashMap<String,String>();
		poyload.put("email", emailaddresse);
 		return postRequest(poyload, PATH_BASE+"reset-password");
	}
}
