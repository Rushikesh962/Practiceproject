package com.recruiter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recruiter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private long   id;
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="Company Name")
	private String company_name;
	@Column(name="Company Location")
	private String company_loaction;
	@Column(name="Company Mail")
	private String company_mail;
	@Column(name="Company Address")
	private String company_address;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="Company Type")
	private String company_type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_loaction() {
		return company_loaction;
	}
	public void setCompany_loaction(String company_loaction) {
		this.company_loaction = company_loaction;
	}
	public String getCompany_mail() {
		return company_mail;
	}
	public void setCompany_mail(String company_mail) {
		this.company_mail = company_mail;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	public Recruiter(long id, String username, String password, String company_name, String company_loaction,
			String company_mail, String company_address, String city, String state, String company_type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.company_name = company_name;
		this.company_loaction = company_loaction;
		this.company_mail = company_mail;
		this.company_address = company_address;
		this.city = city;
		this.state = state;
		this.company_type = company_type;
	}
	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Recruiter [id=" + id + ", username=" + username + ", password=" + password + ", company_name="
				+ company_name + ", company_loaction=" + company_loaction + ", company_mail=" + company_mail
				+ ", company_address=" + company_address + ", city=" + city + ", state=" + state + ", company_type="
				+ company_type + "]";
	}


}
