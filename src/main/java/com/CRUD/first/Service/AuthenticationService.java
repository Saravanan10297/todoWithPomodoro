package com.CRUD.first.Service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String Username ,String Password) {
		
		boolean isValidUsername = Username.equalsIgnoreCase("saro");
		boolean isValidPassword = Password.equalsIgnoreCase("123");
		
		return isValidPassword && isValidUsername;
		
	}

}
