package com.cooksys.entity;

import javax.persistence.*;

@Embeddable
public class Credentials {

	@Column(nullable = false, unique = true) // PK cant be null
	private String username;

	@Column(nullable = false)
	private String password;

	public Credentials() {
	}

	public Credentials(String u, String p) {
		this.username = u;
		this.password = p;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
