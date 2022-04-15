package com.utility.classes;

import java.io.Serializable;
import java.sql.Time;

public class ClientFormFieldBean implements Serializable{
  
	private int client_key;
	private String your_name;
	private String your_email;
	private String car_number;
	private String car_Color;
	private String in_time;
	private String out_time;
	private int rate ;
	
	public ClientFormFieldBean() {
		super();
	}
	public ClientFormFieldBean(String your_name, String your_email,int rate) {
		super();
		this.your_name = your_name;
		this.your_email = your_email;
		this.rate = rate;
	}
	
	public int getClient_key() {
		return client_key;
	}
	public void setClient_key(int client_key) {
		this.client_key = client_key;
	}
	public String getYour_Name() {
		return your_name;
	}
	public void setYour_Name(String your_name) {
		this.your_name = your_name;
	}
	public String getYour_email() {
		return your_email;
	}
	public void setYour_email(String your_email) {
		this.your_email = your_email;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}
	public String getCar_Color() {
		return car_Color;
	}
	public void setCar_Color(String car_Color) {
		this.car_Color = car_Color;
	}
	public String getIn_time() {
		return in_time;
	}
	public void setIn_time(String intime) {
		this.in_time = intime;
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate2) {
		this.rate = rate2;
	}
}
