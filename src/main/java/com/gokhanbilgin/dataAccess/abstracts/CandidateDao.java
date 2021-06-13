package com.gokhanbilgin.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsCandidateByEmailOrIdentityNo(String email, String identityNo);
}
