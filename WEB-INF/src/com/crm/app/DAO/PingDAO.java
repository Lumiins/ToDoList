package com.crm.app.DAO;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crm.app.reources.Employee;

import flex.messaging.io.ArrayList;

public class PingDAO
 {
  
	private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
    	System.out.println(" setting template");
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }

    
    public boolean create(Employee e)
    {
    	try
    	{
    		long id=(new Date()).getTime();
    		String t= id+"";
    		e.setId((int)id);
    		FileOutputStream baos = new FileOutputStream("/tmp/lumn"+t+".xml")  ;		
    		XMLEncoder xmlEncoder = new XMLEncoder(baos);
    		xmlEncoder.writeObject(e);
    		xmlEncoder.close();
             return true;
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	
    	return false;
    }
    
    
   public List<Employee> getAllEmployee()
   throws Exception{
	   ArrayList al= new ArrayList();
	   File uf= new File("/tmp/lumn");
	   File[] fileSet=uf.listFiles();
	   System.out.println(" file set "+fileSet.length);
	   for(int i=0;i<fileSet.length;i++)
	 {	
		   File f=fileSet[i];
		   System.out.println(" file set "+fileSet[i].getName());
	   FileInputStream os = new FileInputStream(f);
	   XMLDecoder decoder = new XMLDecoder(os);
	   Employee p = (Employee)decoder.readObject();
	   decoder.close(); 
	   al.add(p);
   }
	   
	  return al;
   }
    
    
}

	
	
	
