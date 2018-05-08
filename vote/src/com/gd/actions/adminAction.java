package com.gd.actions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gd.entity.Admin;
import com.gd.service.adminService;

public class adminAction extends BaseAction{
	private Admin admin;
	private String twopwd;
	adminService s=new adminService();
public String login(){
	boolean a=s.login(admin);
		if (a==true) {
			getSession().put("name", admin.getName());
			return "login";
		}return ERROR;
}
public String register(){
	if (twopwd.equals(admin.getPassword())) {
		//获取档期那系统时间
				Date date=Calendar.getInstance().getTime();
				System.out.println(date);
				SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString=formatter.format(date);
				System.out.println(dateString);
				admin.setLogintime(dateString);
				boolean r=s.register(admin);
				if (r==true) {
					return "register";
				}return "error";
	}else{
		return "error";
	}
}
private Admin jsonadmin;
public String findAdminByName() throws IOException{
	System.out.println(admin.getName());
	jsonadmin=s.findAdminByName(admin.getName());
	return "json1";
}
public String get(){
	System.out.println(admin.getName());
	Admin a=s.get(admin.getName());
	getRequest().put("admin", a);
	return "get";
}
public String update(){
	s.update(admin);
	return "update";
	
}



public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
public String getTwopwd() {
	return twopwd;
}
public void setTwopwd(String twopwd) {
	this.twopwd = twopwd;
}
public Admin getJsonadmin() {
	return jsonadmin;
}
public void setJsonadmin(Admin jsonadmin) {
	this.jsonadmin = jsonadmin;
}


}
