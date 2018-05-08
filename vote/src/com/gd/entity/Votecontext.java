package com.gd.entity;

/**
 * Votecontext entity. @author MyEclipse Persistence Tools
 */

public class Votecontext implements java.io.Serializable {

	// Fields

	private Integer votecontextId;
	private Vote vote;
	private String context;
	private Integer count;

	// Constructors

	/** default constructor */
	public Votecontext() {
	}

	/** full constructor */
	public Votecontext(Vote vote, String context, Integer count) {
		this.vote = vote;
		this.context = context;
		this.count = count;
	}

	// Property accessors

	public Integer getVotecontextId() {
		return this.votecontextId;
	}

	public void setVotecontextId(Integer votecontextId) {
		this.votecontextId = votecontextId;
	}

	public Vote getVote() {
		return this.vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}