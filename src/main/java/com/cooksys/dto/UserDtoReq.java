package com.cooksys.dto;

import com.cooksys.entity.Credentials;
import com.cooksys.entity.Profile;

public class UserDtoReq {
	private Credentials credentials;
	private Profile profile;

	public UserDtoReq() {
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials c) {
		this.credentials = c;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
