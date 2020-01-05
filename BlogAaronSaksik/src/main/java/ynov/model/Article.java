package ynov.model;

import java.util.Date;

public class Article {
	
	private Integer id;
	private String user;
	private String title;
	private String description;
	private String text;
	private Date date;
	
	public Article(Integer id2, String user2, String title2, String description2, String text2) {
		this.id = id2;
		this.user = user2;
		this.title = title2;
		this.description = description2;
		this.text = text2;

	}
	
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public Integer getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public String getTitle() {
		return title;
	}
	public String getUser() {
		return user;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}	
