package com.gokhanbilgin.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	List<JobAdvertisement> findByIsActiveTrue();

	List<JobAdvertisement> findByIsActiveTrueOrderByCreatedAt();

	List<JobAdvertisement> findByIsActiveTrueAndByEmployer(int id);
}
