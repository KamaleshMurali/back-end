package com.ofs.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.example.model.User;
import com.ofs.example.service.UserService;

@RestController
@RequestMapping(value="/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value="/")
	public void addUser(@RequestBody User user) {
		this.userService.addUser(user);
	}
	
	@GetMapping(value="/{id}")
	@ResponseBody
	public ResponseEntity<User> getUser(@RequestParam("id") long id) {
		User user = this.userService.getUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}