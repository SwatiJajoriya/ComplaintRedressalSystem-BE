package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.model.ComplaintUpdates;


@Repository
public interface ComplaintUpdateRepository extends JpaRepository<ComplaintUpdates, Integer> {

}
