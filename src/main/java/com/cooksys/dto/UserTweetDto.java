package com.cooksys.dto;

import java.util.Date;
import java.util.List;

import com.cooksys.entity.Tweet;
import com.cooksys.entity.User;

public class UserTweetDto {
	private List<Tweet> tweets;

	public UserTweetDto() {
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

}
