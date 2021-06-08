package com.gokhanbilgin.business.abstracts;

import java.util.List;

import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();

}
