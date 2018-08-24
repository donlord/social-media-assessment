package com.cooksys.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

public class Context {

	private Tweet target;
	private List<Tweet> before = new ArrayList<Tweet>();
	private List<Tweet> after = new ArrayList<Tweet>();

	public Context() {
	}

	public Context(Tweet t, List<Tweet> b, List<Tweet> a) {
		this.target = t;
		this.before = b;
		this.after = a;
	}

	public Tweet getTarget() {
		return target;
	}

	public void setTarget(Tweet target) {
		this.target = target;
	}

	public List<Tweet> getBefore() {
		return before;
	}

	public void setBefore(List<Tweet> before) {
		this.before = before;
	}

	public List<Tweet> getAfter() {
		return after;
	}

	public void setAfter(List<Tweet> after) {
		this.after = after;
	}

}
