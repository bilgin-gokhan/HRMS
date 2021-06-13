package com.gokhanbilgin.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhanbilgin.business.abstracts.JobTitleService;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.ErrorResult;
import com.gokhanbilgin.core.utilities.results.Result;
import com.gokhanbilgin.core.utilities.results.SuccessDataResult;
import com.gokhanbilgin.core.utilities.results.SuccessResult;
import com.gokhanbilgin.dataAccess.abstracts.JobTitleDao;
import com.gokhanbilgin.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll();
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if (this.jobTitleDao.existsJobTitleByTitle(jobTitle.getTitle())) {
			return new ErrorResult("İş pozisyonu zaten var.");
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("İş pozisyonu eklendi.");
	}

	@Override
	public DataResult<JobTitle> findByTitle(String title) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.findByTitle(title), "İş pozisyonu bulundu.");
	}

}
