package com.gd.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gd.entity.Admin;
import com.gd.util.HibernateSessionFactory;

public class adminDaoImpl implements adminDao{

	public boolean login(Admin admin) {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateSessionFactory.getSession();
			String hql="select name,password from Admin where name='"+admin.getName()+"' and password='"+admin.getPassword()+"'";
			Query query=session.createQuery(hql);
			List list=query.list();
			if (!list.isEmpty()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}

	public boolean register(Admin admin) {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateSessionFactory.getSession();
			Transaction tr=session.beginTransaction();
			session.save(admin);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	public Admin find(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Admin where name='"+name+"'";
		Admin admin=(Admin) session.createQuery(hql).list();
		System.out.println(admin);
		session.close();
		return admin;
	}

	public Admin get(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Admin where name='"+name+"'";
		Admin admin=(Admin) session.createQuery(hql).list();
		session.close();
		return admin;
	}

	public void update(Admin admin) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tr=session.beginTransaction();
		session.update(admin);
		tr.commit();
		session.close();
	}

}
