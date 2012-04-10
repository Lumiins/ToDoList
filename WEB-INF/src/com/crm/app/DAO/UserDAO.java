package com.crm.app.DAO;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crm.app.reources.Employee;
import com.crm.app.reources.Users;

public class UserDAO
 {
  
	private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
    	System.out.println(" setting template");
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }


	public boolean authenticateUser(String user, String pass)
	{
		Session s= hibernateTemplate.getSessionFactory().openSession();
		Query q=s.createQuery("from Users where username=\""+ user +"\""+"and UserPWd="+"\""+pass+"\"" );
		List<Users> users=q.list();
		if(users.size()==1)
		{
		  return true;
		}
		else
		{
			return false;
		}
			
	}
    
}

	
	
	
