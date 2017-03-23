package com.test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.UserDao;
import com.test.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
			.buildSessionFactory();

	@Override
	public List<User> findAllUsers() {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return session.createQuery("from User").list();
		} catch (Exception e) {

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
				session = null;
			}
		}
		return null;
	}

}
