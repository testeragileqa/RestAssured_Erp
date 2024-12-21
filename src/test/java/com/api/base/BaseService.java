package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String Base_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestspecification;

	public BaseService() {

		requestspecification = RestAssured.given().baseUri(Base_URL);

	}

	protected void setAuthToken(String token) {
		requestspecification.header("Authorization", "Bearer " + token);
	}

	protected Response putRequest(Object poyload, String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(poyload).put(endpoint);
	}

	protected Response postRequest(Object poyload, String endpoint) {
		return requestspecification.contentType(ContentType.JSON).body(poyload).post(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestspecification.get(endpoint);
	}

}
