package com.gokhanbilgin.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employee_confirm_employers")
public class EmployeeConfirmEmployer extends EmployeeConfirm {

	@JoinColumn(name = "employer_id", referencedColumnName = "id", nullable = false)
	@Column(name = "employer_id")
	private int employerId;

}
