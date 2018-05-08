package com.gd.dao;

import com.gd.entity.Admin;

public interface adminDao {
//登陆
	public boolean login(Admin admin);
//注册
	public boolean register(Admin admin);
//查询ajax用户名
	public Admin find(String name);
//根据name查询
	public Admin get(String name);
	public void update(Admin admin);
}
