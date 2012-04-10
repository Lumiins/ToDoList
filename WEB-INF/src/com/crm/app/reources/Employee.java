package com.crm.app.reources;

import java.util.Date;
import java.util.Random;

public class Employee 
{

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id=(new Date()).getDate();
	
	private String firstName;
	
	private String lastName;
	
	private String sex;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
