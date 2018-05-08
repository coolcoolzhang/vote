package com.gd.actions;

import java.util.List;

import com.gd.entity.Vote;
import com.gd.service.voteService;

public class voteAction extends BaseAction{
private Vote vote;
voteService s=new voteService();
public String find(){
	List<Vote> votelist=s.find();
	getRequest().put("votelist", votelist);
	return "vote_find";
}
}
