package com.recruiter.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruiter.entity.Recruiter;
import com.recruiter.post.dao.PostRepo;
import com.recruiter.post.entity.Postjob;

@Service
public class PostService {

	@Autowired
	PostRepo postRepo;
	
	public Postjob createjob(Postjob pos) {
		Postjob post=postRepo.save(pos);
		return post;
		
	}
	public List<Postjob> getAlljobs(){
		return postRepo.findAll();
	}
	public Postjob updatejob(int id,Postjob p) {
		Postjob postjob=postRepo.findById(id).get();
		postjob.setCompany_profile(p.getCompany_profile());
		postjob.setCompany_url(p.getCompany_url());
		postjob.setDesignation(p.getDesignation());
		postjob.setEducation_criteria(p.getEducation_criteria());
		postjob.setFunctional_area(p.getFunctional_area());
		postjob.setHr_contact_no(p.getHr_contact_no());
		postjob.setHr_email_id(p.getHr_email_id());
		postjob.setKey_skill(p.getKey_skill());
		postjob.setLinkedin_company_profile(p.getLinkedin_company_profile());
		postjob.setLocation(p.getLocation());
		postjob.setRole(p.getRole());
		postjob.setWalkin_date(p.getWalkin_date());
		postjob.setWalkin_time(p.getWalkin_time());
		return postRepo.save(postjob);
		
	}
	public void deleteJob(int id) {
		postRepo.deleteById(id);
	}
}
