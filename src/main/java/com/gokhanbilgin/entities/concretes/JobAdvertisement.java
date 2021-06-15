package com.gokhanbilgin.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "job_description")
	private String jobDesc;

	@Column(name = "min_salary")
	private int minSalary;

	@Column(name = "max_salary")
	private int maxSalary;

	@Column(name = "open_position_number")
	private int openPositionNumber;

	@Column(name = "application_deadline")
	private LocalDate applicationDeadline;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@ManyToOne
	@JoinColumn(name = "id")
	private Employer employer;

	@ManyToMany
	private City cities;

	@ManyToOne
	@JoinColumn(name = "id")
	private JobTitle jobTitle;
}
