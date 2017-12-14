package com.fh.entities;

public class Project {
	private int projectNo;
	private String title;
	private String descriptin;
	private String duration;
	private String domain;
	private String clientName;
	private String status;
	
	
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriptin() {
		return descriptin;
	}
	public void setDescriptin(String descriptin) {
		this.descriptin = descriptin;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", title=" + title + ", descriptin=" + descriptin + ", duration="
				+ duration + ", domain=" + domain + ", clientName=" + clientName + ", status=" + status + "]";
	}
	
	
	
}
