package com.crm.app.service;

import java.util.ArrayList;
import java.util.List;

import com.crm.app.DAO.PingDAO;
import com.crm.app.reources.Employee;

public class PingService 

{
	private PingDAO pingDAO;
	
	public PingDAO getPingDAO() {
		return pingDAO;
	}

	public void setPingDAO(PingDAO pingDAO) {
		this.pingDAO = pingDAO;
	}

	public boolean create(Employee emp)
	{
		System.out.println(" ping service emp create");
		return pingDAO.create(emp);
	}
	
	public List<Employee> getAllEmployee()
	throws Exception{
		System.out.println(" ping service emp getAllEmployee");
		return pingDAO.getAllEmployee();
	}
	
	

}
