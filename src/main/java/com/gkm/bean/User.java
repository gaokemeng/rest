package com.gkm.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -7518017622050134829L;

	private String id;
	
	
	private String user;

	private String message;
	
	private String postedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(String postedAt) {
		this.postedAt = postedAt;
	}
	
	
	
	
	
}
