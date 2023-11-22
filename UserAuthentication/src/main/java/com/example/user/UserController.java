package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public String authenticate(@RequestBody UserModel user) {
		return authenticationService.authenticateUser(user);
		
	}
}
