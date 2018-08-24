package com.cooksys.dto;

import java.util.Date;

import com.cooksys.entity.Profile;

public class UserDtoRes {

	private String username;
	private Profile profile;
	private Date joined;

	public UserDtoRes() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}

}
