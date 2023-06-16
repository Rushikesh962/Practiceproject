package com.recruiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruiter.entity.Recruiter;

public interface RecruiterRepo extends JpaRepository<Recruiter, Long> {

}
