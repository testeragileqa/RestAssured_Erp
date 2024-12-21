package com.api.base;

import com.api.request.UpdateProfileRequest;

import io.restassured.response.Response;

public class ProfileManagementUser extends BaseService {
	
private static final String Base_Path = "/api/users";


    public Response getProfile(String token)
    {
    	setAuthToken(token);
    	return getRequest(Base_Path +"/profile");
    }
    

    public Response updateProfile(String token, UpdateProfileRequest poyload)
    {
    	setAuthToken(token);
    	return putRequest(poyload, Base_Path +"/profile");
    }

}
