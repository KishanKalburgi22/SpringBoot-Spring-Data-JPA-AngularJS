package com.kk.SpringBootJPAWithAngularJS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kk.SpringBootJPAWithAngularJS.Model.User;
import com.kk.SpringBootJPAWithAngularJS.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/status")
	public String getStatus() {
		return "The Server is up and running";
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping("/users/{id}")
	public User getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}
}
