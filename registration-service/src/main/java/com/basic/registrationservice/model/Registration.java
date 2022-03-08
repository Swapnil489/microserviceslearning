package com.basic.registrationservice.model;

import java.util.ArrayList;
import java.util.Date;

public class Registration {
	
	private int registration_id;
	private String name;
	private String site;
	private String username;
	private String password;
	private String mserid;
	private String mpin;
	private Date udpatedOn;
	private User user;
	private ArrayList<String> oldPasswordList;
	public int getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMserid() {
		return mserid;
	}
	public void setMserid(String mserid) {
		this.mserid = mserid;
	}
	public String getMpin() {
		return mpin;
	}
	public void setMpin(String mpin) {
		this.mpin = mpin;
	}
	public Date getUdpatedOn() {
		return udpatedOn;
	}
	public void setUdpatedOn(Date udpatedOn) {
		this.udpatedOn = udpatedOn;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<String> getOldPasswordList() {
		return oldPasswordList;
	}
	public void setOldPasswordList(ArrayList<String> oldPasswordList) {
		this.oldPasswordList = oldPasswordList;
	}
	
}
