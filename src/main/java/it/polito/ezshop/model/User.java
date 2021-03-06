package it.polito.ezshop.model;

import java.io.Serializable;

public class User implements it.polito.ezshop.data.User, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9088634626096557488L;
	private Integer userId;
	private String userName;
	private String password;
	private String role;
	
	
	public User(String userName, String password, String role, Integer id) {
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.userId = id;
	}

	@Override
	public Integer getId() {
		return this.userId;
	}

	@Override
	public void setId(Integer id) {
		this.userId = id;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public void setUsername(String username) {
		this.userName = username;
		
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getRole() {
		return this.role;
	}

	@Override
	public void setRole(String role) {
		this.role = role;
		
	}

}
