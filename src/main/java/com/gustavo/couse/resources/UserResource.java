package com.gustavo.couse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.couse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll()
	{
		User u = new User(1L, "Maria", "maria@gmail.comn", "99999999999", "1234");
		return ResponseEntity.ok().body(u);
	}
}