package com.crm.app.service;

import java.util.ArrayList;
import java.util.List;

import com.crm.app.DAO.PingDAO;
import com.crm.app.DAO.UserDAO;
import com.crm.app.reources.Employee;

public class LoginService 

{
	private UserDAO userDAO;	

	public boolean authenticateUser(String user, String pass)
	{
		return userDAO.authenticateUser(user,pass);
	}
	
	
	

}
