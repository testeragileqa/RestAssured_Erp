package com.api.test;

import com.api.base.AuthServiceUser;
import com.api.base.ProfileManagementUser;
import com.api.request.LoginRequestUser;
import com.api.response.LoginResponse;
import com.api.response.ProfileResponse;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestGetProfileRequest {

	@Test
	public void getProfileInfo() {
		
	 
  
      
		AuthServiceUser authservice = new AuthServiceUser();
		LoginRequestUser loginrequestuser = new LoginRequestUser("ssafa19666", "ssafa19666");
		Response response = authservice.login(loginrequestuser);
		
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());

		ProfileManagementUser profilemanag = new ProfileManagementUser();
		Response responseee = profilemanag.getProfile(loginresponse.getToken());
		System.out.println(responseee.asPrettyString());
		
		ProfileResponse profileresponse = responseee.as(ProfileResponse.class);
		System.out.println(profileresponse.getUsername());
		
	}

}
