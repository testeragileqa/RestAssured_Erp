package com.api.request;

public class LoginRequestUser {
	
	
	private String username; 
	private String password ;
	
	
	public LoginRequestUser(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;
		
	}

	public String getusername() {
		return username;
	}


	public void setLogin(String username) {
		this.username = username;
	}
 

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest [username=" + username + ", password=" + password + "]";
	}


}
