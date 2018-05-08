package com.gd.service;

import java.util.List;

import com.gd.dao.voteDao;
import com.gd.dao.voteDaoImpl;
import com.gd.entity.Vote;

public class voteService {
voteDao dao=new voteDaoImpl();
public List<Vote> find() {
	List<Vote> list=dao.find();
	return list;
}
}
