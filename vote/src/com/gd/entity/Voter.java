package com.gd.entity;

/**
 * Voter entity. @author MyEclipse Persistence Tools
 */

public class Voter implements java.io.Serializable {

	// Fields

	private Integer id;
	private Vote vote;
	private String ip;

	// Constructors

	/** default constructor */
	public Voter() {
	}

	/** full constructor */
	public Voter(Vote vote, String ip) {
		this.vote = vote;
		this.ip = ip;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Vote getVote() {
		return this.vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}