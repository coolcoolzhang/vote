package com.gd.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */

public class Vote implements java.io.Serializable {

	// Fields

	private Integer vote;
	private Admin admin;
	private String title;
	private String createdate;
	private Integer type;
	private Integer publish;
	private Set votecontexts = new HashSet(0);
	private Set voters = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** full constructor */
	public Vote(Admin admin, String title, String createdate, Integer type,
			Integer publish, Set votecontexts, Set voters) {
		this.admin = admin;
		this.title = title;
		this.createdate = createdate;
		this.type = type;
		this.publish = publish;
		this.votecontexts = votecontexts;
		this.voters = voters;
	}

	// Property accessors

	public Integer getVote() {
		return this.vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPublish() {
		return this.publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public Set getVotecontexts() {
		return this.votecontexts;
	}

	public void setVotecontexts(Set votecontexts) {
		this.votecontexts = votecontexts;
	}

	public Set getVoters() {
		return this.voters;
	}

	public void setVoters(Set voters) {
		this.voters = voters;
	}

}