package com.gokhanbilgin.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhanbilgin.business.abstracts.EmployerService;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.Result;
import com.gokhanbilgin.core.utilities.results.SuccessDataResult;
import com.gokhanbilgin.dataAccess.abstracts.EmployerDao;
import com.gokhanbilgin.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Tüm iş verenler listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
