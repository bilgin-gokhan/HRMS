package com.gokhanbilgin.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
