package com.cooksys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Tweet {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Integer id;

	@ManyToOne
	private User author;

	@Column(nullable = false)
	private Date posted;
	private String content;
	
	@OneToOne
	private Tweet inReplyTo;
	
	@OneToOne
	private Tweet repostOf;
	
	@ManyToMany
	@JoinTable(name = "likeby_user")
	private List<User> likedby = new ArrayList<User>();
	private int likes = 0;

	public Tweet() {
	}

	public Tweet(int id, User author, String content, Tweet in, Tweet reply) {
		posted = new Date();
		this.id = id;
		this.author = author;
		this.content = content;
		this.inReplyTo = in;
		this.repostOf = reply;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tweet getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(Tweet inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public Tweet getRepostOf() {
		return repostOf;
	}

	public void setRepostOf(Tweet repostOf) {
		this.repostOf = repostOf;
	}

	public List<User> getLikedby() {
		return likedby;
	}

	public void setLikedby(List<User> likedby) {
		this.likedby = likedby;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
