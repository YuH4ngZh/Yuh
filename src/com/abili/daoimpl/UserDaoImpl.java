package com.abili.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abili.dao.UserDao;
import com.abili.model.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sf = new Configuration().configure().buildSessionFactory();
    private  Session s = sf.openSession();  
    Transaction t = s.beginTransaction();

}
