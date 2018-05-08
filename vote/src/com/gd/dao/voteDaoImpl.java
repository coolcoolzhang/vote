package com.gd.dao;

import java.util.List;

import org.hibernate.Session;

import com.gd.entity.Vote;
import com.gd.util.HibernateSessionFactory;

public class voteDaoImpl implements voteDao{

	public List<Vote> find() {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Vote";
		List<Vote> list=session.createQuery(hql).list();
		session.close();
		return list;
	}

}
