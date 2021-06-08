package com.gokhanbilgin.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
