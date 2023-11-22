package com.example.user;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public String authenticateUser(UserModel user) {
		if("correctUsername".equals(user.getUser()) && "correctpswd".equals(user.getPswd())) {
			return "Valid user";
		}
		else {
			return "Invalid user";
		}
	}
}
