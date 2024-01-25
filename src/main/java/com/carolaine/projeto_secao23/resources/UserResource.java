package com.carolaine.projeto_secao23.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carolaine.projeto_secao23.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Maria","maria@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
