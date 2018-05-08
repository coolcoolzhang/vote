package com.gd.service;

import com.gd.dao.adminDao;
import com.gd.dao.adminDaoImpl;
import com.gd.entity.Admin;

public class adminService {
	adminDao dao=new adminDaoImpl();
public boolean login(Admin admin){
	boolean a=dao.login(admin);
	if (a==true) {
		return a;
	}
	return false;
}
public boolean register(Admin admin){
	boolean r=dao.register(admin);
	if (r==true) {
		return r;
	}
	return false;
}
public Admin findAdminByName(String name){
		return dao.find(name);
}
public Admin get(String name){
	Admin admin=dao.get(name);
	return admin;
	
}
public void update(Admin admin){
	dao.update(admin);
}
}
