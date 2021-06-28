package com.rmg.pojoclasses;
/**
 * pojo class for project
 * @author dell
 *
 */
public class Project {
	String createdBy;
	String createdOn;
	String status;
	int teamSize;
	public Project() {
		
	}
	public Project(String createdBy, String createdOn, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	

}
