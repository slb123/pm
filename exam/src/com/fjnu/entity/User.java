package com.fjnu.entity;

/**
 * 实体类User
 * @author vengeance
 *
 */
public class User extends IdEntity{
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
