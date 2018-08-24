package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Profile {

	private String firstName;
	private String lastName;

	@Column(nullable = false)
	private String email;
	private String phone;

	public Profile() {
	}

	public Profile(String e) {
		this.email = e;
	}

	public Profile(String f, String l, String e, String p) {
		this.firstName = f;
		this.lastName = l;
		this.email = e;
		this.phone = p;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
