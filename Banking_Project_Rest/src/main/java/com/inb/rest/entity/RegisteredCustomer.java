package com.inb.rest.entity;

import java.io.File;
import java.util.Date;


public class RegisteredCustomer extends CustomerPOJO {

	long customerId;
	String userName;
	String password;
	String authorizedImageName;
	String authorizedImageText;
	
	
	
	public RegisteredCustomer() {
		super();
	}
	public RegisteredCustomer(String firstName, String lastName, String email,
			long phone, String address, Date dateOfBirth, File addressProof,
			File ageProof, long customerId, String userName, String password,
			String authorizedImageName, String authorizedImageText) {
		super(firstName, lastName, email, phone, address, dateOfBirth,
				addressProof, ageProof);
		this.customerId = customerId;
		this.userName = userName;
		this.password = password;
		this.authorizedImageName = authorizedImageName;
		this.authorizedImageText = authorizedImageText;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthorizedImageName() {
		return authorizedImageName;
	}
	public void setAuthorizedImageName(String authorizedImageName) {
		this.authorizedImageName = authorizedImageName;
	}
	public String getAuthorizedImageText() {
		return authorizedImageText;
	}
	public void setAuthorizedImageText(String authorizedImageText) {
		this.authorizedImageText = authorizedImageText;
	}
	@Override
	public String toString() {
		return "RegisteredCustomer [customerId=" + customerId + ", userName="
				+ userName + ", password=" + password
				+ ", authorizedImageName=" + authorizedImageName
				+ ", authorizedImageText=" + authorizedImageText + "]"+"["+super.toString()+"]";
	}

	
}
