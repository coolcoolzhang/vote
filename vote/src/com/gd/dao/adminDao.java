package com.gd.dao;

import com.gd.entity.Admin;

public interface adminDao {
//��½
	public boolean login(Admin admin);
//ע��
	public boolean register(Admin admin);
//��ѯajax�û���
	public Admin find(String name);
//����name��ѯ
	public Admin get(String name);
	public void update(Admin admin);
}
