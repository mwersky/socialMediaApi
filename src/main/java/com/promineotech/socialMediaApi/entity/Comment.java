package com.promineotech.socialMediaApi.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore
import com.promineotech.socialMediaApi.entity.Post;
import com.promineotech.SocialMediaApi.entity.User;

@Entity
public class Comment {

	private Long id;
	private String content;
	private Date date;
	private User user;
	
	@JsonIgnore
	private Post post;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	
	public setContent(String content) {
		this.content = content;
	}
	
	public Date getDate () {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne
	@JoinColumn(name = "postId")
	public Post getPost() {
		this.post = post;
	}

	public setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser() {
		this.user = user;
	}

}
