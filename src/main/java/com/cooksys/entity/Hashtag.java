package com.cooksys.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Hashtag {

	@Id
	@Column(nullable = false, unique = true) // PK
	private String label;

	@Column(nullable = false)
	private static Date firstUsed = new java.util.Date();

	@Column(nullable = false)
	private Date lastUsed;

	public Hashtag() {
	}

	public Hashtag(String label, Date last) {
		this.label = label;
		this.lastUsed = last;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

}
