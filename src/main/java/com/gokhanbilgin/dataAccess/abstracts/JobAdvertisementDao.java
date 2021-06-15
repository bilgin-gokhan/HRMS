package com.gokhanbilgin.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

}
