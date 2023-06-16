package com.recruiter.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class Postjob {
      @Id
  	  @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name="Id")
      private int    id;
      @Column(name="Company Profile")
      private String company_profile;
      @Column(name="Education Criteria")
      private String education_criteria;
      @Column(name="Role")
      private String role;
      @Column(name="Location")
      private String location;
      @Column(name="Key Skill")
      private String key_skill;
      @Column(name="Designation")
      private String designation;
      @Column(name="Walkin Time")
      private String walkin_time;
      @Column(name="Walkin Date")
      private String walkin_date;
      @Column(name="Functional Area")
      private String functional_area;
      @Column(name="Hr Contact No")
      private String hr_contact_no;
      @Column(name="Hr Email Id")
      private String hr_email_id;
      @Column(name="Company Url")
      private String company_url;
      @Column(name="Linkedin Company Profile")
      private String linkedin_company_profile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_profile() {
		return company_profile;
	}
	public void setCompany_profile(String company_profile) {
		this.company_profile = company_profile;
	}
	public String getEducation_criteria() {
		return education_criteria;
	}
	public void setEducation_criteria(String education_criteria) {
		this.education_criteria = education_criteria;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getKey_skill() {
		return key_skill;
	}
	public void setKey_skill(String key_skill) {
		this.key_skill = key_skill;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getWalkin_time() {
		return walkin_time;
	}
	public void setWalkin_time(String walkin_time) {
		this.walkin_time = walkin_time;
	}
	public String getWalkin_date() {
		return walkin_date;
	}
	public void setWalkin_date(String walkin_date) {
		this.walkin_date = walkin_date;
	}
	public String getFunctional_area() {
		return functional_area;
	}
	public void setFunctional_area(String functional_area) {
		this.functional_area = functional_area;
	}
	public String getHr_contact_no() {
		return hr_contact_no;
	}
	public void setHr_contact_no(String hr_contact_no) {
		this.hr_contact_no = hr_contact_no;
	}
	public String getHr_email_id() {
		return hr_email_id;
	}
	public void setHr_email_id(String hr_email_id) {
		this.hr_email_id = hr_email_id;
	}
	public String getCompany_url() {
		return company_url;
	}
	public void setCompany_url(String company_url) {
		this.company_url = company_url;
	}
	public String getLinkedin_company_profile() {
		return linkedin_company_profile;
	}
	public void setLinkedin_company_profile(String linkedin_company_profile) {
		this.linkedin_company_profile = linkedin_company_profile;
	}
	public Postjob(int id, String company_profile, String education_criteria, String role, String location,
			String key_skill, String designation, String walkin_time, String walkin_date, String functional_area,
			String hr_contact_no, String hr_email_id, String company_url, String linkedin_company_profile) {
		super();
		this.id = id;
		this.company_profile = company_profile;
		this.education_criteria = education_criteria;
		this.role = role;
		this.location = location;
		this.key_skill = key_skill;
		this.designation = designation;
		this.walkin_time = walkin_time;
		this.walkin_date = walkin_date;
		this.functional_area = functional_area;
		this.hr_contact_no = hr_contact_no;
		this.hr_email_id = hr_email_id;
		this.company_url = company_url;
		this.linkedin_company_profile = linkedin_company_profile;
	}
	public Postjob() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Postjob [id=" + id + ", company_profile=" + company_profile + ", education_criteria="
				+ education_criteria + ", role=" + role + ", location=" + location + ", key_skill=" + key_skill
				+ ", designation=" + designation + ", walkin_time=" + walkin_time + ", walkin_date=" + walkin_date
				+ ", functional_area=" + functional_area + ", hr_contact_no=" + hr_contact_no + ", hr_email_id="
				+ hr_email_id + ", company_url=" + company_url + ", linkedin_company_profile="
				+ linkedin_company_profile + "]";
	}
	  
      
}
