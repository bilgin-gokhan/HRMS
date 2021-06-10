package com.gokhanbilgin.business.abstracts;

import java.util.List;

import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();

}
