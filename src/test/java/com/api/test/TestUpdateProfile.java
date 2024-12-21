package com.api.test;

import com.api.base.AuthServiceUser;
import com.api.base.ProfileManagementUser;
import com.api.request.LoginRequestUser;
import com.api.request.UpdateProfileRequest;
import com.api.response.LoginResponse;
import com.api.response.ProfileResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestUpdateProfile {
	
	@Test 
	public void updateProfileTest()
	{
		AuthServiceUser authservice =  new AuthServiceUser();
		LoginRequestUser loginrequest = new LoginRequestUser("ssafa19666", "ssafa19666");
		Response response = authservice.login(loginrequest);
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		//System.out.println(loginresponse.getToken());
		System.out.println("--------------------------------------------");

		
		ProfileManagementUser profilemanagement = new ProfileManagementUser();
		Response responseuser = profilemanagement.getProfile(loginresponse.getToken());
		System.out.println(responseuser.asPrettyString());
		ProfileResponse profileresponse = responseuser.as(ProfileResponse.class);
		Assert.assertEquals(profileresponse.getUsername(), "ssafa19666");
		System.out.println("--------------------------------------------"+ profileresponse.getUsername());

	 
		
		ProfileManagementUser updateprofile = new ProfileManagementUser();
		UpdateProfileRequest updateprofilerequest = new UpdateProfileRequest.Builder()
				.firstName("ssafa19666")
				.lastName("ssafa")
 				.email("ssafa19666@gmail.com")
				.mobileNumber("1111111111").builber();
		
		response = updateprofile.updateProfile(loginresponse.getToken(), updateprofilerequest);
	     System.out.println(response.asPrettyString());
	}

}
