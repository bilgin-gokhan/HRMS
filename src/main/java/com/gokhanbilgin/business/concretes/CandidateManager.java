package com.gokhanbilgin.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhanbilgin.business.abstracts.CandidateService;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.SuccessDataResult;
import com.gokhanbilgin.dataAccess.abstracts.CandidateDao;
import com.gokhanbilgin.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Tüm iş arayanlar listelendi.");
	}

}
