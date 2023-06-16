package com.recruiter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recruiter.entity.Recruiter;
import com.recruiter.service.RecruiterService;
@RestController
public class RecruiterController {
	@Autowired
	RecruiterService recs;

	@PostMapping(path = "/savedata")
	public void data(@RequestBody Recruiter R) {

		recs.createRecruiter(R);

	}

    @PostMapping(path="/getrec/{id}")
    public Recruiter getrec(@PathVariable("id")long id){
	Recruiter find=recs.getRecruiterById(id);
	return find;
    }

	@GetMapping(path = "/getall")
	public List<Recruiter> getallrec() {
		List<Recruiter> find = recs.getAllRecruiter();
		return find;
	}

	@DeleteMapping(path = "/deletebyid/{id}")
	public void deletebyid(@PathVariable("id") long id) {
		recs.deleteRecruiter(id);
	}
	@PutMapping(path="/update/{id}")
    public void updatebyid(@PathVariable("id")long id,@RequestBody Recruiter x ) {
		recs.updateRecruiter(id,x);
	}
}
