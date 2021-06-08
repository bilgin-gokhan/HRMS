package com.gokhanbilgin.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "candidates")
public class Candidate extends User {

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "identity_number", nullable = false)
	private String identityNo;

	@Column(name = "birth_year", nullable = false)
	private int birthYear;
}
