package com.feign.spring.model;

public class Post {
	private Long userId;
	private Long id;
	private String title;
	private String body;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Post(Long userId, Long id, String title, String body) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	
	

}
