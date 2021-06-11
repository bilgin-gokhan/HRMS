package com.gokhanbilgin.business.abstracts;

import java.util.List;

import com.gokhanbilgin.core.utilities.results.Result;
import com.gokhanbilgin.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();

	Result add(JobTitle jobTitle);
}
