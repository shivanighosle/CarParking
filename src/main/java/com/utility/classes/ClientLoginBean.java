package com.utility.classes;

import java.util.Objects;

public class ClientLoginBean {
	  private String email;
	  private String password;
	  
	  public  ClientLoginBean(String email, String password) {
	    super();
	    this.email = email;
	    this.password = password;
	  }
	  
	  public  ClientLoginBean() {
	    super();
	    // TODO Auto-generated constructor stub
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
		return "ClientLoginBean [email=" + email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, password);
	}
}
