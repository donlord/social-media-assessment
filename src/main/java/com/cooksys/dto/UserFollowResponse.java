package com.cooksys.dto;

import com.cooksys.entity.Credentials;

public class UserFollowResponse {
	private Credentials credential;

	public Credentials getCredential() {
		return credential;
	}

	public void setCredentials(Credentials c) {
		this.credential = c;
	}

}
