package com.cooksys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.User;
import com.cooksys.mapper.UserMapper;
import com.cooksys.mapper.UserTweetMapper;
import com.cooksys.repository.UserRepository;
import com.cooksys.service.UserService;
import com.cooksys.dto.UserDtoReq;
import com.cooksys.dto.UserDtoRes;
import com.cooksys.dto.UserTweetDto;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	private UserService uService;
	private UserRepository uRepo;
	private UserMapper uMapper;
	private UserTweetMapper utMapper;

	public UserController(UserService us, UserRepository ur, UserMapper um, UserTweetMapper ut) {
		this.uService = us;
		this.uRepo = ur;
		this.uMapper = um;
		this.utMapper = ut;
	}

	@GetMapping
	public List<User> getUsers() {
		return this.uService.getAll();
	}

	@GetMapping("/@{username}")
	public UserDtoRes getUser(@PathVariable(name = "username") User u) {
		User response = this.uService.getUser(u);
		return this.uMapper.toDtoRes(response);
	}

//	@PostMapping("/@{username}/follow")
//	public void follow(@PathVariable(name="username")User u, @RequestBody User follower) {
//		u.addFollower(follower);
//		
//	}
//	@GetMapping("/@{username}/feed")
//	public UserTweetDto getFeed(@PathVariable(name="username") User u) {
//		return this.utMapper.TweetToDtoRes(u);
//	}

	@PostMapping
	public UserDtoRes createUser(@RequestBody UserDtoReq u) {
		User request = new User(u.getCredentials(), u.getProfile());
		this.uRepo.save(request);
		UserDtoRes response = this.uMapper.toDtoRes(request);
		response.setUsername(u.getCredentials().getUsername());
		response.setJoined(request.getJoined());
		return response;
	}
//
//	@GetMapping("/@{username}/followers")
//	public List<User> getFollowers(@PathVariable(name="username") User u) {
//		return this.uMapper.toDtoRes(u);
//	}
//
//	@GetMapping("/@{username}/following")
//	public List<User> getFollowing(@PathVariable(name="username") String username) {
//		return this.uRepo.findByUsername(username).getFollowing();
//	}
}
