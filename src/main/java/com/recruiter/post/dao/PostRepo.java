package com.recruiter.post.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruiter.post.entity.Postjob;

public interface PostRepo extends JpaRepository<Postjob, Integer>{

}
