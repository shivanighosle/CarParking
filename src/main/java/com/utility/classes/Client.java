package com.utility.classes;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
    private String role;
    private String email;
	private String password;
    
	
	public Client() {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}
	
	public Client(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", role=" + role + ", email=" + email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name, password, role);
	} 
}
