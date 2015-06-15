package com.pratap.hbexample.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	
	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private Date lastVisit;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
	
	
}
