package com.abili.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abili.model.User;

public class TestDemo {

	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = null;  
        Transaction t = null;
        s = sf.openSession();  
        t = s.beginTransaction();  
        User user = new User();
		user.setName("zhangyuhang");
        s.save(user); 
        System.out.println("success");
        t.commit(); 
        s.flush();
	}
}
