package com.recruiter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruiter.dao.RecruiterRepo;
import com.recruiter.entity.Recruiter;
@Service
public class RecruiterService {
	
	@Autowired
	private RecruiterRepo recruiterRepo;
	
	
	public Recruiter createRecruiter(Recruiter rec) {
		Recruiter recruiter = recruiterRepo.save(rec);
		return recruiter;
	}
	
	public Recruiter getRecruiterById(long id) {
		Recruiter recruiter = recruiterRepo.findById(id).get();
		return recruiter;
	}
	
	public List<Recruiter> getAllRecruiter(){
		return recruiterRepo.findAll();
	}
	
	public void deleteRecruiter(long id) {
		recruiterRepo.deleteById(id);
	}
	
	public Recruiter updateRecruiter(long id,Recruiter rec) {
		Recruiter recruiter = recruiterRepo.findById(id).get();
		recruiter.setPassword(rec.getPassword());
		recruiter.setCompany_type(rec.getCompany_type());
		recruiter.setCompany_name(rec.getCompany_name());
		recruiter.setCompany_mail(rec.getCompany_mail());
		recruiter.setCompany_loaction(rec.getCompany_loaction());
		recruiter.setCompany_address(rec.getCompany_address());
		recruiter.setCity(rec.getCity());
		recruiter.setState(rec.getState());
	return	recruiterRepo.save(recruiter);
	}

}
