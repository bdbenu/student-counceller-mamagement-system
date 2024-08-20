package com.bd.benu.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENQUARY_MASTER")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EID")
	private Integer eid;
	
	@Column(name = "NAME")
	private String	name;
	
	
	@Column(name = "email")
	private String email; 
	
	@Column(name = "MOBILE")
	private String mobile; 
	
	@Column(name = "COURSE")
	private String course; 
	
	@Column(name = "MODE")
	private String mode; 
	
	@Column(name = "STATUS")
	private String status;
	
	@CreationTimestamp
	@Column(name = "CREATE_DATE")
	private Date create_date;
	
	@UpdateTimestamp
	@Column(name = "UPDATE_DATE")
	private Date update_date;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	} 
	
	
	
}
