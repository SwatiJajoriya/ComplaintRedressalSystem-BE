package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.model.Complaint;



@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer>{

}