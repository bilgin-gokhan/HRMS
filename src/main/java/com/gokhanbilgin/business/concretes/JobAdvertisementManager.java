package com.gokhanbilgin.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhanbilgin.business.abstracts.JobAdvertisementService;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.ErrorResult;
import com.gokhanbilgin.core.utilities.results.Result;
import com.gokhanbilgin.core.utilities.results.SuccessDataResult;
import com.gokhanbilgin.core.utilities.results.SuccessResult;
import com.gokhanbilgin.dataAccess.abstracts.JobAdvertisementDao;
import com.gokhanbilgin.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),
				"Tüm iş ilanları listelendi.");
	}

	@Override
	public Result setJobAdvertisementPassive(int id) {
		JobAdvertisement jobAdv = this.jobAdvertisementDao.getById(id);
		if (jobAdv.isActive()) {
			jobAdv.setActive(false);
			this.jobAdvertisementDao.save(jobAdv);
			return new SuccessResult("İş ilanı kapatıldı.");
		} else {
			return new ErrorResult("İş ilanı zaten kapalı.");
		}
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByIsActiveTrue(),
				"Tüm aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreatedAt() {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findByIsActiveTrueOrderByCreatedAt(),
				"Tüm aktif iş ilanları tarihe göre listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueAndByEmployer(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findByIsActiveTrueAndByEmployer(id),
				"Bir firmaya ait tüm aktif iş ilanları listelendi.");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi");
	}

}
