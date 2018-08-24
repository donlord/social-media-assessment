package com.cooksys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.dto.UserDtoReq;
import com.cooksys.dto.UserDtoRes;
import com.cooksys.entity.Credentials;
import com.cooksys.entity.User;
import com.cooksys.mapper.UserMapper;
import com.cooksys.repository.UserRepository;

@Service
public class UserService {
	private UserRepository uRepo;
	private UserMapper uMapper;
	private List<User> users;

	public UserService(UserRepository ur) {
		this.uRepo = ur;
		this.users = new ArrayList<User>();
	}

	public List<User> getAll() {
		return this.users;
	}

	public User getUser(User u) {
		return this.uRepo.getOne(u.getId());
	}

	public void follow(User u) {
		u.addFollower(u);

	}

//	public List<User> getFollowers(User u){
//		return u.getFollowers();
//	}
//	
//	public List<User> getFollowing(User u){
//		return u.getFollowing();
//	}

	public UserDtoRes createUser(UserDtoReq u) {
		User savedUser = this.uRepo.save(this.uMapper.reqFromDto(u));
		return this.uMapper.toDtoRes(savedUser);
	}

//	public List<User> getFollowers(User u){
//		this.uRepo.findAll(u.getFollowers());
//	}

}
