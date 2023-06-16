package com.recruiter.post.controller;

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
import com.recruiter.post.entity.Postjob;
import com.recruiter.post.service.PostService;

@RestController
public class PostController {
   
	@Autowired
	PostService posts;
	
	@PostMapping(path="postjob")
	public void job(@RequestBody Postjob p) {
		posts.createjob(p);
	}
	@GetMapping(path = "/getalljob")
	public List<Postjob> getallrec() {
		List<Postjob> find = posts.getAlljobs();
		return find;
	}
	
	@PutMapping(path="updatejob/{id}")
	public void updateusingid(@PathVariable("id")int id,@RequestBody Postjob y) {
		posts.updatejob(id, y);
	}
	@DeleteMapping(path = "/deletebyjobid/{id}")
	public void deletebyid(@PathVariable("id") int id) {
		posts.deleteJob(id);
	}
}
