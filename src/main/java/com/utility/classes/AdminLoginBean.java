package com.utility.classes;

import java.util.Objects;

public class AdminLoginBean {
	private String email;
	private String password;
	public AdminLoginBean(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	 }
	 public AdminLoginBean() {
	   super();
	 }
	public String getEmail() {
		return email;
	 }
	public void setEmail(String userName) {
		   this.email = userName;
	 }
    public String getPassword() {
		 return password;
	 }
    public void setPassword(String password) {
	   this.password = password;
	 }
	@Override
	public String toString() {
		return "AdminLoginBean [email=" + email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminLoginBean other = (AdminLoginBean) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password);
	}
}
