package com.gokhanbilgin.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
